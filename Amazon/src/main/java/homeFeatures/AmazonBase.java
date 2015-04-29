package homeFeatures;

import baseApi.Base;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Criminal on 4/25/15.
 */
public class AmazonBase extends Base {

    List<String>manu = new ArrayList<String>();
    String[] list = {"All Departments","Baby","Books","Art & Games","Women","Men"};

    public void setItems(AmazonBase){
    }
    @Test
    public void searchItems()throws InterruptedException{
        List<String> listMenu = searchDropDownMenu("#searchDropdownBox option");
        displayText(manu);
        for(String item: manu){
            selectElementByVisibleText("#searchDropdownBox", item);
            sleepFor(2);
        }
    }
    public void searchDropDownMenu(String locater,String value){
        typeAndEnterByCss(locater, value);

    }

}
