import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import groovy.time.TimeCategory

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

def countBefore = CustomKeywords.'com.database_keywords.test.Database_Keywords.getWorkOrdersCount'()

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
	
WebUI.sendKeys(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input__due_date'), Keys.chord(Keys.CONTROL,'a'))

WebUI.sendKeys(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input__due_date'), Keys.chord(Keys.DELETE))

def acceptedFormat = "MM/dd/yyyy"
def today = new Date()
def currentdate = today.format(acceptedFormat)
println(currentdate)
def newDueDate = ''
use(TimeCategory) {
	def sevenDays = today + 7.days
	newDueDate = sevenDays.format(acceptedFormat)
    println(newDueDate)
}

WebUI.setText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input__due_date'), newDueDate)

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Address'))

//WebUI.setText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input_Address'), 'Forest Ave')
//
//WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/li_FOREST AVE, Portland, ME, USA'))

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
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'Charts.jpeg')
//
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\Charts.jpeg')
//
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\BudgetPlannerResult.docx')
//
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\BudgetPlannerReport.pdf')
//
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\GroupsData.csv')
//
CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'video.mp4')
//
//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\WorkorderData.xlsx')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Repeating'))

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Asset'))

WebUI.verifyElementHasAttribute(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input_Upload_asset'), 'disabled', 
    0)

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/button_Save'), 'SAVE')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/button_Save'))

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Work order is created'), 'Work order is created!')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/button_OK'))

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h1_Work Orders'), 'Work Orders')

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h6_Select Form'), 'Select Form')

def countAfter = CustomKeywords.'com.database_keywords.test.Database_Keywords.getWorkOrdersCount'()

if(countAfter == countBefore + 1) {
	println('Work Order Created')
} else {
	throw new Exception('All Work Orders are not Created')
}

def status = CustomKeywords.'com.database_keywords.test.Database_Keywords.verifyVideosUploaded'()

WebUI.verifyMatch(status, 'Uploaded', false)




