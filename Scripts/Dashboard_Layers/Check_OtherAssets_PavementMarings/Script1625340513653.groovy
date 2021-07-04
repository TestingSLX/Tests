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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/span_Other Assets'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/span_Decrease opacity_esri-layer-list__chil_0d6485'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/span_PavementMarkings'))

String otherAsstes = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/h3_Other Assets'))

WebUI.verifyMatch(otherAsstes, 'Other Assets', false)

String pavementMarkings = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_PavementMarkings'))

WebUI.verifyMatch(pavementMarkings, 'PavementMarkings', false)

String straightArrowCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Straight Arrow - Critical'))

WebUI.verifyMatch(straightArrowCritical, 'Straight Arrow - Critical', false)

String ArrowFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Arrow, Fair'))

WebUI.verifyMatch(ArrowFair, 'Arrow, Fair', false)

String straightArrowGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Straight Arrow - Good'))

WebUI.verifyMatch(straightArrowGood, 'Straight Arrow - Good', false)

String bicycleGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Bicycle - Good'))

WebUI.verifyMatch(bicycleGood, 'Bicycle - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Bicycle - Critical'), 
    0)

String bicycleCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Bicycle - Critical'))

WebUI.verifyMatch(bicycleCritical, 'Bicycle - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Bicycle - Fair'), 
    0)

String bicycleFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Bicycle - Fair'))

WebUI.verifyMatch(bicycleFair, 'Bicycle - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_CenterTurn, Critical'), 
    0)

String centerTurnCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_CenterTurn, Critical'))

WebUI.verifyMatch(centerTurnCritical, 'CenterTurn, Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_CenterTurn - Fair'), 
    0)

String centerTurnFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_CenterTurn - Fair'))

WebUI.verifyMatch(centerTurnFair, 'CenterTurn - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_CenterTurn - Good'), 
    0)

String centerTurnGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_CenterTurn - Good'))

WebUI.verifyMatch(centerTurnGood, 'CenterTurn - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Crosswalk - Critical'), 
    0)

String crosswalkCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Crosswalk - Critical'))

WebUI.verifyMatch(crosswalkCritical, 'Crosswalk - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Crosswalk - Fair'), 
    0)

String crosswalkFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Crosswalk - Fair'))

WebUI.verifyMatch(crosswalkFair, 'Crosswalk - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Crosswalk - Good'), 
    0)

String crosswalkGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Crosswalk - Good'))

WebUI.verifyMatch(crosswalkGood, 'Crosswalk - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftStraight - Critical'), 
    0)

String leftStraightCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftStraight - Critical'))

WebUI.verifyMatch(leftStraightCritical, 'Left/Straight - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftStraightTurn, Fair'), 
    0)

String leftStraightTurnFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftStraightTurn, Fair'))

WebUI.verifyMatch(leftStraightTurnFair, 'LeftStraightTurn, Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftStraight - Good'), 
    0)

String leftStraightGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftStraight - Good'))

WebUI.verifyMatch(leftStraightGood, 'Left/Straight - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftTurn - Critical'), 
    0)

String leftTurnCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftTurn - Critical'))

WebUI.verifyMatch(leftTurnCritical, 'LeftTurn - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftTurn - Fair'), 
    0)

String leftTurnFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftTurn - Fair'))

WebUI.verifyMatch(leftTurnFair, 'LeftTurn - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftTurn - Good'), 
    0)

String leftTurnGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftTurn - Good'))

WebUI.verifyMatch(leftTurnGood, 'LeftTurn - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftTurnOnly, Critical'), 
    0)

String leftTurnOnlyCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_LeftTurnOnly, Critical'))

WebUI.verifyMatch(leftTurnOnlyCritical, 'LeftTurnOnly, Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Left Only - Fair'), 
    0)

String leftOnlyFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Left Only - Fair'))

WebUI.verifyMatch(leftOnlyFair, 'Left Only - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Left Only - Good'), 
    0)

String leftOnlyGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Left Only - Good'))

WebUI.verifyMatch(leftOnlyGood, 'Left Only - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Other, Critical'), 
    0)

String otherCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Other, Critical'))

WebUI.verifyMatch(otherCritical, 'Other, Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Other - Fair'), 
    0)

String otherFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Other - Fair'))

WebUI.verifyMatch(otherFair, 'Other - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Other - Good'), 
    0)

String otherGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Other - Good'))

WebUI.verifyMatch(otherGood, 'Other - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Parking, Fair'), 
    0)

String parkingFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Parking, Fair'))

WebUI.verifyMatch(parkingFair, 'Parking, Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Parking - Good'), 
    0)

String parkingGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Parking - Good'))

WebUI.verifyMatch(parkingGood, 'Parking - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RR Crossing - Critical'), 
    0)

String rrCrossingCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RR Crossing - Critical'))

WebUI.verifyMatch(rrCrossingCritical, 'RR Crossing - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RR Crossing - Good'), 
    0)

String rrCrossingGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RR Crossing - Good'))

WebUI.verifyMatch(rrCrossingGood, 'RR Crossing - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightStraight - Critical'), 
    0)

String rightStraightCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightStraight - Critical'))

