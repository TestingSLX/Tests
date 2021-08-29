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

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Repeating'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Asset'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input_Upload_asset'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Work order is created'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/button_OK'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h1_Work Orders'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h6_Select Form'))

