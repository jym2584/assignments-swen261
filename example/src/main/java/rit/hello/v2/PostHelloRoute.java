package rit.hello.v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Session;
import spark.TemplateEngine;

public class PostHelloRoute implements Route {
  private final TemplateEngine templateEngine;

  public PostHelloRoute(final TemplateEngine templateEngine) {
    this.templateEngine = templateEngine;
  }

  @Override
  public Object handle(Request request, Response response) {
    final String name = request.queryParams("name");
    storeName(name, request.session());
    final Map<String, Object> vm = new HashMap<>();
    vm.put("pageTitle", "Greeting");
    vm.put("name", name);
    return templateEngine.render(new ModelAndView(vm, "greeting.ftl"));
  }

  private void storeName(String name, Session session) {
    List<String> names = session.attribute("names");
    if (names == null) {
      // Initialize it
      names = new ArrayList<>();
      session.attribute("names", names);
    }
    names.add(name);
  }

}
