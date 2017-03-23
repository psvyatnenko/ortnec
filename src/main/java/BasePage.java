import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BasePage {

    public void getSystemProperty() {
        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Ortnec\\src\\chromedriver.exe");

        System.setProperty("selenide.browser", "Chrome");
        System.setProperty("selenide.timeouts", "20000");
    }

    public void pageRefresh(){
        getWebDriver().navigate().refresh();
    }


}
