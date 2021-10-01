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

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Editing'))

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Symbology Editor'))

WebUI.click(findTestObject('Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/h1_Symbology Editor'), 'Symbology Editor')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/label_Select asset'), 'Select asset')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/th_Label'), 'Label')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/th_Symbol'), 'Symbol')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/th_Count'), 'Count')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/th_Preventive Maintenance'), 'Reconstruction')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/th_Defer Maintenance'), 'Preventive Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/th_Reconstruction'), 'Chip Seal')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/th_Mill and Overlay'), 'Defer Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/th_Rehabilitation'), 'Crack Seal')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/p_Transparency'), 'Transparency:')

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Transparency050100'))

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/h3_Pavement Maintenance'), 'Pavement Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Maintenance Suggestion'), 'Maintenance Suggestion')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Preventive Maintenance'), 'Reconstruction')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Defer Maintenance'), 'Preventive Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Reconstruction'), 'Chip Seal')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Mill and Overlay'), 'Defer Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Rehabilitation'), 'Crack Seal')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_others'), 'Rehabilitation')

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/button_Pavement Maintenance'), 'PAVEMENT MAINTENANCE')

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Pavement Maintenance (Features 1,460, S_69b520'))

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Maintenance/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

