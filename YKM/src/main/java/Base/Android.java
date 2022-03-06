package Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Android {

    protected AndroidDriver androidDriver;
    protected DesiredCapabilities desiredCapabilities;

    public Android() throws MalformedURLException {
        this.desiredCapabilities = DesiredCapabilities.android();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 30");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        this.androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
    }

    public DesiredCapabilities getDesiredCapabilities () {
        return this.desiredCapabilities;
    }

    public AndroidDriver getAndroidDriver () {
        return this.androidDriver;
    }

    public void quitApp () {
        androidDriver.closeApp();
        androidDriver.quit();
    }

}
