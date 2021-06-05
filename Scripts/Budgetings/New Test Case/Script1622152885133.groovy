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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8081/?config=9c338e84e55940e4ba48a09e9f5aef32&url=https://streetlogix-dev-server.herokuapp.com&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAyNiwibmFtZSI6IlNocnV0aWthIFNhd2FudCIsImV4cCI6MTYyNTE0NTg3OCwiaWF0IjoxNjIyNTUzODc4fQ.POgkLFvCqR7E6JYU2TwC2uM8N0EngJqT9qWnUU_7vwA')

WebUI.click(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/div_Repair Priority Editor'))

WebUI.click(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/td_5'))

String weight1 = WebUI.getText(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/td_5'))

WebUI.verifyMatch(weight1, '5', false)

WebUI.click(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/td_Functional Class'))

WebUI.click(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/button_ASC_MuiButtonBase-root-331 MuiIconBu_2ee1c3'))

WebUI.sendKeys(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'), 
    '7')

WebUI.click(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/button_ASC_MuiButtonBase-root-331 MuiIconBu_2ee1c3'))

WebUI.click(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/td_7'))

String weight2 = WebUI.getText(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/td_7'))

WebUI.verifyMatch(weight2, '7', false)

WebUI.click(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/span_Reset'))

WebUI.click(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/td_5'))

String weight3 = WebUI.getText(findTestObject('Object Repository/Repair_Priority_Editor/Page_Streetlogix/td_5'))

WebUI.verifyMatch(weight3, '5', false)

WebUI.verifyEqual(weight1, weight3)

WebUI.closeBrowser()

