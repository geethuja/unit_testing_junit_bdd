package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoAdditionNumberStep {

    int num1;
    int num2;
    int result;

    @Given("user has one number {int}")
    public void user_has_one_number(Integer number) {
        num1 = number;
    }

    @Given("user has second number {int}")
    public void user_has_second_number(Integer number) {
        num2 = number;
    }

    @When("user add number one and second")
    public void user_add_number_one_and_second() {
        result = num1 + num2;
    }

    @Then("the result is {int}")
    public void the_result_is(Integer expectedResult) {
        assertEquals(expectedResult.intValue(), result);
    }
}