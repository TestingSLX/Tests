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

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Repair Impact Editor'))

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/h1_Repair Impact Editor'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/label_Select surface type'))

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Asphalt'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_Asphalt'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/label_Maintenance Suggestion'))

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Preventive Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_Add a new method'))

WebUI.setText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/input_Method Name_msName'), 
    'TestMethodAdded')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/h2_Add a new Method'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/p_Do you need other method Please, add it'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/button_Add'))

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Preventive Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_TestMethodAdded'))

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Preventive Maintenance'))

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/button_Delete_Method'))

