package Tutorial;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiautomator extends basics {

    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement>	driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.findElementByAndroidUIAutomator("atribute(\"value\")")

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //driver.findElementsByAndroidUIAutomator("new UiSelector().property(value);

        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
        // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(text(\"WebView\"));");
    }

}