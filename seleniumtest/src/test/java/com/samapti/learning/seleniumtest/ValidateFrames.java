package com.samapti.learning.seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.samapti.learning.seleniumtest.pageobjects.ValidateFramesPage;

import junit.framework.Assert;

public class ValidateFrames extends BaseClass {

	ValidateFramesPage framesValidate;
	@Test(groups="regr")
	public void validateFrames() {
		
		framesValidate=new ValidateFramesPage(driver);

		driver.get("http://5elementslearning.com/iframe-practice-page.php");
		/*WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);*/
		framesValidate.enterFrame();

		//driver.findElement(By.className("phone-menu-right-side")).click();
		framesValidate.clickButton();

		/*List<WebElement> menuItems = driver.findElements(By.xpath("//ul[@id='menu-page-menu-1']/li/div/a"));
		System.out.println("****************************************");
		System.out.println("   The Number of Menu Items are:   " + menuItems.size());
		System.out.println("****************************************");
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.println(menuItems.get(i).getText());
		}*/
		framesValidate.printHeadlines();
		driver.switchTo().defaultContent();
		//String bodyTitle = driver.findElement(By.xpath("//div[@class='webinar_height']/h4")).getText();
		String bodyTitle=framesValidate.printTitle();
		System.out.println("Body Title is: " + bodyTitle);
	}
}
