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

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Budget Planner'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Select layer'), 
    'Select layer')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_No Filter'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Filter by'), 
    'Filter by')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_1 year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_1 year'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Program duration'), 
    'Program duration')

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/input_Annual budget_MuiInputBase-input-434 _20011a'), 
    '123,456')

int budget = 123456

int budgetDifference = 10000

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Annual budget'), 
    'Annual budget')

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/input_Scenario name_MuiInputBase-input-434 _cdaff7_1_2_3_4_5'), 
    'ATest')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Scenario name'), 
    'Scenario Name')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/canvas_Table_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Table'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Length (ft)'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Cost'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Average Condition Index'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Condition Index Change'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_1'))

String Table1td1 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_1,515,630'))

String Table1td2 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_123,406,682'))

if(Math.abs(budget - Table1td2.replaceAll(",", "").toInteger()) <= budgetDifference) {
	println('Results from Budget Planner and Budgte Estimator are nearly same')
} else {
	throw new Exception('Budget Planner and Budget Estimator results have a huge difference')
}

String Table1td3 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_96.52'))

String Table1td4 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_29.48'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Chart'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/h3_Test'), 'ATest')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_others1'), 
    'others')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/button_Year'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/h3_Test2'), 'ATest')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Test'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Test (Features 1,192, Selected 0)'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/button_ExportCSV'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Export to CSV'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Edit Scenario Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Save'))

//WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/h2_Success'), "Success")
//WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Scenario is saved'), "Scenario is saved!")
WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/button_OK'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/h1_Budget Planner'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Load'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_1427'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Table'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Length (ft)'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Cost'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Average Condition Index'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Condition Index Change'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_1,515,630'), 
    Table1td1)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_123,406,682'), 
    Table1td2)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_96.52'), Table1td3)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_29.48'), Table1td4)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Discard'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_1 year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_5 years'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/button_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/button_Table'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Length (ft)'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Cost'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Average Condition Index'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Condition Index Change'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_2'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_3'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_4'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_5'))

String budget1 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_123,401,473'))

if(Math.abs(budget - budget1.replaceAll(",", "").toInteger()) <= budgetDifference) {
	println('Results from Budget Planner and Budgte Estimator are nearly same')
} else {
	throw new Exception('Budget Planner and Budget Estimator results have a huge difference')
}

String budget2 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_123,401,236'))

//if(Math.abs(budget - budget2.replaceAll(",", "").toInteger()) <= budgetDifference) {
//	println('Results from Budget Planner and Budgte Estimator are nearly same')
//} else {
//	throw new Exception('Budget Planner and Budget Estimator results have a huge difference')
//}

String budget3 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_2,503,717'))

//if(Math.abs(budget - budget3.replaceAll(",", "").toInteger()) <= budgetDifference) {
//	println('Results from Budget Planner and Budgte Estimator are nearly same')
//} else {
//	throw new Exception('Budget Planner and Budget Estimator results have a huge difference')
//}

WebUI.click(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Edit Scenario Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_1'))

WebUI.click(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Edit Scenario Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_2'))

WebUI.click(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Edit Scenario Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_3'))

WebUI.click(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Edit Scenario Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_4'))

WebUI.click(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Edit Scenario Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_5'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/button_Discard'))

