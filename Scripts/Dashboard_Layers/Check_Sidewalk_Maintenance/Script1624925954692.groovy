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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/span_Sidewalk Maintenance'))

String SidewalkM = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/h3_Sidewalk Maintenance'))

WebUI.verifyMatch(SidewalkM, "Sidewalk Maintenance", false)

String suggestion = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/div_Maintenance Suggestion'))

WebUI.verifyMatch(suggestion, "Maintenance Suggestion", false)

String deferMaintenance = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/div_Defer Maintenance'))

WebUI.verifyMatch(deferMaintenance, "Defer Maintenance", false)

String grinding = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/div_Grinding'))

WebUI.verifyMatch(grinding, "Grinding", false)

String paverReset = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/div_Paver Reset'))

WebUI.verifyMatch(paverReset, "Paver Reset", false)

String reconstruction = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/div_Reconstruction'))

WebUI.verifyMatch(reconstruction, "Reconstruction", false)

String Null = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/div_null'))

WebUI.verifyMatch(Null, "null", false)

String partialReplacement = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/div_Partial Replacement'))

WebUI.verifyMatch(partialReplacement, "Partial Replacement", false)

String others = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/div_others'))

WebUI.verifyMatch(others, "others", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

String OBJECTID = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-cell-content_OBJECTID'))

WebUI.verifyMatch(OBJECTID, "OBJECTID", false)

String SCI_historic = WebUI.getText(findTestObject('DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-cell-content_SCI_historic'))

WebUI.verifyMatch(SCI_historic, "SCI_historic", false)

String notes = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_notes'))

WebUI.verifyMatch(notes, "notes", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_UID'), 0)

String UID = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_UID'))

WebUI.verifyMatch(UID, "UID", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_TravelLane'), 0)

String TravelLane = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_TravelLane'))

WebUI.verifyMatch(TravelLane, "TravelLane", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_SS_ID'), 0)

String SS_ID = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_SS_ID'))

WebUI.verifyMatch(SS_ID, "SS_ID", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_streetname'), 0)

String streetname = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_streetname'))

WebUI.verifyMatch(streetname, "streetname", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_fromstreetname'), 0)

String fromstreetname = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_fromstreetname'))

WebUI.verifyMatch(fromstreetname, "fromstreetname", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_tostreetname'), 0)

String tostreetname = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_tostreetname'))

WebUI.verifyMatch(tostreetname, "tostreetname", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter Functional Class'), 0)

String functionalClass = WebUI.getText(findTestObject('DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter Functional Class'))

WebUI.verifyMatch(functionalClass, "Functional Class", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Functional Class ID'), 0)

String functionalClassID = WebUI.getText(findTestObject('DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Functional Class ID'))

WebUI.verifyMatch(functionalClassID, "Functional Class", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Length (ft)'), 0)

String length = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Length (ft)'))

WebUI.verifyMatch(length, "Length (ft)", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Width (ft)'), 0)

String width = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Width (ft)'))

WebUI.verifyMatch(width, "Width (ft)", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Maintenance Suggestion'), 0)

String maintenanceSuggestion = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Maintenance Suggestion'))

WebUI.verifyMatch(maintenanceSuggestion, "Maintenance Suggestion", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Estimated Cost ()'), 0)

String estimatedCost = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Estimated Cost ()'))

//WebUI.verifyMatch(estimatedCost, "Estimated Cost", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Repair Priority'), 0)

String repairPriority = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Repair Priority'))

WebUI.verifyMatch(repairPriority, "Repair Priority", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Area (sy)'), 0)

String area = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Area (sy)'))

WebUI.verifyMatch(area, "Area (sy)", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Last Repair Method'), 0)

String lastRepairMaethod = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Last Repair Method'))

WebUI.verifyMatch(lastRepairMaethod, "Last Repair Method", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Last Repair Cost'), 0)

String lastRepairCost = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Last Repair Cost'))

WebUI.verifyMatch(lastRepairCost, "Last Repair Cost", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Last Repair Date'), 0)

String lastRepairDate = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Last Repair Date'))

WebUI.verifyMatch(lastRepairDate, "Last Repair Date", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Future Event'), 0)

String futureEvent = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Future Event'))

WebUI.verifyMatch(futureEvent, "Future Event", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Editor Name'), 0)

String editorName = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Editor Name'))

WebUI.verifyMatch(editorName, "Editor Name", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Editor Id'), 0)

String editorID = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Editor Id'))

WebUI.verifyMatch(editorID, "Editor Id", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Last Edit'), 0)

String lastEdit = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Last Edit'))

WebUI.verifyMatch(lastEdit, "Last Edit", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Editor Notes'), 0)

String editorNotes = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Editor Notes'))

WebUI.verifyMatch(editorNotes, "Editor Notes", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Future EVent Date'), 0)

String futureEventDate = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Future Event Date'))

WebUI.verifyMatch(futureEventDate, "Future Event Date", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter Width 1'), 0)

String width1 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter Width 1'))

WebUI.verifyMatch(width1, "Width (ft)", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter Length 1'), 0)

String length1 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter Length 1'))

WebUI.verifyMatch(length1, "Length (ft)", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_ward'), 0)

String ward = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Ward'))

WebUI.verifyMatch(ward, "Ward", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Surface Type'), 0)

String surfaceType = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Surface Type'))

WebUI.verifyMatch(surfaceType, "Surface Type", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Surface Type ID'), 0)

String surfaceTypeID = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Surface Type ID'))

WebUI.verifyMatch(surfaceTypeID, "Surface Type ID", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_globalid'), 0)

String globalID = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_globalid'))

WebUI.verifyMatch(globalID, "globalid", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_city'), 0)

String city = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_city'))

WebUI.verifyMatch(city, "City", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_state'), 0)

String state = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_state'))

WebUI.verifyMatch(state, "State", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_country'), 0)

String country = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_country'))

WebUI.verifyMatch(country, "Country", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Need Year'), 0)

String needYear = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Need Year'))

WebUI.verifyMatch(needYear, "need_year", false)

String SMaintenance = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/button_Sidewalk Maintenance'))

WebUI.verifyMatch(SMaintenance, "SIDEWALK MAINTENANCE", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sidewalk_Maintenance/Page_Streetlogix/div_Sidewalk Maintenance (Features 1,455, S_b5cbea'))

