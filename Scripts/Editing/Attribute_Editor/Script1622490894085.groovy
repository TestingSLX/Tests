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

WebUI.click(findTestObject('Object Repository/Editing/Page_Streetlogix/div_Editing'))

WebUI.click(findTestObject('Object Repository/Editing/Page_Streetlogix/div_Attribute Editor'))

WebUI.click(findTestObject('Object Repository/Editing/Page_Streetlogix/div_'))

WebUI.setText(findTestObject('Object Repository/Editing/Page_Streetlogix/input_Select feature by street name_mui-14634'), 
    'ABBY LN')

WebUI.click(findTestObject('Object Repository/Editing/Page_Streetlogix/li_ABBY LN'))

WebUI.sendKeys(findTestObject('Object Repository/Editing/Page_Streetlogix/input_Auto-update_pci'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Editing/Page_Streetlogix/input_Auto-update_pci'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Page_Streetlogix/input_Auto-update_pci'), '45')

WebUI.click(findTestObject('Editing/Page_Streetlogix/span_Save'))

WebUI.click(findTestObject('Object Repository/Editing/Page_Streetlogix/div_Success'))

WebUI.click(findTestObject('Object Repository/Editing/Page_Streetlogix/button_OK'))

WebUI.closeBrowser()

WebUI.delay(20)

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Editing/Page_Streetlogix/div_Editing'))

WebUI.click(findTestObject('Editing/Page_Streetlogix/div_Attribute Editor'))

WebUI.click(findTestObject('Editing/Page_Streetlogix/div_'))

WebUI.setText(findTestObject('Object Repository/Editing/Page_Streetlogix/input_Select feature by street name_mui-14634'), 
    'ABBY LN')

WebUI.click(findTestObject('Object Repository/Editing/Page_Streetlogix/li_ABBY LN'))

WebUI.sendKeys(findTestObject('Object Repository/Editing/Page_Streetlogix/input_Auto-update_pci'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Editing/Page_Streetlogix/input_Auto-update_pci'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Page_Streetlogix/input_Auto-update_pci'), '70')

WebUI.click(findTestObject('Editing/Page_Streetlogix/span_Save'))

WebUI.click(findTestObject('Object Repository/Editing/Page_Streetlogix/button_OK'))

