package com.samapti.learning.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	static WebDriver driver;

	@BeforeMethod(groups={"smoke","regr"})
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);

	}

	@AfterMethod(groups={"smoke","regr"})
	public void afterMethod() {
		driver.quit();

	}

	public void switchWindow(int windownum) {
		Object[] currentWindow = driver.getWindowHandles().toArray();

		driver.switchTo().window(currentWindow[windownum].toString());
	}

}
