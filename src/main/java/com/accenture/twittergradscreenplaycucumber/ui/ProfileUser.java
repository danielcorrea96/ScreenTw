package com.accenture.twittergradscreenplaycucumber.ui;

import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

public class ProfileUser extends PageObject {
		public static final Target list	 = Target.the("List Tweets").locatedBy("//p[@class=\"TweetTextSize TweetTextSize--normal js-tweet-text tweet-text\"]");
		public static final Target Delete = Target.the("Delete").locatedBy("(//button[@class=\"ProfileTweet-actionButton u-textUserColorHover dropdown-toggle js-dropdown-toggle\"])[1]");
		public static final Target Delete2 = Target.the("Delete tweet").locatedBy("//ul[contains(@tabindex,'-1')]//button[contains(@type,'button')][contains(text(),'Eliminar Tweet')]");
		public static final Target Delete3 = Target.the("Delete tweet").locatedBy("//button[@class='EdgeButton EdgeButton--danger delete-action']");
}
