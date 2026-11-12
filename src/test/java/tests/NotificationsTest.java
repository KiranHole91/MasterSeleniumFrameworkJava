package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.NotificationsPage;
import utils.ExtentReportManager;

public class NotificationsTest extends BaseClass
{	
	public NotificationsPage notifications;
	

	@Test(priority = 1)
	public void verifyOpeningOfTemplatesPage() 
	{
		test = ExtentReportManager.createTest("Test Case to open Templates page.");   // to set the test case name in reports.
		notifications = new NotificationsPage(driver);
		notifications.openTemplatesPage();
		test.info("Click On Templates tab.");
		Assert.assertEquals(true, notifications.TemplatePageHeader.isDisplayed(), "Templates page is opened.");
		test.pass("Templates page is opened successfully.");
	}
	

	
	
	
	
	
	
	
	
	
	

}
