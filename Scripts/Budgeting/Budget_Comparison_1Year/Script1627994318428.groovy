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

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/div_Compare Scenarios'))

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/label_Filter by'))

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Page_Streetlogix/div_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/li_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/label_Program duration'))

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Page_Streetlogix/div_Program Duration'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/li_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/label_Number of scenarios'))

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Page_Streetlogix/div_Number of Scenarios'))

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Page_Streetlogix/li_2Scenario'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/span_Edit'))

WebUI.sendKeys(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/input_Scenario Name1'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/input_Scenario Name1'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Budgeting/Compare_Scenario_1Year/Page_Streetlogix/input_Scenario Name1'), 'Test1')

WebUI.sendKeys(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/input_Scenario Name2'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/input_Scenario Name2'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Budgeting/Compare_Scenario_1Year/Page_Streetlogix/input_Scenario Name2'), 'Test2')

WebUI.setText(findTestObject('Budgeting/Compare_Scenario_1Year/Page_Streetlogix/input_1'), '1223467')

WebUI.setText(findTestObject('Budgeting/Compare_Scenario_1Year/Page_Streetlogix/input_2'), '12345678')

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/canvas_Go back to options_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/div_Save as JPEG'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/div_Save as PNG'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/span_Go back to options'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Page_Streetlogix/h1_Compare Scenarios'))

