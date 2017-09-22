import org.openqa.selenium.By;

public class PageObjects {

    //Header
    public By hosting = By.xpath("//a[text()='Хостинг']");

    //Hosting page
    public By millenniumTitle = By.xpath("//div[text()='Millennium+']");
    public By millenniumSpace = By.xpath("//td[4]/div/div[text()=' Gb места']/strong");
    public By millenniumSiteCount = By.xpath("//td[4]/div/div[text()=' сайтов / ftp акк.']/strong");
    public By millenniumDataBasesCount = By.xpath("//td[4]/div/div/div[text()=' баз данных']/strong");
    public By millenniumPrice = By.xpath("//td[4]/div/div/div/span[@class='price']/b");
    public By millenniumPurchaseBtn = By.xpath("//a[@rel='millennium']");

    //Pop-up
    public By inputName = By.xpath("//div[15]/form/div/div/div/div/input[@name='full_name']");
    public By inputEmail = By.xpath("//div[1]/div/div/div/div/input[@name='email']");
    public By checkboxAgreement = By.xpath("//label[@for='c4']");
    public By btnSubmit = By.xpath("//div[15]/form/div/div/div/div/a[text()='Заказать']");

    //Personal Account
    public By closePopUp = By.xpath("//button[@type='button'][@role='button']");
    public By costPerMonth = By.xpath("//p[@class='cpS-h-XS']");
    public By disks = By.xpath("//ul/li[1]/span[@class='tariff-info-count-all']");
    public By sites = By.xpath("//ul/li[2]/span[@class='tariff-info-count-all']");
    public By tariff = By.xpath("//a[@class='cpS-color-accent cpS-lk-alt']");

    //Tariff page
    public By cost = By.id("cost_total");
    public By siteCount = By.id("count_sites");
    public By diskCount = By.id("count_disk");
    public By loadingCount = By.id("count_loading");
    public By dbCount = By.id("count_db");
    public By ftpCount = By.id("count_ftp");
    public By sqlLoadingCount = By.id("count_loading_sql");
}