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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/span_Sidewalk Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/span_Decrease opacity_esri-layer-list__chil_0d6485'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/span_Sidewalk Condition Index'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/span_Ramp Evaluation'))

String SEvaluation = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/h3_Sidewalk Evaluation'))

WebUI.verifyMatch(SEvaluation, "Sidewalk Evaluation", false)

String rampEvaluation = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/div_Ramp Evaluation'))

WebUI.verifyMatch(rampEvaluation, "Ramp Evaluation", false)

String compliant = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/div_Compliant'))

WebUI.verifyMatch(compliant, "Compliant", false)

String nonCompliant = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/div_Not Compliant'))

WebUI.verifyMatch(nonCompliant, "Not Compliant", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

String REvaluation = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/button_Sidewalk Evaluation - Ramp Evaluation'))

WebUI.verifyMatch(REvaluation, "SIDEWALK EVALUATION - RAMP EVALUATION", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/div_Sidewalk Evaluation - Ramp Evaluation (_91c984'))

String objectid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_objectid'))

WebUI.verifyMatch(objectid, "objectid", false)

String globalid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_GlobalID'))

WebUI.verifyMatch(globalid, "GlobalID", false)

String inspector = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Inspector'))

WebUI.verifyMatch(inspector, "Inspector", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Inspection Date'), 0)

String inspectionDate = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Inspection Date'))

WebUI.verifyMatch(inspectionDate, "Inspection Date", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Surface material of ramp'), 0)

String surfaceMaterial = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Surface material of ramp'))

WebUI.verifyMatch(surfaceMaterial, "Surface material of ramp", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Type of ramp'), 0)

String typeRamp = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Type of ramp'))

WebUI.verifyMatch(typeRamp, "Type of ramp", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_3x4 Landing Existence'), 0)

String landingExistence = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_3x4 Landing Existence'))

WebUI.verifyMatch(landingExistence, "3'x4' Landing Existence", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Apron running slope perc_25a622'), 0)

String apronSlope = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Apron running slope perc_25a622'))

WebUI.verifyMatch(apronSlope, "Apron running slope percent of ramp", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Whether or not the ramp _f90fb3'), 0)

String lipOrNot = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Whether or not the ramp _f90fb3'))

//WebUI.verifyMatch(lipOrNot, "Whether or not the ramp has a 1/4 lip or not", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Threshold width of ramp'), 0)

String threshold = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Threshold width of ramp'))

WebUI.verifyMatch(threshold, "Threshold width of ramp", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Crosswalk existence'), 0)

String crosswalk = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Crosswalk existence'))

WebUI.verifyMatch(crosswalk, "Crosswalk existence", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Detectable Warning Panel Type'), 0)

String panelType = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Detectable Warning Panel type'))

WebUI.verifyMatch(panelType, "Detectable Warning Panel type", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Detectable Warning Panel color'), 0)

String panelColor = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Detectable Warning Panel color'))

WebUI.verifyMatch(panelColor, "Detectable Warning Panel color", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Whether or not the ramp _b1306e'), 0)

String recentlyConstructed = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Whether or not the ramp _b1306e'))

WebUI.verifyMatch(recentlyConstructed, "Whether or not the ramp has been recently constructed", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Landing running or cross_27fa14'), 0)

String landingRunning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_Landing running or cross_27fa14'))

WebUI.verifyMatch(landingRunning, "Landing running or cross slope percent of ramp (worst case)", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_aab_comp'), 0)

String comp = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_aab_comp'))

WebUI.verifyMatch(comp, "aab_comp", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_ramp_id'), 0)

String rampid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_ramp_id'))

WebUI.verifyMatch(rampid, "ramp_id", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_intersection'), 0)

String intersection = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_intersection'))

WebUI.verifyMatch(intersection, "intersection", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_intersectid'), 0)

String intersectID = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_intersectid'))

WebUI.verifyMatch(intersectID, "intersectid", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_sidewalk_id'), 0)

String sidewalkID = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_sidewalk_id'))

WebUI.verifyMatch(sidewalkID, "sidewalk_id", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_image'), 0)

String image = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Evaluation/Sidewalk-Ramp_Evaluation/Page_Streetlogix/vaadin-grid-sorter_image'))

WebUI.verifyMatch(image, "image", false)



