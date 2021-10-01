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

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Editing'))

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Symbology Editor'))

WebUI.click(findTestObject('Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/li_Pavement Evaluation'))

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/h1_Symbology Editor'), 'Symbology Editor')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/label_Select asset'), 'Select asset')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/th_Label'), 'Label')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/th_Symbol'), 'Symbol')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/th_Count'), 'Count')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/th_Failed (0 - 10)'), 'Failed (0 - 10)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/th_Serious (10 - 25)'), 'Serious (10 - 25)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/th_Very Poor (25 - 40)'), 'Very Poor (25 - 40)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/th_Poor (40 - 55)'), 'Poor (40 - 55)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/th_Fair (55 - 70)'), 'Fair (55 - 70)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/th_Good (70 - 85)'), 'Good (70 - 85)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/th_Excellent (85 - 100)'), 'Excellent (85 - 100)')

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Transparency050100'))

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/p_Transparency'), 'Transparency:')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/h3_Pavement Evaluation'), 'Pavement Evaluation')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Pavement Condition Index'), 'Pavement Condition Index')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Excellent (85 - 100)'), 'Excellent (85 - 100)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Good (70 - 85)'), 'Good (70 - 85)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Fair (55 - 70)'), 'Fair (55 - 70)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Poor (40 - 55)'), 'Poor (40 - 55)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Very Poor (25 - 40)'), 'Very Poor (25 - 40)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Serious (10 - 25)'), 'Serious (10 - 25)')

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Failed (0 - 10)'), 'Failed (0 - 10)')

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.verifyElementText(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/span_Pavement Evaluation - Pavement Conditi_a56e5e'), 'PAVEMENT EVALUATION - PAVEMENT CONDITION INDEX')

WebUI.click(findTestObject('Object Repository/Editing/Symbology_Editor_Pavement_Evaluation/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

