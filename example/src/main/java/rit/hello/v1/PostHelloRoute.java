package rit.hello.v1;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.TemplateEngine;

public class PostHelloRoute implements Route {
  private final TemplateEngine templateEngine;

  public PostHelloRoute(final TemplateEngine templateEngine) {
    this.templateEngine = templateEngine;
  }

  @Override
  public Object handle(Request request, Response response) {
    final Map<String, Object> vm = new HashMap<>();
    vm.put("pageTitle", "Greeting");
    vm.put("name", request.queryParams("name"));
    return templateEngine.render(new ModelAndView(vm, "greeting.ftl"));
  }

}
