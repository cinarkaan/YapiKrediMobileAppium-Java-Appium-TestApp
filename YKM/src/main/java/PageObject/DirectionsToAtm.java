package PageObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DirectionsToAtm {

    @AndroidFindBy(id = "com.ykb.android:id/nearestykb_floating_list_button")
    private AndroidElement atmList;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[3]")
    private AndroidElement thirdAtm;

    @AndroidFindBy(id = "com.ykb.android:id/nearestykb_detail_address")
    private AndroidElement atmAddress;

    public DirectionsToAtm (AndroidDriver androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public void clickAtmList () {
        atmList.click();
    }

    public void clickThirdAtm () {
        thirdAtm.click();
    }

    public void getAtmAddress () {
        System.out.println("Third Atm Address : " + atmAddress.getText());
    }

}
