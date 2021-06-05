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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Page_Streetlogix/div_Budget Planner'))

WebUI.setText(findTestObject('Object Repository/Page_Streetlogix/input_Annual budget_MuiInputBase-input-432 _7d9e17'), '123,456,789')

WebUI.click(findTestObject('Object Repository/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Page_Streetlogix/span_Table'))

//WebUI.click(findTestObject('Object Repository/Page_Streetlogix/td_123,405,315'))
//
//Cost = WebUI.getText(findTestObject('Object Repository/Page_Streetlogix/td_123,405,315'))
//
//WebUI.verifyLessThanOrEqual(Cost, 123,456,789)
WebUI.click(findTestObject('Object Repository/Page_Streetlogix/td_94.78'))

ConditionIndexValue = WebUI.getText(findTestObject('Object Repository/Page_Streetlogix/td_94.78'))

WebUI.verifyMatch(ConditionIndexValue, '94.78', false)

WebUI.click(findTestObject('Object Repository/Page_Streetlogix/span_Discard'))

WebUI.closeBrowser()

