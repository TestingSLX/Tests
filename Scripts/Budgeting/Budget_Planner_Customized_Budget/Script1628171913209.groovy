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

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_Budget Planner'))

WebUI.click(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/label_Filter by'))

WebUI.click(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/li_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/label_Program duration'))

WebUI.click(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_1 year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/li_1 year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/label_Annual budget'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/svg_Annual budget_MuiSvgIcon-root-447'))

WebUI.setText(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/input_Budget for Year 1_MuiInputBase-input-_021e48'), 
    '12,345,678')

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/input_Scenario Name_MuiInputBase-input-440 _00d119'))

WebUI.setText(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/input_Scenario Name_MuiInputBase-input-440 _00d119_1'), 
    'A')

WebUI.setText(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/input_Scenario Name_MuiInputBase-input-440 _00d119_1_2'), 
    'AT')

WebUI.setText(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/input_Scenario Name_MuiInputBase-input-440 _00d119_1_2_3'), 
    'ATe')

WebUI.setText(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/input_Scenario Name_MuiInputBase-input-440 _00d119_1_2_3_4'), 
    'ATes')

WebUI.setText(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/input_Scenario Name_MuiInputBase-input-440 _00d119_1_2_3_4_5'), 
    'ATest')

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/span_Apply Management Section'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/span_Apply Management Section'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/canvas_Table_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/span_Table'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/th_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/th_Length (ft)'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/th_Cost'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/th_Average Condition Index'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/th_Condition Index Change'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_38,473'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_12,295,592'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_65.92'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_-1.11'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/button_ATest'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))
//
//WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/h3_ATest'))
//
//WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_Year'))
//
//WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_1'))
//
//WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_others'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/span_Discard'))

WebUI.click(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_1 year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/li_2 years'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/svg_Annual budget_MuiSvgIcon-root-447'))

WebUI.setText(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/input_11'), '1,234,567')

WebUI.setText(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/input_22'), '12345678')

WebUI.click(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/button_Save1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/canvas_Table_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/span_Table'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/th_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/th_Length (ft)'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/th_Cost'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/th_Average Condition Index'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/th_Condition Index Change'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_38,473'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_12,295,592'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_65.92'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_-1.11'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_2'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_3,007'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_1,209,742'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_63.29'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/td_-2.63'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/button_ATest'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))
//
//WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/h3_ATest'))
//
//WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_Year'))
//
//WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_1'))
//
//WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_2'))
//
//WebUI.click(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/div_others1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Customized_Budget/Page_Streetlogix/span_Discard'))

