package org.iit.mmp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class enterSymptomsPage {
	WebDriver driver;

	public enterSymptomsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterSymptoms(String symptoms) {
		driver.findElement(By.xpath("//textarea[@id='sym']")).sendKeys(symptoms);
		driver.findElement(By.xpath(
				"//body/div[@class='site-holder']/div[@class='box-holder']/div[@class='content']/div[@class='row']/div[@class='col-md-6']/div[@class='panel panel-cascade']/div/input[1]"))
				.click();

	}

}