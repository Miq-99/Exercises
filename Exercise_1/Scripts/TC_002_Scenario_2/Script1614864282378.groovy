import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType
import java.util.Date

/*=============================================================
	Created by Muhammad Iqbal (muhammad.iqbal.odn@gmail.com)
	Scripts created on Friday, March 05, 2021
=============================================================*/

WebUI.openBrowser('www.ebay.com')
scenario_2()
WebUI.closeBrowser()

private scenario_2() {
	
	String search_name		= 'MACBOOK'
	String categories_name 	= 'Computers/Tablets & Networking'
	
	WebUI.maximizeWindow()
	WebUI.setText(findTestObject('Object Repository/Scenario_2/Page_Electronics, Cars, Fashion, Collectibles  More  eBay/MIQ_field_search'), search_name)
	WebUI.click(findTestObject('Object Repository/Scenario_2/Page_Electronics, Cars, Fashion, Collectibles  More  eBay/MIQ_dropdown_categories'))
	
	TestObject categories = new TestObject('Object/Computers')
	categories.addProperty('value', ConditionType.EQUALS,'58058')
	WebUI.click(categories)
	
	WebUI.click(findTestObject('Object Repository/Scenario_2/Page_Electronics, Cars, Fashion, Collectibles  More  eBay/MIQ_button_search'))
	WebUI.waitForElementPresent(findTestObject('Object Repository/Scenario_2/Page_macbook in Computers, Tablets, and Networking  eBay/MIQ_valtext'), 5)
	String a = WebUI.getText(findTestObject('Object Repository/Scenario_2/Page_macbook in Computers, Tablets, and Networking  eBay/MIQ_valtext2'))
	a.contains(search_name)
	
}

