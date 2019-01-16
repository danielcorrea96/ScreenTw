package com.accenture.twittergradscreenplaycucumber.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.twittergradscreenplaycucumber.exceptions.ExceptionsClass;
import com.accenture.twittergradscreenplaycucumber.model.LoginModel;
import com.accenture.twittergradscreenplaycucumber.ui.TweetProfile;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class TweetProfi implements Task {
	
	String Tweet;
	
	public TweetProfi(String tweet) {
		// TODO Auto-generated constructor stub
		this.Tweet = tweet;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		twittear(actor);		
	}
	
	private <T extends Actor> void twittear(T actor) {
		// TODO Auto-generated method stub
		try { 
			
			actor.attemptsTo(Click.on(TweetProfile.Tweet), 
					Enter.theValue(Tweet).into(TweetProfile.Text),
					Click.on(TweetProfile.Send),
					WaitUntil.the(TweetProfile.Image,isVisible()),
					Click.on(TweetProfile.Image),
					WaitUntil.the(TweetProfile.Profile,isCurrentlyEnabled()),
					Click.on(TweetProfile.Profile)
					);
			// Para agregar Cadenas de Texto en el reporte.
			Serenity.recordReportData().withTitle("Prueba Text en Step.").andContents("Esto es una prueba");
		} catch (Exception e) {
			throw new ExceptionsClass(ExceptionsClass.MESSAGE_FAILED_TWITTEAR, e);
		}
	}

	public static TweetProfi at (String Tweet) {
		return instrumented(TweetProfi.class, Tweet);		
	}


}
