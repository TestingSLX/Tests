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

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/div_Repair Priority Editor'))

WebUI.click(findTestObject('Settings/Repair_Priority_Editor_UI/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/h1_Repair Priority Editor'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/label_Select Factor'))

WebUI.click(findTestObject('Settings/Repair_Priority_Editor_UI/Page_Streetlogix/div_PCI_historic'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/li_PCI_historic'))

WebUI.verifyElementText(findTestObject('Settings/Repair_Priority_Editor_UI/Page_Streetlogix/button_Add Factor'), 'ADD FACTOR')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/th_Priority Factor'), 
    'Priority Factor')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/th_Weight'), 
    'Weight')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/th_Correlation'), 
    'Correlation')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/th_Edit'), 
    'Edit')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/th_Delete'), 
    'Delete')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/td_Functional Class'), 
    'Functional Class')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/td_3'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/td_DESC'), 
    'ASC')

WebUI.verifyElementPresent(findTestObject('Settings/Repair_Priority_Editor_UI/Page_Streetlogix/td_Edit1'), 0)

WebUI.verifyElementPresent(findTestObject('Settings/Repair_Priority_Editor_UI/Page_Streetlogix/td_Delete1'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/td_PCI'), 
    'PCI')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/td_6'), '3')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/td_ASC'), 
    'DESC')

WebUI.verifyElementPresent(findTestObject('Settings/Repair_Priority_Editor_UI/Page_Streetlogix/td_Edit2'), 0)

WebUI.verifyElementPresent(findTestObject('Settings/Repair_Priority_Editor_UI/Page_Streetlogix/td_Delete2'), 0)

WebUI.click(findTestObject('Settings/Repair_Priority_Editor_UI/Page_Streetlogix/svg_FunctionalClassPCI'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/button_Reset'), 
    'RESET')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor_UI/Page_Streetlogix/button_Save'), 
    'SAVE')

def priorityFactors = CustomKeywords.'com.database_keywords.test.Database_Keywords.getRepairPriority'()
println(priorityFactors)
if (priorityFactors == '[4,-3]') {
    println('Correct Priority Weights Loaded')
} else {
    throw new Exception('Incorrect Priority Weights Loaded')
}

