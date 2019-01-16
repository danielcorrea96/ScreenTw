package com.accenture.twittergradscreenplaycucumber.ui;

import net.serenitybdd.screenplay.targets.Target;

public class TweetProfile {
	public static final Target Tweet = Target.the("Tweet").locatedBy("//button[@id=\"global-new-tweet-button\"]//span"); 
	public static final Target Text = Target.the("Text").locatedBy("//div[@class='RichEditor RichEditor--emojiPicker is-fakeFocus']//div[@name='tweet']");
	public static final Target Send = Target.the("Send").locatedBy("//div[@id='Tweetstorm-tweet-box-0']//div[@class='TweetBoxToolbar-tweetButton']//button[@type='button']");
	public static final Target Alert = Target.the("Send").locatedBy("//span[contains(@class,'message-text')]");	
	public static final Target Image = Target.the("Send").locatedBy("//a[@id='user-dropdown-toggle']");
	public static final Target Profile	 = Target.the("Send").locatedBy("//a[@href=\"/DN_C96\"]//b[@class=\"fullname\"]");
}
