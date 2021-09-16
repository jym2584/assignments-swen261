package rit.ajax;

import static spark.Spark.*;

import com.google.gson.Gson;

public class AjaxSampleApp {
  public static void main(String[] args) {
    final Gson gson = new Gson();
    get("/customer", new GetCustomerRoute(gson));
  }
}
