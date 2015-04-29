import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by Criminal on 4/26/15.
 */
public class TechNewsContent extends Pages{
    @Test
    public void getTechNews(){
        clickByElement(Pages.Tech);
        String news = getTextBycss(".cd__description");
    }

}
