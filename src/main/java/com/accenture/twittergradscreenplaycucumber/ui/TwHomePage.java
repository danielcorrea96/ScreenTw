package com.accenture.twittergradscreenplaycucumber.ui;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://twitter.com/")

public class TwHomePage extends PageObject {
	public static final Target USERNAME = Target.the("User").locatedBy("//div[@class=\"\"]//input[@autocomplete=\"username\"]"); 
	public static final Target PASSWORD = Target.the("Password").locatedBy("//div[@class=\"\"]//input[@type=\"password\"]"); 
	public static final Target TW = Target.the("Twitter").locatedBy("//h2[@class='StaticLoggedOutHomePage-signupSubtitle']"); 

}
