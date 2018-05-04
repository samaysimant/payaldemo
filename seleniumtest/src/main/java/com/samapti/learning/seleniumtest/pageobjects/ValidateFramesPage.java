package com.samapti.learning.seleniumtest.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidateFramesPage {
	WebDriver driver;

	public ValidateFramesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//iframe")
	private WebElement frame1;

	public void enterFrame() {
		driver.switchTo().frame(frame1);
	}

	@FindBy(className = "phone-menu-right-side")
	private WebElement btn1;

	public void clickButton() {
		btn1.click();
	}

	@FindBy(xpath = "//ul[@id='menu-page-menu-1']/li/div/a")
	private List<WebElement> listofheadlines;

	public void printHeadlines(){
		for (int i = 0; i < listofheadlines.size(); i++) {
			System.out.println(listofheadlines.get(i).getText()); 
	}
	}
	
	@FindBy(xpath= "//div[@class='webinar_height']/h4")
	private WebElement title;
	public String printTitle(){
			return title.getText();
		}
}