WebUI.verifyMatch(rightStraightCritical, 'Right/Straight - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightStraight - Fair'), 
    0)

String rightStraightFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightStraight - Fair'))

WebUI.verifyMatch(rightStraightFair, 'Right/Straight - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightStraight - Good'), 
    0)

String rightStraightGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightStraight - Good'))

WebUI.verifyMatch(rightStraightGood, 'Right/Straight - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightTurn - Critical'), 
    0)

String rightTurnCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightTurn - Critical'))

WebUI.verifyMatch(rightTurnCritical, 'RightTurn - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightTurn - Fair'), 
    0)

String rightTurnFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightTurn - Fair'))

WebUI.verifyMatch(rightTurnFair, 'RightTurn - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightTurn - Good'), 
    0)

String rghtTurnGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightTurn - Good'))

WebUI.verifyMatch(rghtTurnGood, 'RightTurn - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightOnly - Critical'), 
    0)

String rightOnlyCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightOnly - Critical'))

WebUI.verifyMatch(rightOnlyCritical, 'RightOnly - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightTurnOnly, Fair'), 
    0)

String rightTurnOnlyFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightTurnOnly, Fair'))

WebUI.verifyMatch(rightTurnOnlyFair, 'RightTurnOnly, Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightOnly - Good'), 
    0)

String rightOnlyGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_RightOnly - Good'))

WebUI.verifyMatch(rightOnlyGood, 'RightOnly - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_SpeedBump - Critical'), 
    0)

String speedBumpCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_SpeedBump - Critical'))

WebUI.verifyMatch(speedBumpCritical, 'SpeedBump - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_SpeedBump - Fair'), 
    0)

String speedBumpFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_SpeedBump - Fair'))

WebUI.verifyMatch(speedBumpFair, 'SpeedBump - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_SpeedBump - Good'), 
    0)

String speedBumpGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_SpeedBump - Good'))

WebUI.verifyMatch(speedBumpGood, 'SpeedBump - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_StopLine - Critical'), 
    0)

String stoplineCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_StopLine - Critical'))

WebUI.verifyMatch(stoplineCritical, 'StopLine - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_StopLine - Fair'), 
    0)

String stoplineFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_StopLine - Fair'))

WebUI.verifyMatch(stoplineFair, 'StopLine - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_StopLine - Good'), 
    0)

String stoplineGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_StopLine - Good'))

WebUI.verifyMatch(stoplineGood, 'StopLine - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Straight - Critical'), 
    0)

String straightCritical = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Straight - Critical'))

WebUI.verifyMatch(straightCritical, 'Straight - Critical', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_StraightArrow, Fair'), 
    0)

String StraightArrowFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_StraightArrow, Fair'))

WebUI.verifyMatch(StraightArrowFair, 'StraightArrow, Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Straight - Good'), 
    0)

String straightGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Straight - Good'))

WebUI.verifyMatch(straightGood, 'Straight - Good', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_StraightArrow,Fair'), 
    0)

String straightArrowFair2 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_StraightArrow,Fair'))

WebUI.verifyMatch(straightArrowFair2, 'StraightArrow,Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Straightarrow, Fair (1)'), 
    0)

String straightArrowFair3 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Straightarrow, Fair (1)'))

WebUI.verifyMatch(straightArrowFair3, 'Straightarrow, Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Turn - Fair'), 
    0)

String turnFair = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Turn - Fair'))

WebUI.verifyMatch(turnFair, 'Turn - Fair', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Turn - Good'), 
    0)

String turnGood = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Turn - Good'))

WebUI.verifyMatch(turnGood, 'Turn - Good', false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

String buttonText = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/button_Other Assets - PavementMarkings'))

WebUI.verifyMatch(buttonText, 'OTHER ASSETS - PAVEMENTMARKINGS', false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/div_Other Assets - PavementMarkings (Featur_92d83d'))

String objectid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_objectid'))

WebUI.verifyMatch(objectid, 'objectid', false)

String session = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Session'))

WebUI.verifyMatch(session, 'Session', false)

String imageName = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Image_Name'))

WebUI.verifyMatch(imageName, 'Image_Name', false)

String category = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Category'))

WebUI.verifyMatch(category, 'Category', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Condition'), 
    0)

String condition = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Condition'))

WebUI.verifyMatch(condition, 'Condition', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Travel Direction'), 
    0)

String travelDirection = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Travel Direction'))

WebUI.verifyMatch(travelDirection, 'Travel Direction', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Color'), 
    0)

String color = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Color'))

WebUI.verifyMatch(color, 'Color', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_long'), 
    0)

String Long = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_long'))

WebUI.verifyMatch(Long, 'long', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_lat'), 
    0)

String lat = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_lat'))

WebUI.verifyMatch(lat, 'lat', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_uid'), 
    0)

String uid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_uid'))

WebUI.verifyMatch(uid, 'uid', false)

WebUI.scrollToElement(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Image Path'), 
    0)

String imagePath = WebUI.getText(findTestObject('DashBoard_Layers/Other_Assets/Pavement_Markings/Page_Streetlogix/vaadin-grid-sorter_Image Path'))

WebUI.verifyMatch(imagePath, 'Image Path', false)

