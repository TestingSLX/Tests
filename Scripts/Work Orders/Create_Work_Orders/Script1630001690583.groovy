import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.datatransfer.StringSelection as StringSelection
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.thoughtworks.selenium.webdriven.commands.KeyEvent as KeyEvent
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Work Orders'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Roads and Highways'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/li_All Groups'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h1_Work Orders'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h6_Select Form'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Filter by group'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Filter by name'))

WebUI.setText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input_All Groups_MuiInputBase-input-450 Mui_1e97bd'), 
    'ATest1')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/div_ATest1'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h1_Work Orders'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h6_ATest1'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/span_Send Email Notification'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/span_Send Email Notification'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/span_Send Email Notification'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Select Assignee'))

WebUI.setText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input_Assignee'), 'Demo Admin')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/li_Demo Admin'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Asset Id'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Due Date'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Due Date'))

WebUI.setText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input__due_date'), '09/26/2021')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Address'))

WebUI.setText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input_Address'), 'Forest Ave')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/li_FOREST AVE, Portland, ME, USA'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Note'))

WebUI.setText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/textarea_Testing'), 'Testing')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Priority'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Urgent'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/li_High'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Status'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/div_New'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/li_In Progress'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Attachments'))
//
CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\Charts.png')
//
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\Charts.jpeg')

//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\BudgetPlannerResult.docx')
//
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\BudgetPlannerReport.pdf')
//
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\GroupsData.csv')
//
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\screencapture.webm')
//
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\WorkorderData.xlsx')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Repeating'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Asset'))

WebUI.verifyElementHasAttribute(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input_Upload_asset'), 'disabled', 0) 

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/button_Save'))

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Work order is created'), 'Work order is created!')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/button_OK'))

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h1_Work Orders'), 'Work Orders')

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h6_Select Form'), 'Select Form')

