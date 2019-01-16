package com.accenture.twittergradscreenplaycucumber.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class ExceptionsClass  extends SerenityManagedException{
	 	public static final String MESSAGE_FAILED_OPEN_BROWSER = "Fallo abriendo el navegador";
	    public static final String MESSAGE_FAILED_LOGIN_TWITTER = "Fallo login twitter";
	    public static final String MESSAGE_FAILED_TWITTEAR = "Fallo al realizar un tweet.";

	public ExceptionsClass(String message, Throwable testErrorException) {
		super(message, testErrorException);
		// TODO Auto-generated constructor stub
	}

}
