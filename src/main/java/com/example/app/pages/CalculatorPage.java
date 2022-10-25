package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }
  public void inputFirstNumber(int number1) {
    type(MobileBy.id("com.isl.simpleapp:id/et_1"), String.valueOf(number1));}
  public void inputSecondNumber(int number2) {
    type(MobileBy.id("com.isl.simpleapp:id/et_2"), String.valueOf(number2));}

  public void clickDropdownButton(){
    click(MobileBy.id("com.isl.simpleapp:id/spinner_1"));
  }
  public void selectSubtractionSign(){
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
  }
  public void selectDivisionSign(){
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"));
  }
  public void selectMultiplicationSign(){
    click(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]"));
  }
  public void clickEqualButton(){
    click(MobileBy.id("com.isl.simpleapp:id/acb_calculate"));
  }
  public String getResult(){
    return getText(MobileBy.id("com.isl.simpleapp:id/tv_result"));
  }
  public void emptyFirstNumber(){
    emptyField(MobileBy.id("com.isl.simpleapp:id/et_1"));
  }
  public void emptySecondNumber(){
    emptyField(MobileBy.id("com.isl.simpleapp:id/et_2"));
  }
  public boolean equalButtonDisable(){
    AndroidElement element = find(MobileBy.id("com.isl.simpleapp:id/acb_calculate"));
    if (element.isEnabled()){
      return false;
    }
    else {return true;
    }}
}
