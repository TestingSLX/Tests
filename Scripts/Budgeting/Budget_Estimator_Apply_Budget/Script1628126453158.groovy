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

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_Budget Estimator'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_No Filter'))

List<WebElement> listLayers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/ul_filterby'), 30)

for(filter in listLayers) {
	if(filter.getProperties()['text'] == "No Filter") {
		filter.click()
	}
}

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/label_Filter by'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/label_Program duration'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_Program_Duration'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/li_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/label_Target condition index'))

String CI = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_CI_text'))

String TCI = CI.replaceAll("[^0-9/s.]+|/.(?!/d)", "")

String stringCI = TCI.substring(0,4)

double doubleCI = stringCI.toDouble()

String targetCI = doubleCI.round() + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/input_Target condition index_MuiInputBase-i_43b0a5'), 
    targetCI)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/h6_Target condition index 67'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Budget'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Condition Index'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_1_estimator'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_21,082,298'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_67'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/span_Apply'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/h1_Budget Planner'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/canvas_Table_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/span_Table'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Year1'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Length (ft)1'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Cost1'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Condition Index Change1'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Average Condition Index1'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_1_planner'))

String length = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_68,231'))

String cost = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_21,032,172'))

String averageConditionIndex = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_67.02'))

String conditionIndexChange = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_-0.01'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/h3_from budget estimator'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_others'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/button_from budget estimator'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_from budget estimator (Features 86, Sel_93e6ac'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/button_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_Edit Scenario'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/div_Edit_Scenario'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/li_one'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/h2_Success'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/p_Scenario is saved'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/span_OK'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/span_Load'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_from budget estimator'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/canvas_Table_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/span_Table'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Year1'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Length (ft)1'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Cost1'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Average Condition Index1'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/th_Condition Index Change1'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_1_planner'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_68,231'), length)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_21,032,172'), cost)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_67.02'), averageConditionIndex)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/td_-0.01'), conditionIndexChange)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Apply_Budget/Page_Streetlogix/span_Discard'))

