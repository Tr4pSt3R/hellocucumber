package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

class IsItFriday {
  static String isItFriday(String day) {
    if (day.equals("Friday")) {
      return "It's Friyay!";
    }
    return "No, it's not!";
  }
}

public class Stepdefs {
  private String today;
  private String result;

  @Given("^today is \"([^\"]*)\"$")
  public void today_is(String day) {
    this.today = day;
  }

  @When("^I ask whether it's Friday yet$")
  public void i_ask_whether_it_s_Friday_yet() {
    this.result = IsItFriday.isItFriday(today);
  }

  @Then("^I should be told \"([^\"]*)\"$")
  public void i_should_be_told(String expectedOutcome) {
    assertEquals(expectedOutcome, result);
  }
}
