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

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/div_Budget Estimator'))

WebUI.click(findTestObject('Budgeting/Budget_Estimator/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/label_Select layer'), "Select layer")

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/span_Current average condition index 64.637'))

WebUI.click(findTestObject('Budgeting/Budget_Estimator/Page_Streetlogix/div_No Filter'))

List<WebElement> listLayers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/ul_filterby'), 30)

List<WebElement> allLayersList1 = new ArrayList()

def allLayersList2 = ((['No Filter', 'Last Repair Method', 'Ward', 'Surface Type', 'Functional Class', 'Maintenance Suggestion', 'Customized Filter']) as String[])

for (WebElement el : listLayers) {
	allLayersList1.add(el.getText())
}
println(allLayersList1)
if (allLayersList1.containsAll(allLayersList2)) {
	println('All Layers Present')
} else {
	throw new Exception('All layers are not in the dropdown')
}

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/li_No Filter'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/label_Filter by'), "Filter by")

WebUI.click(findTestObject('Budgeting/Budget_Estimator/Page_Streetlogix/div_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/li_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/label_Program duration'), "Program duration")

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/label_Target condition index'), "Target condition index")

String avgPCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCI'()

String targetCI1 = avgPCI.toInteger() + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI1)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/h6_Target condition index 70'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/th_Year'), "Year")

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/th_Budget'), "Budget")

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/th_Condition Index'), "Condition Index")

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/td_35,485,203'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/td_70'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/span_Cancel'))

String targetCI2 = avgPCI.toInteger() - 10

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI2)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/span_Calculate'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/div_Cannot achieve the target condition rating'), "Cannot achieve the target condition rating.")

WebUI.click(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/svg_Cannot achieve the target condition rat_518d8b'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget_Estimator/Page_Streetlogix/h1_Budget Estimator'), "Budget Estimator")

