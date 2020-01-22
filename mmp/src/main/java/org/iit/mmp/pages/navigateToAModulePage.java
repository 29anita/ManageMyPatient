package org.iit.mmp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class navigateToAModulePage {
	
	WebDriver driver;

	public navigateToAModulePage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void navigateToAmodule(String modName) {
		driver.findElement(By.xpath("//span[contains(text(),'" + modName + "')]")).click();

	}

}
