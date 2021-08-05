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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/div_Compare Scenarios'))

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/div_No Filter'))

List<WebElement> listLayers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/ul_filtercategory'), 30)

for(filter in listLayers) {
	if(filter.getProperties()['text'] == "Functional Class") {
		filter.click()
	}
}

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/div_Other princ arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/li_Other princ arterial'))

WebUI.setText(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/input_default_scenario_MuiInputBase-input-4_e786f5'), 
    '1,234,567')

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/canvas_Go back to options_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/span_Go back to options'))

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/div_Other princ arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/li_Principal Arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/canvas_Go back to options_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/span_Go back to options'))

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/div_Other princ arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/li_Majorurb collector'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/canvas_Go back to options_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/span_Go back to options'))

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/div_Other princ arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/li_Minor Arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/canvas_Go back to options_canvasjs-chart-canvas_1_2_3'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/span_Go back to options'))

WebUI.click(findTestObject('Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/div_Other princ arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/li_Local'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/canvas_Go back to options_canvasjs-chart-canvas_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/span_Go back to options'))

WebUI.click(findTestObject('Object Repository/Budgeting/Compare_Scenario_1Year/Compare_Scenario_Functional_Class/Page_Streetlogix/h1_Compare Scenarios'))

