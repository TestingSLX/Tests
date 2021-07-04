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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/span_Decrease opacity_esri-layer-list__chil_0d6485'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/span_Pavement Condition Index'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/span_Pavement Distress'))

String PEvaluation = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/h3_Pavement Evaluation'))

WebUI.verifyMatch(PEvaluation, "Pavement Evaluation", false)

String PDistress = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/div_Pavement Distress'))

WebUI.verifyMatch(PDistress, "Pavement Distress", false)

String pothole = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/div_Pothole'))

WebUI.verifyMatch(pothole, "Pothole", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

String PavementDistress = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/button_Pavement Evaluation - Pavement Distress'))

WebUI.verifyMatch(PavementDistress, "PAVEMENT EVALUATION - PAVEMENT DISTRESS", false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/div_Pavement Evaluation - Pavement Distress_8514ea'))

String objectid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_objectid'))

WebUI.verifyMatch(objectid, "objectid", false)

String Long = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_long'))

WebUI.verifyMatch(Long, "long", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_lat'), 0)

String lat = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_lat'))

WebUI.verifyMatch(lat, "lat", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_date'), 0)

String date = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_date'))

WebUI.verifyMatch(date, "date", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_Image Path'), 0)

String imagePath = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_Image Path'))

WebUI.verifyMatch(imagePath, "Image Path", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_uid'), 0)

String uid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_uid'))

WebUI.verifyMatch(uid, "uid", false)

WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_Distress'), 0)

String distress = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Pavement_Evaluation/Pavement_Distress/Page_Streetlogix/vaadin-grid-sorter_Distress'))

WebUI.verifyMatch(distress, "Distress", false)


