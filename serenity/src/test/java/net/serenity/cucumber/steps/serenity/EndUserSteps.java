package net.serenity.cucumber.steps.serenity;

import net.serenity.cucumber.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EndUserSteps {

    DictionaryPage dictionaryPage;
    WebDriver driver;
    
    @Step
    public void launchChromeBrowser() {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");

    	
    	ChromeOptions options = new ChromeOptions();
    	//options.addArguments("--window-size=1920,1080");
    	options.addArguments("--window-position=0,0");

    	driver = new ChromeDriver(options);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @Step
	public void navigateToUrl(String url) {
		driver.get(url);		
	}

    @Step
	public void clicksOnLinkByText(String link) {
		driver.findElement(By.linkText(link)).click();
	}

	public void closeAllBrowsers() {
		driver.quit();
	}

	public void launchFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
    
    
    
    
}