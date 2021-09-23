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
    'ATest')

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

WebUI.setText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/input_Address'), 'Forest Ave, Portland, ME, 04103, USA')

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

//CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'), 'C:\\Users\\shrut\\Downloads\\Streetlogix_Upload_Docs\\Charts.jpeg')
//
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

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/p_Equipment'))

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Euipment_Switch'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Equipment1'), 'Axe')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/li_Axe-Hr-3'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Equipment_Quantity1'),
	'10')

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/span_Add Item Equipment'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Equipment2'), 'Snow Plow')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/li_Snow Plow-Hr-115'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Equipment_Quantity2'),
	'10')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/p_Material'))

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Material_Switch'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Material1'), 'Concrete')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/li_Concrete-Ton-125.3'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Material_Quantity1'),
	'10')

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/span_Add Item Quantity'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Material2'), 'Asphalt')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/li_Asphalt-Ton-15'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Material_Quantity2'),
	'10')

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Labor_Switch'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/p_Labor'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Labor1'), 'Manager')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/li_Manager-Hr-500'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Labor_Quantity1'),
	'10')

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/span_Add Item Labor'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Labor2'), 'Supervisor')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/li_Supervisor-Hr-90'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Labor_Quantity2'),
	'10')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/p_Total'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/div_8483.00'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input_Upload_repeating'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/div_Daily'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/li_Weekly'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input__till'))

WebUI.sendKeys(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input__till'),
	Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input__till'),
	Keys.chord(Keys.DELETE))

def acceptedFormat1 = 'MM/dd/yyyy'

def today1 = new Date()

def currentdate1 = today1.format(acceptedFormat1)

println(currentdate1)

def repeatUntil1 = ''

use(TimeCategory, {
		def sevenDays1 = today1 + 4.weeks

		repeatUntil1 = sevenDays1.format(acceptedFormat1)

		println(repeatUntil1)
	})

WebUI.setText(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input__till'),
	repeatUntil1)

CustomKeywords.'com.database_keywords.test.Database_Keywords.uploadFile'(findTestObject('Object Repository/Work_Orders/Create_Work_Orders/Page_Streetlogix/div_Upload'),
	'Charts.jpeg')

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/button_Save'), 'SAVE')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/button_Save'))

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/p_Work order is created'), 'Work order is created!')

WebUI.click(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/button_OK'))

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h1_Work Orders'), 'Work Orders')

WebUI.verifyElementText(findTestObject('Work_Orders/Create_Work_Orders/Page_Streetlogix/h6_Select Form'), 'Select Form')

def countAfter = CustomKeywords.'com.database_keywords.test.Database_Keywords.getWorkOrdersCount'()

if(countAfter == countBefore + 4) {
	println('Work Order Created')
} else {
	throw new Exception('All Work Orders are not Created')
}

def statusAttachment = CustomKeywords.'com.database_keywords.test.Database_Keywords.verifyAttachmentForRepeatingWorkorders'()

WebUI.verifyMatch(statusAttachment, 'Uploaded', false)

def resources = []
resources = CustomKeywords.'com.database_keywords.test.Database_Keywords.workOrderResources'()

def demoResources = ['Axe', 'Snow Plow', 'Concrete', 'Asphalt', 'Manager', 'Supervisor']

if(resources == demoResources) {
	println('All resources are stored in database')
} else {
	throw new Exception('Resources not stored in database')
}

def statusResources = CustomKeywords.'com.database_keywords.test.Database_Keywords.verifyResourcesInRepeatingWorkOrders'()

WebUI.verifyMatch(statusResources, 'True', false)



