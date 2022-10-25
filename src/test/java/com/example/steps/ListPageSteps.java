package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class ListPageSteps extends BaseTest {

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

  @And("user long press on {string} button for {int} second")
  public void userLongPressOnButtonForSecond(String arg0, int duration) {
    listPage.longPress(duration);
  }

  @Then("pop up message contain {string} will appear")
  public void popUpMessageContainWillAppear(String popUp) {
    Assertions.assertEquals(popUp,listPage.popUpNotification()); //this assertions running successfully on multiple tap scenario, but it's fail on long press scenario
  }

  @And("user tap on {string} button for {int} times")
  public void userTapOnButtonForTimes(String arg0, int tap) {
    listPage.tapMultipleTimes(tap);
  }

}
