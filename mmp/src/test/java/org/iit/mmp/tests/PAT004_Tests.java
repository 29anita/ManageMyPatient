  
package org.iit.mmp.tests;

import org.iit.mmp.pages.enterSymptomsPage;
import org.iit.mmp.pages.navigateToAModulePage;
import org.iit.mmp.pages.selectApptPage;
import org.iit.mmp.pages.selectDoctorPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PAT004_Tests {
	WebDriver driver;

	@Test
	/*
	 * validateScheduleAppointmenttab is used to Schedule a doctor appointment. 
	 * the navigateToaModule is to select the required link from the web page. 
	 * the selectDoctor method is to select the required doctor. 
	 * the selectApptDatenTime is to select the date and time of the appointment. 
	 * the enterSymptoms method is to enter they symptoms of the illness.
	 */

	public void validateScheduleAppointmenttab() {
		
		navigateToAModulePage mod1 = new navigateToAModulePage(driver);
		mod1.navigateToAmodule("Schedule Appointment");

		selectDoctorPage dr1 = new selectDoctorPage(driver);
		dr1.selectDoctor("Dr.Smith");

		selectApptPage appt1 = new selectApptPage(driver);
		appt1.selectApptDatenTime("15/March/2020", "10Am");

		enterSymptomsPage symp1 = new enterSymptomsPage(driver);
		symp1.enterSymptoms("High Fever, Cough and Cold. ");
		
	}
}