import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Criminal on 4/26/15.
 */
public class Pages {
    WebDriver driver;
    public Pages page = null;


    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement US;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement world;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement politics;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement Tech;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement health;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement entertainment;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement living;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement travel;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement money;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement sports;



}

