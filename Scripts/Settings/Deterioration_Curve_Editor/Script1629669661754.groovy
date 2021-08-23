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

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/div_Deterioration Curve Editor'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/h1_Deterioration Curve Editor'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/label_Select surface type'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/div_Asphalt'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/li_Asphalt_Pavement'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/button_Add Point_Pavement_asphalt'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/button_Delete Point_Pavement_asphalt'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/canvas_Asphalt_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/div_Asphalt'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/li_Concrete_Pavement'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/canvas_Asphalt_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/button_Add Point_Pavement_Concrete'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/button_Delete Point_Pavement_Concrete'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/li_Sidewalk Maintenance'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/div_Asphalt'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/li_Concrete_Sidewalk'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/canvas_Asphalt_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/button_Add Point_Sidewalk_Concrete'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/button_Delete Point_Sidewalk_Concrete'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/div_Asphalt'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/li_Brick_Sidewalk'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/canvas_Asphalt_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/button_Add Point_Sidewalk_Brick'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/button_Delete Point_Sidewalk_Brick'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/div_Asphalt'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/li_Asphalt_Sidewalk'))

WebUI.click(findTestObject('Object Repository/Settings/Deterioration_Curve_Editor/Page_Streetlogix/canvas_Asphalt_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/button_Add Point_Sidewalk_asphalt'))

WebUI.click(findTestObject('Settings/Deterioration_Curve_Editor/Page_Streetlogix/button_Delete Point_Sidewalk_asphalt'))

