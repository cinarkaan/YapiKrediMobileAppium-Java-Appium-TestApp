import Base.Android;
import PageObject.Atm;
import PageObject.DirectionsToAtm;
import PageObject.YapiKrediMobile;

public class StepDefinition {

    public static void main(String[] args) throws Exception {

        Android android = new Android();

        YapiKrediMobile yapiKrediMobile = new YapiKrediMobile(android.getAndroidDriver());

        Atm atm = new Atm(android.getAndroidDriver());

        DirectionsToAtm directionsToAtm = new DirectionsToAtm(android.getAndroidDriver());

        System.out.println("YKM application will be opened");

        yapiKrediMobile.openApp();

        Thread.sleep(3500);

        System.out.println("Clicked atm from menu");

        yapiKrediMobile.clickAtm();

        System.out.println("Selected nearest atm from list");

        atm.getNearestAtm();

        Thread.sleep(1000);

        System.out.println("Check alert message then clicked okey");

        atm.checkAtmRecord();

        System.out.println("Select atm from upper menu");

        atm.selectAtm();

        System.out.println("Search button will be clicked bottom on page");

        atm.clickSearchButton();

        System.out.println("Select city from selectBox");

        atm.setSelectCity();

        System.out.println("Ankara will be selected from selectBox");

        atm.setSearchBox("Ankara");

        atm.apply();

        System.out.println("Atm list will be opened");

        directionsToAtm.clickAtmList();

        System.out.println("Third atm will be selected");

        directionsToAtm.clickThirdAtm();

        System.out.println("Atm address will be printed");

        directionsToAtm.getAtmAddress();

    }

}
