import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class OrtnecTests extends GooglePage {

    private String searchText = "Ortnec"; // Initialize and assign a value to string variable searchText.

    ResultsPage rp = new ResultsPage(); // Create object of ResultPage class.

    @Test
    public void test(){
        goToGooglePage(); // open GooglePage.
        typeSearchField(searchText); // Type search text in search field.
        clickOnSearchButton(); // Click on search button.
        rp.checkLinkToOrtnecCiteIsTop(); // Check link to Ortnec cite is top.
//        System.out.println(rp.topResultCite);
//        This block clicks on each link and checks that search text is displayed on page:
        for (int i=0; i<10; i++){
//            define i-link from result table:
            SelenideElement result = $$(By.xpath(".//*[@class='g']")).get(i).$(By.xpath(".//*[@class='r']"));
            result.click(); // Click on i-link from result table.
//            Find search text on page and check that it's displayed:
            rp.textOrtnec.shouldBe(visible);
            getWebDriver().navigate().back(); // go to back on result page.
        }
    }


}
