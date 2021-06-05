import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/div_Budget Planner'))

WebUI.setText(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/input_Annual budget_MuiInputBase-input-432 _7d9e17'), 
    '139333281')

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/span_Table'))

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/td_88.27'))

//
//		String conditionIndex = WebUI.getText(findTestObject('Budget-Planner-Estimator/Page_Streetlogix/td_88.27'))
//				
//		int conIndex =  Integer.parseInt(conditionIndex)
WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/td_103,861,987'))

String Cost = WebUI.getText(findTestObject('Budget-Planner-Estimator/Page_Streetlogix/td_103,861,987'))

String newCost = Cost.replace(',', '')

int cost1 = Integer.parseInt(newCost)

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/span_Discard'))

WebUI.refresh()

//WebUI.closeBrowser()
//
//WebUI.delay(30)
//
//CustomKeywords.'com.gis_url.test.URL.redirectURL'()
WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/div_Budget Estimator'))

WebUI.setText(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/input_Annual budget_MuiInputBase-input-432 _7d9e17'), 
    '88')

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/td_88'))

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/td_103,912,070'))

String Cost2 = WebUI.getText(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/td_103,912,070'))

String newCost2 = Cost2.replace(',', '')

int cost2 = Integer.parseInt(newCost2)

WebUI.click(findTestObject('Object Repository/Budget-Planner-Estimator/Page_Streetlogix/span_Cancel'))

WebUI.closeBrowser()

int difference = cost1 - cost2

println(cost1 - cost2)

int val = 100000

WebUI.verifyLessThan(difference, val)

WebUI.verifyGreaterThanOrEqual(difference, 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

