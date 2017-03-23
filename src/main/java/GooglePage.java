import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GooglePage extends BasePage{

    public String googlePageURL = "http://google.com";
    public WebElement googlePageSearchField = $(By.xpath(".//*[@id='lst-ib']"));
    public WebElement googlePageSearchButton = $(By.xpath(".//*[@id='_fZl']"));

    //    GooglePage methods:
    public void goToGooglePage(){
        getSystemProperty();
        open(googlePageURL);
    }

    public void typeSearchField(String searchText){
        googlePageSearchField.clear();
        googlePageSearchField.sendKeys(searchText);
    }

    public void clickOnSearchButton(){
        googlePageSearchButton.click();
    }



}
