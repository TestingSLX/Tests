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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/span_Media'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/span_Decrease opacity_esri-layer-list__chil_0d6485'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/span_Pavement SurfaceView'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/span_Pavement SurfaceView'))

String media = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/h3_Media'))

WebUI.verifyMatch(media, "Media", false)

String pavementSurfaceview = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/div_Pavement SurfaceView'))

WebUI.verifyMatch(pavementSurfaceview, "Pavement SurfaceView", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

String buttonText = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/button_Media - Pavement SurfaceView'))

WebUI.verifyMatch(buttonText, "MEDIA - PAVEMENT SURFACEVIEW", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/div_Media - Pavement SurfaceView (Features _e641e6'))

String objectid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/vaadin-grid-sorter_objectid'))

WebUI.verifyMatch(objectid, "objectid", false)

String imagePath = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/vaadin-grid-sorter_Image Path'))

WebUI.verifyMatch(imagePath, "Image Path", false)

String id = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Media/Pavement_SurfaceView/Page_Streetlogix/vaadin-grid-sorter_id'))

WebUI.verifyMatch(id, "id", false)




