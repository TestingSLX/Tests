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

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_Decision Tree Editor'))

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/span_Decision Tree Editor_esri-icon-zoom-ou_d0a10e'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_AssetPavement'))

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_PCIMin 0, Max 55'))

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_PCIMin 55, Max 70'))

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_Min 70, Max 90'))

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_Min 90, Max 100'))

WebUI.click(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_Crack DensityMin 0, Max 50'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_Crack DensityMin 50, Max 100'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_Preventive RepairUnit Cost (yd) 1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_Mill and OverlayUnit Cost (yd) 20'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_Defer MaintenanceUnit Cost (yd) 0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Decision_Tree/Page_Streetlogix/div_Mill and OverlayUnit Cost (yd) 19'), 
    0)

WebUI.verifyElementPresent(findTestObject('Decision_Tree/Page_Streetlogix/div_ReconstructionUnit Cost (yd) 100'), 0)

WebUI.closeBrowser()

