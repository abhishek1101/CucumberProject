package net.serenity.cucumber.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenity.cucumber.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps user;

    @Given("user launches '(.*)' browser")
    public void givenUserLaunchesBrowser(String browserName) {
    	if(browserName.toUpperCase().equals("CHROME")) {
    		user.launchChromeBrowser();
    	}
    }
    
    @When("user navigates using URL '(.*)'")
    public void whenUserNavigatesUsingUrl(String url) {
    	user.navigateToUrl(url);
    }
    
    @Then("user clicks on the link '(.*)'")
    public void thenUserClicksOnTheLink(String link) {
        user.clicksOnLinkByText(link);
    }
    
    @And("user closes all the open browsers")
    public void andUserClosesAllTheOpenBrowsers() {
        user.closeAllBrowsers();
    }

}
