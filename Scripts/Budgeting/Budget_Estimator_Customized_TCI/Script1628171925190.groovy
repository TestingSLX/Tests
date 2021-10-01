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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/div_Budget Estimator'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/label_Filter by'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/div_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/li_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/label_Program duration'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/div_Program_Duration'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/li_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/label_Target condition index'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/svg_Target condition index_MuiSvgIcon-root-446'))

def CI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCI'()

String targetCI = CI + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/input_Budget for Year 1_MuiInputBase-input-_141922'), 
    targetCI)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/h6_Target condition index 67'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/th_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/th_Budget'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/th_Condition Index'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/td_21,082,298'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/td_67'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/div_Program_Duration'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/li_2'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/svg_Target condition index_MuiSvgIcon-root-446'))

WebUI.setText(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/input_11'), targetCI)

String targetCI2 = CI + 2

WebUI.setText(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/input_22'), targetCI2)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/h6_Target condition index 68'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/th_Year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/th_Budget'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/th_Condition Index'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/td_21,082,298'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/td_67'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/td_2'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/td_15,579,467'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/td_68'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/h1_Budget Estimator'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Customized_TCI/Page_Streetlogix/span_Current average condition index 64.627'))

