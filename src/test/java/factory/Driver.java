package factory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.http.HttpClient;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Driver {


    public final String appiumServerUrl = "http://localhost:4723/wd/hub";

    public AndroidDriver createAndroidDriver(Capabilities capabilities) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        URL serverURL = URI.create(appiumServerUrl).toURL();
        options.merge(capabilities);

        options.setPlatformName("Android")
                .setDeviceName("Medium Phone API 36.1")
                .setPlatformVersion("16.0");


        return new AndroidDriver(serverURL, options);
    }
}
