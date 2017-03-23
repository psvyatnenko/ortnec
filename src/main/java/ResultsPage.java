import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.xpath;

public class ResultsPage extends BasePage{

    public ElementsCollection resultTable = $$(By.cssSelector("#ires .g"));

    SelenideElement textOrtnec =$(By.xpath("html/body//*[contains( text(),'ortnec') or contains(text(),'Ortnec')]"));

//    This method checks that link to cite: http://ortnec.com is top:
    public void checkLinkToOrtnecCiteIsTop(){
        resultTable.get(0).shouldHave(text("ortnec.com/"));
    }

}
