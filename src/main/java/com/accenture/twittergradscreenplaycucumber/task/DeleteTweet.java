package com.accenture.twittergradscreenplaycucumber.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.twittergradscreenplaycucumber.ui.ProfileUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class DeleteTweet implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				WaitUntil.the(ProfileUser.Delete, isEnabled()),
				Click.on(ProfileUser.Delete),
						 Click.on(ProfileUser.Delete2),
						 Click.on(ProfileUser.Delete3)						
						);
	}
	
	public static DeleteTweet at () {
		return instrumented(DeleteTweet.class);		
	}

}
