package rit.hello.v1;

import static spark.Spark.*;
import spark.TemplateEngine;
import spark.template.freemarker.FreeMarkerEngine;

public class HelloApp {
  public static void main(String[] args) {
    final TemplateEngine templateEngine = new FreeMarkerEngine();
    get("/", new GetHomeRoute(templateEngine));
    post("/hello", new PostHelloRoute(templateEngine));
  }
}
