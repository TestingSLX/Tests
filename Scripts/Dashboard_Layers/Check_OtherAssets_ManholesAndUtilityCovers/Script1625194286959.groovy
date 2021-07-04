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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/span_Other Assets'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/span_Decrease opacity_esri-layer-list__chil_0d6485'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/span_Manholes and Utility Covers'))

String asset = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/h3_Other Assets'))

WebUI.verifyMatch(asset, 'Other Assets', false)

String manholesCovers = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/div_Manholes and Utility Covers'))

WebUI.verifyMatch(manholesCovers, 'Manholes and Utility Covers', false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

String buttonText = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/button_Other Assets - Manholes and Utility Covers'))

WebUI.verifyMatch(buttonText, 'OTHER ASSETS - MANHOLES AND UTILITY COVERS', false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/div_Other Assets - Manholes and Utility Cov_64e79f'))

String objectid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/vaadin-grid-sorter_objectid'))

WebUI.verifyMatch(objectid, 'objectid', false)

String Long = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/vaadin-grid-sorter_long'))

WebUI.verifyMatch(Long, 'long', false)

String lat = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/vaadin-grid-sorter_lat'))

WebUI.verifyMatch(lat, 'lat', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/vaadin-grid-sorter_date'), 
    0)

String Date = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/vaadin-grid-sorter_date'))

WebUI.verifyMatch(Date, 'date', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/vaadin-grid-sorter_Image Path'), 
    0)

String imagePath = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/vaadin-grid-sorter_Image Path'))

WebUI.verifyMatch(imagePath, 'Image Path', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/vaadin-grid-sorter_uid'), 
    0)

String uid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Manhole And Utility Covers/Page_Streetlogix/vaadin-grid-sorter_uid'))

WebUI.verifyMatch(uid, 'uid', false)

