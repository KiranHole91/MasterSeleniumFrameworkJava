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
	
	@Test(priority = 2)
	public void verifyOpeningOfSegmentsPage() 
	{
		test = ExtentReportManager.createTest("Test Case to open Segments page.");   // to set the test case name in reports.
		notifications.openSegmentsPage();
		test.info("Click On Segments tab.");
		Assert.assertEquals(true, notifications.SegmentsPageHeader.isDisplayed(), "Segments page is opened.");
		test.pass("Segments page is opened successfully.");
	

	
	
	
	
	
	
	
	
	
	

}
