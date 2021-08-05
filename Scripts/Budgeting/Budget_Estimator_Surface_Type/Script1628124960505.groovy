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

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/div_Budget Estimator'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/label_Filter by'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/div_No Filter'))

List<WebElement> listLayers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/ul_filterby'), 30)

for(filter in listLayers) {
	if(filter.getProperties()['text'] == "Surface Type") {
		filter.click()
	}
}

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/label_Select category'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/div_Asphalt'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/li_Asphalt'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/label_Program duration'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/div_Program Duration'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/li_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/label_Target condition index'))

String CI = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_CI_text'))

String TCI = CI.replaceAll("[^0-9/s.]+|/.(?!/d)", "")

String stringCI = TCI.substring(0,4)

double doubleCI = stringCI.toDouble()

String targetCI = doubleCI.round() + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/input_Target condition index_MuiInputBase-i_43b0a5'), 
    targetCI)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/h6_Target condition index 67'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/td_21,051,418'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/td_67'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Surface_Type/Page_Streetlogix/span_Current average condition index 56.5'))

