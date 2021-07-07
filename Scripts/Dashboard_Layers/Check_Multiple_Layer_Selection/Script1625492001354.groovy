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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/span_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/span_Sidewalk Maintenance'))

String pavementMaintenance = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/h3_Pavement Maintenance'))

WebUI.verifyMatch(pavementMaintenance, "Pavement Maintenance", false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/h3_Sidewalk Maintenance'), 
    0)

String sidewalkMaintenance = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/h3_Sidewalk Maintenance'))

WebUI.verifyMatch(sidewalkMaintenance, "Sidewalk Maintenance", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/button_Pavement Maintenance'))

String buttonPavement = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/button_Pavement Maintenance'))

WebUI.verifyMatch(buttonPavement, "PAVEMENT MAINTENANCE", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/button_Sidewalk Maintenance'))

String buttonSidewalk = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Selecting_Multiple_Layers/Page_Streetlogix/button_Sidewalk Maintenance'))

WebUI.verifyMatch(buttonSidewalk, "SIDEWALK MAINTENANCE", false)





