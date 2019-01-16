package com.accenture.twittergradscreenplaycucumber.questions;

import com.accenture.twittergradscreenplaycucumber.ui.TwHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ContainsTwitter implements Question<String> {
	TwHomePage pag;
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(pag.TW).viewedBy(actor).asString();
	}
	
	public static ContainsTwitter ofTweet() {
		return new ContainsTwitter();
	}

}
