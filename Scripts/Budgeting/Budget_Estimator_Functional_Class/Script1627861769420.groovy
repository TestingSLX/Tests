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

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_Budget Estimator'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/label_Select layer'), 'Select layer')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/label_Filter by'), 'Filter by')

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_No Filter'))

List<WebElement> listLayers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/ul_filterby'), 30)

for(filter in listLayers) {
	if(filter.getProperties()['text'] == "Functional Class") {
		filter.click()
	} 
}

String CI = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_CI_text'))

String TCI = CI.replaceAll("[^0-9/s.]+|/.(?!/d)", "")

String stringCI = TCI.substring(0,4)

double doubleCI = stringCI.toDouble()

String targetCI = doubleCI.round() + 1

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/label_Select category'), 'Select category')

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_Other princ arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/li_Other princ arterial'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/label_Program duration'), 'Program duration')

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/li_1'))

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/h6_Target condition index 75'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_1,366,482'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_75'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_Other princ arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/li_Principal Arterial'))

String CI1 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_CI_text'))

String TCI1 = CI1.replaceAll("[^0-9/s.]+|/.(?!/d)", "")

String stringCI1 = TCI1.substring(0,4)

double doubleCI1 = stringCI1.toDouble()

String targetCI1 = doubleCI1.round() + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI1)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/svg_020406080100'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_170,916'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_73'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_Other princ arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/li_Majorurb collector'))

String CI2 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_CI_text'))

String TCI2 = CI2.replaceAll("[^0-9/s.]+|/.(?!/d)", "")

String stringCI2 = TCI2.substring(0,4)

double doubleCI2 = stringCI2.toDouble()

String targetCI2 = doubleCI2.round() + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI2)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/h6_Target condition index 73'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_2,550,821'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_73'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_Other princ arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/li_Minor Arterial'))

String CI3 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_CI_text'))

String TCI3 = CI3.replaceAll("[^0-9/s.]+|/.(?!/d)", "")

String stringCI3 = TCI3.substring(0,4)

double doubleCI3 = stringCI3.toDouble()

String targetCI3 = doubleCI3.round() + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI3)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/h6_Target condition index 71'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_4,188,776'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_71'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/div_Other princ arterial'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/li_Local'))

String CI4 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_CI_text'))

String TCI4 = CI4.replaceAll("[^0-9/s.]+|/.(?!/d)", "")

String stringCI4 = TCI4.substring(0,4)

double doubleCI4 = stringCI4.toDouble()

String targetCI4 = doubleCI4.round() + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI4)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/h6_Target condition index 63'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_12,541,809'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/td_63'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Functional_Class/Page_Streetlogix/h1_Budget Estimator'))

