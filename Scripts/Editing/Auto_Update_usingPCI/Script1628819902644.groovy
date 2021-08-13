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

def maintenanceSuggestionDecisionTree = CustomKeywords.'com.database_keywords.test.Database_Keywords.autoUpdate'()

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Editing'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Attribute Editor'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/label_Select feature by street name'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name'), 
    'ACCESS RD')

WebUI.sendKeys(findTestObject("Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name"), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject("Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name"), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_PCI'))

String length = WebUI.getAttribute(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft'), 'value')

String width = WebUI.getAttribute(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft'), 'value')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/span_Auto-update'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_PCI'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_PCI'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_PCI'), '85')

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Maintenance Suggestion'))

String maintenanceSuggestion = WebUI.getAttribute(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Maintenance Suggestion'), 'value')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Estimated Cost ()'))

String estimatedCost = WebUI.getAttribute(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__estimated_cost'), 'value')

WebUI.verifyMatch(maintenanceSuggestionDecisionTree[0], maintenanceSuggestion, false)

double cost = Integer.parseInt(length)*Integer.parseInt(width)*0.111

int estimate = cost.round()

double finalEstimatedCost = estimate * Double.parseDouble(maintenanceSuggestionDecisionTree[1])

double newEstimatedCost = estimatedCost.toDouble()

WebUI.verifyMatch(newEstimatedCost.toString(), finalEstimatedCost.toString(), false)

//println(newEstimatedCost)
//println(finalEstimatedCost)



