package steps;

import io.cucumber.java8.En;
import web.CalculatorPage;

import static de.p7s1.qa.sevenfacette.conditions.Have.text;
import static de.p7s1.qa.sevenfacette.driver.FDriver.open;


public class CalculatorSteps implements En {

    CalculatorPage calculatorPage = null;

    public CalculatorSteps() {

        When("^I divide \"([^\"]*)\" by \"([^\"]*)\"$", (String dividee, String divisee) -> {
            calculatorPage = open(CalculatorPage::new);
            calculatorPage.calculate(dividee, "/", divisee);
        });

        Then("^the result should be \"([^\"]*)\"$", (String result) -> {
            calculatorPage.result.shouldHave(text("5"));
        });



    }
}
