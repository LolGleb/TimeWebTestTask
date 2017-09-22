import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class Helper {
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.timeout = 10000;
        open("https://timeweb.com/ru/");
    }
}