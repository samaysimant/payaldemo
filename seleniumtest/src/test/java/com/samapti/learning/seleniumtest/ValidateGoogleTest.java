package com.samapti.learning.seleniumtest;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ValidateGoogleTest extends BaseClass {

	@Test(groups={"smoke","regr"})
	public void validateGogle() {

		driver.get("https://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());

		Assert.assertTrue(driver.getCurrentUrl().contains("co.in"));
	}
}
