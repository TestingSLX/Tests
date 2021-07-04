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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/span_Other Assets'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/span_Decrease opacity_esri-layer-list__chil_0d6485'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/span_PavementMarkings Lines'))

String OtherAssets = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/h3_Other Assets'))

WebUI.verifyMatch(OtherAssets, 'Other Assets', false)

String pavementMarkingLines = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_PavementMarkings Lines'))

WebUI.verifyMatch(pavementMarkingLines, 'PavementMarkings Lines', false)

String dashedWhite = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_Dashed Line - White'))

WebUI.verifyMatch(dashedWhite, 'Dashed Line - White', false)

String dashedYellow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_Dashed Line - Yellow'))

WebUI.verifyMatch(dashedYellow, 'Dashed Line - Yellow', false)

String doubleWhite = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_Double Line - White'))

WebUI.verifyMatch(doubleWhite, 'Double Line - White', false)

String doubleYellow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_Double Line - Yellow'))

WebUI.verifyMatch(doubleYellow, 'Double Line - Yellow', false)

String solidGreen = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_Solid Line - Green'))

WebUI.verifyMatch(solidGreen, 'Solid Line - Green', false)

String solidWhite = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_Solid Line - White'))

WebUI.verifyMatch(solidWhite, 'Solid Line - White', false)

String solidYellow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_Solid Line - Yellow'))

WebUI.verifyMatch(solidYellow, 'Solid Line - Yellow', false)

String solidDashedYellow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_SolidDashed Line - Yellow'))

WebUI.verifyMatch(solidDashedYellow, 'Solid/Dashed Line - Yellow', false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

String buttonText = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/button_Other Assets - PavementMarkings Lines'))

WebUI.verifyMatch(buttonText, 'OTHER ASSETS - PAVEMENTMARKINGS LINES', false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/div_Other Assets - PavementMarkings Lines (_08258d'))

String objectid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_objectid'))

WebUI.verifyMatch(objectid, 'objectid', false)

String lineCondition = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Line Condition'))

WebUI.verifyMatch(lineCondition, 'Line Condition', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Line Color'), 
    0)

String color = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Line Color'))

WebUI.verifyMatch(color, 'Line Color', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Travel Direction'), 
    0)

String travelDirection = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Travel Direction'))

WebUI.verifyMatch(travelDirection, 'Travel Direction', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Line SubType'), 
    0)

String subtype = WebUI.getText(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Line SubType'))

WebUI.verifyMatch(subtype, 'Line SubType', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Line Type'), 
    0)

String lineType = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Line Type'))

WebUI.verifyMatch(lineType, 'Line Type', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Length (ft)'), 
    0)

String length = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_Length (ft)'))

WebUI.verifyMatch(length, 'Length (ft)', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_uid'), 
    0)

String uid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_uid'))

WebUI.verifyMatch(uid, 'uid', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_st_length(shape)'), 
    0)

String st_length = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Marking_Lines/Page_Streetlogix/vaadin-grid-sorter_st_length(shape)'))

WebUI.verifyMatch(st_length, 'st_length(shape)', false)

WebUI.closeBrowser()

