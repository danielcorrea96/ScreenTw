package com.accenture.twittergradscreenplaycucumber.questions;

import java.util.List;

import com.accenture.twittergradscreenplaycucumber.ui.ProfileUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PublicTweet implements Question<String> {
	ProfileUser list;
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(list.list).viewedBy(actor).asList().get(0);
	}
	public static PublicTweet ofTweet() {
		return new PublicTweet();
	}
}
