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

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Filter'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Pavement Evaluation'))

List<WebElement> listLayers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Filter/Filter_Pavement_Evaluation/Page_Streetlogix/div_layers_list'),
	30)

List<WebElement> allLayersList1 = new ArrayList()

def allLayersList2 = ((['Pavement Maintenance', 'Sidewalk Maintenance', 'Sign Maintenance', 'Work Orders', 'Pavement Condition Index', 'Ramp Evaluation', 'Sidewalk Condition Index', 'Sign Types', 'Manholes and Utility Covers', 'Pavement Distress', 'PavementMarkings', 'PavementMarkings Lines']) as String[])

for (WebElement el : listLayers) {
allLayersList1.add(el.getText())
}

if (allLayersList1.containsAll(allLayersList2)) {
println('All Layers Present')
} else {
throw new Exception('All layers are not in the dropdown')
}

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/li_Pavement Distress'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/span_Add Set'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Display features that match all of the following expressions'))

WebUI.verifyElementText(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/li_Display features that match all of the f_498fe1'), 'Display features that match all of the following expressions')

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/li_Display features that match all of the f_498fe1'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Display features that match all of the following expressions'))

WebUI.verifyElementText(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/li_Display features that match any of the f_353f3e'), 'Display features that match any of the following expressions')

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/li_Display features that match any of the f_353f3e'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Display features that match all of the following expressions'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/li_Display features that match all of the f_498fe1'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Select Field Name1'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/li_OBJECTID'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Select Filter1'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/li_is'))

WebUI.setText(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/input__input1'), '4')

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Select Field Name2'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/li_lat'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Select Filter2'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/li_is'))

WebUI.setText(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/input__input2'), '43.66990725')

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/span_Sidewalk Evaluation'))

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/button_Sidewalk Evaluation'))

WebUI.verifyElementText(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_OBJECTID'), 'objectid')

WebUI.verifyElementText(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_SCI_historic'), 'lat')

WebUI.verifyElementText(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/vaadin-grid-cell-content_3'), '4')

WebUI.verifyElementText(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/vaadin-grid-cell-content_80'), '43.66990725')

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.verifyElementText(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/h3_Sidewalk Evaluation'), 'Pavement Evaluation')

WebUI.click(findTestObject('Filter/Add_Set_Pavement_Distress/Page_Streetlogix/svg_delete set'))

