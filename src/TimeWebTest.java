import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TimeWebTest extends Helper {
    @Test
    public void firstTest() throws InterruptedException {
        PageObjects page = new PageObjects();
        setUp();
        $(page.hosting).click(); //go to https://timeweb.com/ru/services/hosting

        //getting tariff values
        String tariffTitle = $(page.millenniumTitle).getText();
        String tariffSpace = $(page.millenniumSpace).getText();
        String tariffSites = $(page.millenniumSiteCount).getText();
        String tariffDb = $(page.millenniumDataBasesCount).getText();
        Assert.assertEquals("∞", tariffDb);
        String tariffPrice = $(page.millenniumPrice).getText();

        $(page.millenniumPurchaseBtn).sendKeys(Keys.ENTER);

        //registration
        $(page.inputName).sendKeys("Syomshchikov Gleb Sergeevich");
        $(page.inputEmail).sendKeys("geritacey@gmail.com");
        $(page.checkboxAgreement).click();
        $(page.btnSubmit).click();

        //check in personal account
        $(page.closePopUp).should(appear);
        $(page.closePopUp).click();
        $(page.tariff).shouldBe(text(tariffTitle));
        $(page.sites).shouldHave(text(tariffSites));
        $(page.disks).shouldHave(text(tariffSpace));
        $(page.costPerMonth).shouldHave(text(tariffPrice));
        $(page.tariff).click();

        //check on tariff page
        $(page.siteCount).shouldBe(text(tariffSites));
        $(page.diskCount).shouldBe(text(tariffSpace));
        $(page.loadingCount).shouldBe(text("50"));
        $(page.dbCount).shouldBe(text("неограниченно"));
        $(page.ftpCount).shouldBe(text("50"));
        $(page.sqlLoadingCount).shouldBe(text("1000"));
        $(page.cost).shouldBe(text(tariffPrice));
    }
}
