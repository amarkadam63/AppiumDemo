package scenarios;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;


public class AndroidSetup {

    static AndroidDriver driver;

    public static void main(String ...v) throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "4.1.2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("deviceName", "F3116");
        capabilities.setCapability("app", new File( "apps/flipkart.apk" ).getAbsolutePath());
        capabilities.setCapability("appPackage", "com.flipkart.android");
        capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

    }
}
