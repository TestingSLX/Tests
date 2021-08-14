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

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Editing'))

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Symbology Editor'))

WebUI.click(findTestObject('Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/li_Sidewalk Maintenance'))

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/h1_Symbology Editor'), 'Symbology Editor')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/label_Select asset'), 'Select asset')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/th_Label'), 'Label')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/th_Symbol'), 'Symbol')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/th_Count'), 'Count')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/th_Defer Maintenance'), 'Defer Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/th_Grinding'), 'Grinding')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/th_Paver Reset'), 'Paver Reset')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/th_Reconstruction'), 'Reconstruction')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/th_null'), 'null')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/th_Partial Replacement'), 'Partial Replacement')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/p_Transparency'), 'Transparency:')

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Transparency050100'))

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/h3_Sidewalk Maintenance'), 'Sidewalk Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Maintenance Suggestion'), 'Maintenance Suggestion')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Defer Maintenance'), 'Defer Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Grinding'), 'Grinding')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Paver Reset'), 'Paver Reset')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Reconstruction'), 'Reconstruction')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_null'), 'null')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Partial Replacement'), 'Partial Replacement')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_others'), 'others')

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/button_Sidewalk Maintenance'), 'SIDEWALK MAINTENANCE')

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Sidewalk Maintenance (Features 1,455, S_b5cbea'))

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Sidewalk_Maintenance/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

