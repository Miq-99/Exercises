import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.eclipse.jetty.websocket.server.MappedWebSocketCreator
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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.GetText
import internal.GlobalVariable as GlobalVariable
import java.lang.Integer as Integer

/*=============================================================
	Created by Muhammad Iqbal (muhammad.iqbal.odn@gmail.com)
	Scripts created on Friday, March 05, 2021
=============================================================*/

WebUI.openBrowser('www.ebay.com')
scenario_1()
WebUI.closeBrowser()

private scenario_1() {
	
	String start_idr	= findTestData('Exercise').getValue('start_price', 1)
	String end_idr		= findTestData('Exercise').getValue('end_price', 1)

	WebUI.maximizeWindow()
	WebUI.delay(3)
	WebUI.click(findTestObject('Object Repository/Scenario_1/Page_Electronics, Cars, Fashion, Collectibles  More  eBay/MIQ_butoon_shop_by_category'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/Scenario_1/Page_Electronics, Cars, Fashion, Collectibles  More  eBay/MIQ_link_cell_phone_accessories'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/Scenario_1/Page_Cell Phones, Smartphones, Smart Watches  Accessories for Sale - eBay/MIQ_link_cell_phone_smartphone'))
	WebUI.delay(2)
	WebUI.scrollToElement(findTestObject('Object Repository/Scenario_1/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/MIQ_button_more_refinement'), 2)
	WebUI.click(findTestObject('Object Repository/Scenario_1/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/MIQ_button_more_refinement'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/Scenario_1/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/MIQ_button_screen_size'))
	Mobile.delay(2)
	WebUI.click(findTestObject('Object Repository/Scenario_1/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/MIQ_check_box_3'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/Scenario_1/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/MIQ_button_price'))
	WebUI.delay(2)
	WebUI.setText(findTestObject('Object Repository/Scenario_1/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/MIQ_input_start_rank_idr'), start_idr)
	WebUI.delay(2)
	WebUI.setText(findTestObject('Object Repository/Scenario_1/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/MIQ_input_end_rank_idr'), end_idr)
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/Scenario_1/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/MIQ_button_item_location'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/Scenario_1/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/MIQ_radio_button_5'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/Scenario_1/Page_Cell Phones  Smartphones for Sale - Buy New  Used Phones - eBay/MIQ_button_apply'))
	WebUI.delay(2)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Scenario_1/Page_5.0 - 5.4 Inch Cell Phones  Smartphones for sale  eBay/MIQ_valtext_1'), 3)
	
	def a = WebUI.getText(findTestObject('Object Repository/Scenario_1/Page_5.0 - 5.4 Inch Cell Phones  Smartphones for sale  eBay/MIQ_valtext_2'))
	println 'Hasil = ' + a
	
	String b = (a.split('IDR')[1]).substring(0,9).trim()
	println 'hasil trim =' + b
		
	String [] money = b.split(',')
	println 'hasil1 = ' + money[0]
	println 'hasil2 = ' + money[1]
	println 'hasil3 = ' + money[2]
		
	String z = WebUI.concatenate([money[0],money[1],money[2]] as String[], FailureHandling.STOP_ON_FAILURE)
	println z
	
	def k = z.toInteger()
	def l = start_idr.toInteger()
	def p = end_idr.toInteger()
	
	if (k >= l && k <= p) {
		println 'Success'
	}
	else {
		println 'Failed'
	}
}















