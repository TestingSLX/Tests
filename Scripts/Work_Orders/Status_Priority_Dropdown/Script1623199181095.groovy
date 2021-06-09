import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8081/?config=9c338e84e55940e4ba48a09e9f5aef32&url=https://streetlogix-dev-server.herokuapp.com&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAyNiwibmFtZSI6IlNocnV0aWthIFNhd2FudCIsImV4cCI6MTYyNTY2NDU3NiwiaWF0IjoxNjIzMDcyNTc2fQ.vEFh0PAIs6ZT0JQnknJ_XJleZWCSWMvOzTGa6L5F4k0')

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/div_Work Orders'))

WebUI.click(findTestObject('Work_Orders/Select_group/Page_Streetlogix/div_All groups'))

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/li_Operations'))

WebUI.setText(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/input_Operations_MuiInputBase-input-852 Mui_49be15'),
	'asphalt cost')

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/div_asphalt cost'))

WebUI.click(findTestObject('Create_work_Order/Page_Streetlogix/div_Urgent'))

List<WebElement> list1 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/ul_UrgentHighMediumLow'),
	30)

List<WebElement> priorityList1 = new ArrayList()

def priorityList2 = ((['Urgent', 'High', 'Medium', 'Low']) as String[])

for (WebElement el : list1) {
	priorityList1.add(el.getText())
}

if (priorityList1.equals(priorityList2)) {
	println('Priority')
} else {
	throw new Exception('Priorities list do not match')
}

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/li_High'))

WebUI.click(findTestObject('Create_work_Order/Page_Streetlogix/div_New'))

List<WebElement> list2 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/ul_NewIn ProgressFeedbackClosed'),
	30)

List<WebElement> statusList1 = new ArrayList()

def statusList2 = ((['New', 'In Progress', 'Feedback', 'Closed']) as String[])

for (WebElement el : list2) {
	statusList1.add(el.getText())
}

if (statusList1.equals(statusList2)) {
	println('Status')
} else {
	throw new Exception('Status list do not match')
}