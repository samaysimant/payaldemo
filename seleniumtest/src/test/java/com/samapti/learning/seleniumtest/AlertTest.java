package com.samapti.learning.seleniumtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.samapti.learning.seleniumtest.pageobjects.FacebookRegistrationPage;

public class AlertTest extends BaseClass {
	
	FacebookRegistrationPage registrationPage;

	@Test
	public void validateGogle() throws InterruptedException {
		
		driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		System.out.println("text is :"+ alert.getText());
		Thread.sleep(2000);
		alert.sendKeys("samay simant barik");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
	}
}
