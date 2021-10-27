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

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/div_Repair Priority Editor'))

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/div_Repair Priority EditorSelect layerPavem_28935f'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/label_Select Factor'))

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/div_PCI_historic'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/li_PCI_historic'))

String weight1 = WebUI.getText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/td_3'))

String order1 = WebUI.getText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/td_DESC'))

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/button_Edit_Values'))

WebUI.sendKeys(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'), 
    '4')

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/div_DESC'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/li_ASC'))

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/button_Cancel'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/td_3'), weight1)

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/td_DESC'), order1)

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/button_Edit_Values'))

WebUI.sendKeys(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'), 
    '5')

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/div_DESC'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/li_ASC'))

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/button_Save_Edit'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/td_4'), '5')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/td_ASC'), 'ASC')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/td_Functional Class'), 
    'Functional Class')

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/button_Delete'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/td_Functional Class'), 
    'PCI')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/button_Reset'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/td_Functional Class'), 
    'Functional Class')

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/button_Edit_Values'))

WebUI.sendKeys(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'),
	Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'),
	Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'),
	'5')

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/div_DESC'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/li_ASC'))

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/button_Save_Edit'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/button_Save_RP'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/button_OK'))

WebUI.delay(5)

def RPriority = CustomKeywords.'com.database_keywords.test.Database_Keywords.getRepairPriority'()
println(RPriority)
WebUI.verifyMatch(RPriority, '[5,-3]', false)

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/button_Edit_Values'))

WebUI.sendKeys(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'),
	Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'),
	Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/input_Functional Class_weight'),
	'4')

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/div_DESC'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/li_ASC'))

WebUI.click(findTestObject('Settings/Repair_Priority_Editor/Page_Streetlogix/button_Save_Edit'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/button_Save_RP'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Editor/Page_Streetlogix/button_OK'))

def RPriority1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getRepairPriority'()
println(RPriority)
println(RPriority1)
WebUI.verifyMatch(RPriority1, '[4,-3]', false)



