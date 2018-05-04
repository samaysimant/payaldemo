package com.samapti.learning.seleniumtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.samapti.learning.seleniumtest.pageobjects.FacebookRegistrationPage;

import junit.framework.Assert;

public class WindowsTest extends BaseClass {
	
	FacebookRegistrationPage registrationPage;

	@Test
	public void validateGogle() {
		
		driver.get("http://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Twitter')]")).click();
		
//		 Object[] currentWindow = driver.getWindowHandles().toArray();
//		 
//		 String parentWindow=currentWindow[0].toString();
//		 String childWindow=currentWindow[1].toString();
		
		 System.out.println("Current url before swicth:"+ driver.getCurrentUrl());
//		 driver.switchTo().window(childWindow);
		 super.switchWindow(1);
		 System.out.println("Current url of child:"+ driver.getCurrentUrl());
		 super.switchWindow(0);
//		 driver.switchTo().window(parentWindow);
		 System.out.println("Current url of parent:"+ driver.getCurrentUrl());
	
	}
}
