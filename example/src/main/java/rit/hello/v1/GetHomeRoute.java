package rit.hello.v1;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.TemplateEngine;

public class GetHomeRoute implements Route {
  private final TemplateEngine templateEngine;

  public GetHomeRoute(final TemplateEngine templateEngine) {
    this.templateEngine = templateEngine;
  }

  @Override
  public Object handle(Request request, Response response) {
    final Map<String, Object> vm = new HashMap<>();
    vm.put("pageTitle", "Home");
    return templateEngine.render(new ModelAndView(vm, "home.ftl"));
  }
}
