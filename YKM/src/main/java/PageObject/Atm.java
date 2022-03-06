package PageObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class Atm {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]")
    private AndroidElement nearestAtm;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"ATM\"]")
    private AndroidElement selectAtmBranch;

    @AndroidFindBy(id = "com.ykb.android:id/alertViewDialogMessage")
    private AndroidElement alertMessage;

    @AndroidFindBy(id = "com.ykb.android:id/baseButtonStyle_textView")
    private AndroidElement okAlert;

    @AndroidFindBy(id = "com.ykb.android:id/nearestykb_floating_search_button")
    private AndroidElement searchButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    private AndroidElement selectCity;

    @AndroidFindBy(id = "com.ykb.android:id/editText")
    private AndroidElement searchBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout")
    private AndroidElement city;

    @AndroidFindBy(id = "com.ykb.android:id/nearestykb_sc_button_apply_filter")
    private AndroidElement applyFilter;

    public Atm(AndroidDriver androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public void getNearestAtm () {
        nearestAtm.click();
    }

    public void checkAtmRecord () {
        Assert.assertEquals("Görüntülenecek kayıt bulunmamaktadır.",alertMessage.getText());
        okAlert.click();
    }

    public void selectAtm () {
        selectAtmBranch.click();
    }

    public void clickSearchButton () {
        searchButton.click();
    }

    public void setSelectCity () {
        selectCity.click();
    }

    public void setSearchBox (String city) {
        searchBox.sendKeys(city);
        this.city.click();
    }

    public void apply () {
        applyFilter.click();
    }
}

