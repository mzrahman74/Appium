package Tutorial ;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {

    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Xpath //rahulintutor@gmail.com

        //tagname[atribue ='value']

        // tagname = class name from the atribute

        driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();

        driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("helo");
        driver.findElementsByClassName("android.widget.Button").get(1).click();
        driver.closeApp();

    }
}