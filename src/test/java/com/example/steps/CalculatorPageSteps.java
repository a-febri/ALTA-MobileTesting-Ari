package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorPageSteps extends BaseTest {

    @When("user input first number is {int}")
    public void userInputFirstNumberIs(int number1) {
        calculatorPage.inputFirstNumber(number1);
    }
    @And("user input second number is {int}")
    public void userInputSecondNumberIs(int number2) {
        calculatorPage.inputSecondNumber(number2);
    }
    @Then("the result is {int}")
    public void theResultWillAppear(int result) {
        String resultText = "Hasil : " + result;
        Assertions.assertEquals(resultText, calculatorPage.getResult());
    }
    @Then("the result is {string}")
    public void theResultIs(String nan) {
        String resultText = "Hasil : " + nan;
        Assertions.assertEquals(resultText, calculatorPage.getResult());
    }
    @And("user click on dropdown button")
    public void userClickOnDropdownButton() {
        calculatorPage.clickDropdownButton();
    }
    @And("user select subtraction sign")
    public void userSelectMinusSign() {
        calculatorPage.selectSubtractionSign();
    }
    @And("user select division sign")
    public void userSelectDivisionSign() {
        calculatorPage.selectDivisionSign();
    }
    @And("user select multiplication sign")
    public void userSelectMultiplicationSign() {
        calculatorPage.selectMultiplicationSign();
    }
    @And("click equal button")
    public void clickEqualButton() {
        calculatorPage.clickEqualButton();
    }

    @When("user empty first number field")
    public void userEmptyFirstNumberField() {
        calculatorPage.emptyFirstNumber();
    }

    @And("user empty second number field")
    public void userEmptySecondNumberField() {
        calculatorPage.emptySecondNumber();
    }

    @Then("the equal button can't be clicked")
    public void theEqualButtonCanTBeClicked() {
//        Assertions.assertEquals(true,calculatorPage.equalButtonDisable());
        Assertions.assertTrue(calculatorPage.equalButtonDisable()); //this step will fail due to app crash
    }


}
