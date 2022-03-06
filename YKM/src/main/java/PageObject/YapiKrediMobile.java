package PageObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class YapiKrediMobile {

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Yapı Kredi Mobil\"]")
    private AndroidElement ykm;

    @AndroidFindBy(id = "com.ykb.android:id/nonsecure_onboarding_welcome_bottom_menu_atm")
    private AndroidElement atm;

    public YapiKrediMobile(AndroidDriver androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public void openApp () {
        ykm.click();
    }

    public void clickAtm () {
        atm.click();
    }

}
