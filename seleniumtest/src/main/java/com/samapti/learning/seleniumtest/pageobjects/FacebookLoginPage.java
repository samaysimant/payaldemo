package com.samapti.learning.seleniumtest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	WebDriver driver;

	public FacebookLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	public void mouseOverEmail() {
		new Actions(driver).moveToElement(email).build().perform();
	}

	@FindBy(xpath = "//div[@class='uiContextualLayer uiContextualLayerRight']/div/div")
	private WebElement emailText;

	public String getEmailText() {
		return emailText.getText();
	}
}
