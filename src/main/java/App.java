import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.sun.org.apache.xpath.internal.operations.Mod;
import models.*;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {
    public static void main(String[] args) {
//        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        // the route for myheros:
        post("/myheros", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "myheros.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
