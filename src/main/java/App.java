import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.sun.org.apache.xpath.internal.operations.Mod;
import models.*;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }

    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        // provide form for new heros
        get("/mysquad/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            request.session().attribute("squad", new ArrayList<>());
            return new ModelAndView(model, "mySquad-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/mysquad", (request, response) -> {

            Map<String, Object> model = new HashMap<>();

            Integer size = Integer.parseInt(request.queryParams("size"));
            String name = request.queryParams("name");
            String cause = request.queryParams("cause");

            List<Squad> list = request.session().attribute("squad");
            Squad squad = new Squad(size, name, cause);

            SquadT squadT = new SquadT();

            squadT.addSquad(list, squad);

            request.session().attribute("squad", squadT.getAllTask());

            model.put("squad", squadT.getAllTask());
//
            return  modelAndView(model,"mysquad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/mysquad",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Squad> list = new ArrayList<Squad>();
            model.put("squad",list);
            return new ModelAndView(model,"mysquad.hbs");
        },new HandlebarsTemplateEngine());

        // the route for myheros:
        get("/myheros/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            request.session().attribute("hero", new ArrayList<>());
            return new ModelAndView(model, "myheros-forms.hbs");
        }, new HandlebarsTemplateEngine());

        post("/myheros", (request, response) -> {

            Map<String, Object> model = new HashMap<>();

            String name = request.queryParams("name");
            Integer age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");

            List<Hero> list = request.session().attribute("hero");
            Hero hero = new Hero(name, age, power, weakness);
            HeroT heroT = new HeroT();

            heroT.addHero(list, hero);

            request.session().attribute("hero", heroT.getAllTask());

            model.put("hero", heroT.getAllTask());
//
            return  modelAndView(model,"myheros.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
