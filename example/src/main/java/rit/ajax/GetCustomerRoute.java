package rit.ajax;

import com.google.gson.Gson;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 *
 * @author <a href='mailto:bdbvse@rit.edu'>Bryan Basham</a>
 */
public class GetCustomerRoute implements Route {

  private final Gson gson;

  public GetCustomerRoute(final Gson gson) {
    this.gson = gson;
  }

  @Override
  public Object handle(Request request, Response response) {
    // TODO: add database lookup code
    return gson.toJson(new Customer(47, "Fred"));
  }
  // JSON would be: {id:47, name:"Fred"}
}
