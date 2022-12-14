package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class ListPage extends BasePageObject {

  public void swipeList() {
//    TouchAction action = new TouchAction(getDriver());
//    AndroidElement containerList = find(MobileBy.id("recycler_view"));
//    Point coordinate = containerList.getCenter();
//    PointOption start = PointOption.point(coordinate);
//    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
//    //builder
//    action
//        .press(start)
//        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//        .moveTo(end)
//        .release()
//        .perform();

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }
  public void longPress(int duration){
    TouchAction action = new TouchAction(getDriver());
    AndroidElement listKe4Button = find(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView"));
    action.longPress(PointOption.point(listKe4Button.getCenter()))
            .waitAction(WaitOptions.waitOptions(
                    Duration.of(duration, ChronoUnit.SECONDS))).release()
            .perform();
  }
  public void tapMultipleTimes(int tap){
    TouchAction action = new TouchAction(getDriver());
    AndroidElement listKe5Button = find(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView"));
    action.tap(TapOptions.tapOptions().withTapsCount(tap)
            .withElement(ElementOption.element(listKe5Button)))
            .perform();
  }
  public String popUpNotification(){
//    WebDriverWait wait = new WebDriverWait(driver,30,1000);
//    AndroidElement element = (AndroidElement)wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.Toast")));
//    return element.getText();
    return getText(By.xpath("/hierarchy/android.widget.Toast"));
  }
}
