import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/button_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.scrollToElement(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Estimated_Cost_Values'), 10)

List<WebElement> formnameAddress = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget_Planner_1Year/Page_Streetlogix/div_Estimated_Cost_Values'), 30)

		int value = 0
		int count = 0
        for (def formname : formnameAddress) {
            String fname = formname.getProperties()['text']
//			count = count + 1
            value = value + fname.toInteger()
        }
		println(value)




