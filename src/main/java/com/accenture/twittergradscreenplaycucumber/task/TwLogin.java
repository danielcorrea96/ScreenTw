package com.accenture.twittergradscreenplaycucumber.task;

import org.openqa.selenium.Keys;

import com.accenture.twittergradscreenplaycucumber.exceptions.ExceptionsClass;
import com.accenture.twittergradscreenplaycucumber.model.LoginModel;
import com.accenture.twittergradscreenplaycucumber.ui.TwHomePage;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TwLogin implements Task {
	private PageObject page2;
	LoginModel log;
	TwHomePage page;
	
	public TwLogin ( PageObject page, LoginModel log) {
		this.page2 = page;
		this.log = log;		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		login(actor);		
		
	}
	
	private <T extends Actor> void login(T actor) {
		// TODO Auto-generated method stub
		try {
			actor.attemptsTo(Open.browserOn(page));
			// Para agregar Imagenes al reporte.
			Path report = Paths.get("images\\580b57fcd9996e24bc43c53e" +  ".png");
			Serenity.recordReportData().withTitle("Twitter Logo").downloadable().fromFile(report);
			
		} catch (Exception e) {
			throw new ExceptionsClass(ExceptionsClass.MESSAGE_FAILED_OPEN_BROWSER, e);
		}
		
		try {
			
			actor.wasAbleTo(
					Check.whether(page.TW.resolveFor(actor).containsText("Twitter"))
					.andIfSo(Enter.theValue(log.getUser()).into(page.USERNAME).thenHit(Keys.TAB))
					.otherwise(Enter.theValue(log.getPass()).into(page.PASSWORD).thenHit(Keys.ENTER))					
					);	
					page.USERNAME.resolveFor(actor).clear();	
					actor.wasAbleTo(
							Enter.theValue(log.getUser()).into(page.USERNAME).thenHit(Keys.TAB),
							Enter.theValue(log.getPass()).into(page.PASSWORD).thenHit(Keys.ENTER)
							);			
	
		} catch (Exception e) {
			throw new ExceptionsClass(ExceptionsClass.MESSAGE_FAILED_LOGIN_TWITTER, e);
			
		}
		
	}

	public static TwLogin at (PageObject page, LoginModel log) {
		return instrumented(TwLogin.class, page, log);		
	}

}
