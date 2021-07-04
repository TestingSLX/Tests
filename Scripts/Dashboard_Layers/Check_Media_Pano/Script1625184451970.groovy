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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/span_Media'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/span_Decrease opacity_esri-layer-list__chil_0d6485'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/span_Pavement SurfaceView'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/span_Pano'))

String media = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/h3_Media'))

WebUI.verifyMatch(media, "Media", false)

String pano = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/div_Pano'))

WebUI.verifyMatch(pano, "Pano", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

String buttonText = WebUI.getText(findTestObject('DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/button_Media Pano'))

WebUI.verifyMatch(buttonText, "MEDIA - PANO", false)

WebUI.click(findTestObject('DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/div_Media - Pavement Pano (Features 28_1e2409'))

String objectid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/vaadin-grid-sorter_OBJECTID'))

WebUI.verifyMatch(objectid, "OBJECTID", false)

String id = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/vaadin-grid-sorter_id'))

WebUI.verifyMatch(id, "id", false)

String imagePath = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_Pano/Page_Streetlogix/vaadin-grid-sorter_image_path'))

WebUI.verifyMatch(imagePath, "image_path", false)


