package com.accenture.twittergradscreenplaycucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.accenture.twittergradscreenplaycucumber.model.LoginModel;
import com.accenture.twittergradscreenplaycucumber.questions.PublicTweet;
import com.accenture.twittergradscreenplaycucumber.task.DeleteTweet;
import com.accenture.twittergradscreenplaycucumber.task.TwLogin;
import com.accenture.twittergradscreenplaycucumber.task.TweetProfi;
import com.accenture.twittergradscreenplaycucumber.ui.TwHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.*;

public class TwStepDefinitions {
	
	@Managed() private WebDriver driver;
	private Actor dn = Actor.named("Daniel");
	private TwHomePage Twitter;
	@Before
	public void setup() {
		dn.can(BrowseTheWeb.with(driver));
	}	
	
	@Given("^that you access the Twitter page and enter the credentials of '(.*)' and '(.*)'$")
    public void thatYouAccessTheTwitter(String user, String pass) throws Throwable {        
		dn.wasAbleTo(TwLogin.at(Twitter, new LoginModel(user,pass)));		
    }
	
	@When("^you proceed to make a tweet '(.*)'$")
	public void youProceedToMakeATweet(String prueba) throws Throwable {
		dn.attemptsTo(TweetProfi.at(prueba));
		
		
	}
	@Then("^you should see the tweet in the profile '(.*)'$")
	public void youShouldSeeTheTweetInTheProfileDNC96(String user) throws Throwable {
	        dn.should(eventually(seeThat(PublicTweet.ofTweet(), equalTo(user))));
	        dn.attemptsTo(DeleteTweet.at());
	}


}
