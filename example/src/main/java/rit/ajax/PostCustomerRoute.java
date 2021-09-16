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
public class PostCustomerRoute implements Route {

  private final Gson gson;

  public PostCustomerRoute(final Gson gson) {
    this.gson = gson;
  }

  @Override
  public Object handle(Request request, Response response) {
    final String customerJSON = request.body();
    final Customer customer =
        gson.fromJson(customerJSON, Customer.class);
    // TODO: add database insert code
    return "Customer saved.";
  }
}
