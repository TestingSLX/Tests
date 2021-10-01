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

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/div_Budget Estimator'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/label_Select layer'), 'Select layer')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/label_Filter by'), 'Filter by')

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/div_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/li_Ward'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/label_Select category'), 'Select category')

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/div_Ward'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/li_1'))

def CI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCI'()

String targetCI = CI + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/h6_Target condition index 63'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_134,427'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_63'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/div_Ward'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/li_2'))

def CI1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCI'()

String targetCI1 = CI1 + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI1)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/h6_Target condition index 64'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_2,315,754'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_64'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/div_Ward'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/li_3'))

def CI2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCI'()

String targetCI2 = CI2 + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI2)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/h6_Target condition index 67'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_3,726,993'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_67'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/div_Ward'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/li_4'))

def CI3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCI'()

String targetCI3 = CI3 + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI3)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/h6_Target condition index 66'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_339,688'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_66'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/span_Cancel'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/div_Ward'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/li_5'))

def CI4 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCI'()

String targetCI4 = CI4 + 1

WebUI.setText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/input_Target condition index_MuiInputBase-i_93bbd1'), 
    targetCI4)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/svg_020406080100'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/h6_Target condition index 67'))

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Year'), 'Year')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Budget'), 'Budget')

WebUI.verifyElementText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/th_Condition Index'), 'Condition Index')

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_1'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_2,624,330'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/td_67'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_Ward/Page_Streetlogix/span_Cancel'))

