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

WebUI.click(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Select layer'), 
    'Select layer:')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Filter by'), 
    'Filter by:')

WebUI.click(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_No Filter'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Program duration'), 
    'Program duration:')

WebUI.click(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_1 year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_1 year'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Annual budget'), 
    'Annual budget:')

String budget1 = '123456789'

int budget = 123456789

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/input_Annual budget_MuiInputBase-input-433 _ae0c06'), 
    budget1)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/label_Scenario name'), 
    'Scenario name:')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/input_Scenario name_MuiInputBase-input-433 _2d5739'))

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/input_Scenario name_MuiInputBase-input-433 _2d5739_1_2_3_4_5'), 
    'T')

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/input_Scenario name_MuiInputBase-input-433 _2d5739_1_2_3_4_5_6'), 
    'Te')

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/input_Scenario name_MuiInputBase-input-433 _2d5739_1_2_3_4_5_6_7'), 
    'Tes')

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/input_Scenario name_MuiInputBase-input-433 _2d5739_1_2_3_4_5_6_7_8'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Apply Management Section'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Apply Management Section'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/canvas_Table_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Table'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Length (ft)'), 
    'Length (ft)')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Cost'), 'Cost')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Average Condition Index'), 
    'Average Condition Index')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/th_Condition Index Change'), 
    'Condition Index Change')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_1'), '1')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_1,787,514'))

String estimatedCost = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_121,772,145'))

int cost = estimatedCost.replaceAll('[^0-9]', '').toInteger()

if ((budget > cost) && (cost > 100000000)) {
    println('Estimated Cost is correct')
} else {
    throw new Exception('Estimated cost difference is more')
}

String avgCI = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_99.64'))

String totalCI = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/td_32.55'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Chart'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/h3_Test'), 'Test')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_others'), 
    'others')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/button_Year'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/h3_Test'), 'Test')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Maintenance Suggestion'), 
    'Maintenance Suggestion')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Crack Seal'), 
    'Crack Seal')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Panel Replacement (50)'), 
    'Panel Replacement (<50%)')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Preventive Maintenance'), 
    'Preventive Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Defer Maintenance'), 
    'Defer Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Reconstruction'), 
    'Reconstruction')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Mill and Overlay'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Mill and Overlay'), 
    'Mill and Overlay')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Rehabilitation'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Rehabilitation'), 
    'Rehabilitation')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Others_1'), 0)

WebUI.verifyElementText(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Others_1'), 'others')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/button_Test'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Test (Features 1,429, Selected 0)'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_SS_ID'), 
    'SS_ID')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_streetname'), 
    'streetname')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_fromstreetname'), 
    'fromstreetname')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_tostreetname'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_tostreetname'), 
    'tostreetname')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_PCI'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_PCI'), 
    'PCI')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Functional Class'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Functional Class'), 
    'Functional Class')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Length (ft)'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Length (ft)'), 
    'Length (ft)')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Width (ft)'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Width (ft)'), 
    'Width (ft)')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Maintenance Suggestion'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Maintenance Suggestion'), 
    'Maintenance Suggestion')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Estimated Cost ()'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Estimated Cost ()'), 
    'Estimated Cost ($)')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Repair Priority'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Repair Priority'), 
    'Repair Priority')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Area (sy)'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Area (sy)'), 
    'Area (sy)')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Ward'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Ward'), 
    'Ward')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Surface Type'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Surface Type'), 
    'Surface Type')

WebUI.scrollToElement(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Year'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/vaadin-grid-sorter_Year'), 
    'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Edit Scenario'), 
    'Edit Scenario')

WebUI.click(findTestObject('Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_one'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/li_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/span_Report'))

