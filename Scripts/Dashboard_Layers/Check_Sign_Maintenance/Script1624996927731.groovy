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

def WOCount = CustomKeywords.'com.database_keywords.test.Database_Keywords.getWorkOrdersCount'()

println(WOCount)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/span_Sign Maintenance'))

String signMaintenance = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/h3_Sign Maintenance'))

WebUI.verifyMatch(signMaintenance, 'Sign Maintenance', false)

String suggestion = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/div_Maintenance Suggestion'))

WebUI.verifyMatch(suggestion, 'Maintenance Suggestion', false)

String replace = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/div_Replace'))

WebUI.verifyMatch(replace, 'Replace', false)

String retire = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/div_Retire'))

WebUI.verifyMatch(retire, 'Retire', false)

String nothing = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/div_Do Nothing'))

WebUI.verifyMatch(nothing, 'Do Nothing', false)

String defer = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/div_Defer'))

WebUI.verifyMatch(defer, 'Defer', false)

String Rcritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/div_Replace - Critical'))

WebUI.verifyMatch(Rcritical, 'Replace - Critical', false)

String others = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/div_others'))

WebUI.verifyMatch(others, 'others', false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

String sMaintenance = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/button_Sign Maintenance'))

WebUI.verifyMatch(sMaintenance, 'SIGN MAINTENANCE', false)

String signFeatures = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/div_Sign Maintenance (Features 21,845, Selected 0)'))

String objectid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_objectid'))

WebUI.verifyMatch(objectid, 'objectid', false)

String signlegend = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signlegend'))

WebUI.verifyMatch(signlegend, 'signlegend', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_mutcd'), 
    0)

String mutcd = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_mutcd'))

WebUI.verifyMatch(mutcd, 'mutcd', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signcondition'), 
    0)

String signcondition = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signcondition'))

WebUI.verifyMatch(signcondition, 'signcondition', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_positiononpost'), 
    0)

String positiononpost = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_positiononpost'))

WebUI.verifyMatch(positiononpost, 'positiononpost', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_postmaterial'), 
    0)

String postmaterial = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_postmaterial'))

WebUI.verifyMatch(postmaterial, 'postmaterial', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signcategory'), 
    0)

String signcategory = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signcategory'))

WebUI.verifyMatch(signcategory, 'signcategory', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_positioninrow'), 
    0)

String positioninrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_positioninrow'))

WebUI.verifyMatch(positioninrow, 'positioninrow', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signorientation'), 
    0)

String signorientation = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signorientation'))

WebUI.verifyMatch(signorientation, 'signorientation', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signtype'), 
    0)

String signtype = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signtype'))

WebUI.verifyMatch(signtype, 'signtype', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signposttype'), 
    0)

String signposttype = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_signposttype'))

WebUI.verifyMatch(signposttype, 'signposttype', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_symbol'), 
    0)

String symbol = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_symbol'))

WebUI.verifyMatch(symbol, 'symbol', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_sign_id'), 
    0)

String sign_id = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_sign_id'))

WebUI.verifyMatch(sign_id, 'sign_id', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_x_point'), 
    0)

String x_point = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_x_point'))

WebUI.verifyMatch(x_point, 'x_point', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_y_point'), 
    0)

String y_point = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_y_point'))

WebUI.verifyMatch(y_point, 'y_point', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Image Path'), 
    0)

String imagePath = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Image Path'))

WebUI.verifyMatch(imagePath, 'Image Path', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_uid'), 
    0)

String uid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_uid'))

WebUI.verifyMatch(uid, 'uid', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Installation Date'), 
    0)

String installationDate = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Installation Date'))

WebUI.verifyMatch(installationDate, 'Installation Date', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Category ID'), 
    0)

String categoryID = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Category ID'))

WebUI.verifyMatch(categoryID, 'Category ID', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_retroreflectivity'), 
    0)

String retroReflectivity = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_retroreflectivity'))

WebUI.verifyMatch(retroReflectivity, 'retroreflectivity', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Remaining Life (yrs)'), 
    0)

String remainingLife = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Remaining Life (yrs)'))

WebUI.verifyMatch(remainingLife, 'Remaining Life (yrs)', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Maintenance Suggestion'), 
    0)

String maintenanceSuggestion = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Maintenance Suggestion'))

WebUI.verifyMatch(maintenanceSuggestion, 'Maintenance Suggestion', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Repair Priority'), 
    0)

String repairPriority = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Repair Priority'))

WebUI.verifyMatch(repairPriority, 'Repair Priority', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Sheeting Material'), 
    0)

String sheetingMaterial = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Sheeting Material'))

WebUI.verifyMatch(sheetingMaterial, 'Sheeting Material', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Remaining Warranty (yrs)'), 
    0)

String remainingWarranty = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Remaining Warranty (yrs)'))

WebUI.verifyMatch(remainingWarranty, 'Remaining Warranty (yrs)', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Warranty Exp Date'), 
    0)

String expDate = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Warranty Exp Date'))

WebUI.verifyMatch(expDate, 'Warranty Exp Date', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Replacement Cost'), 
    0)

String cost = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Replacement Cost'))

WebUI.verifyMatch(cost, 'Replacement Cost', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_SS_ID'), 
    0)

String ss_id = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_SS_ID'))

WebUI.verifyMatch(ss_id, 'SS_ID', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Functional Class'), 
    0)

String functionalClass = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Functional Class'))

WebUI.verifyMatch(functionalClass, 'Functional Class', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Functional Class ID'), 
    0)

String functionalClassId = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Functional Class ID'))

WebUI.verifyMatch(functionalClassId, 'Functional Class', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Estimated Cost ()'), 
    0)

String estimatedCost = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_Estimated Cost ()'))

//WebUI.verifyMatch(estimatedCost, "Estimated Cost()", false)
WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_address'), 
    0)

String address = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_address'))

WebUI.verifyMatch(address, 'address', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_city'), 
    0)

String city = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_city'))

WebUI.verifyMatch(city, 'city', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_zip'), 
    0)

String zip = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_zip'))

WebUI.verifyMatch(zip, 'zip', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_state'), 
    0)

String state = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_state'))

WebUI.verifyMatch(state, 'state', false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_country'), 
    0)

String country = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/SIgn_Maintenance/Page_Streetlogix/vaadin-grid-sorter_country'))

WebUI.verifyMatch(country, 'country', false)

