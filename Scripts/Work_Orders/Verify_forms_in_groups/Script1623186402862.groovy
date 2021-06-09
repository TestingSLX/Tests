import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8081/?config=9c338e84e55940e4ba48a09e9f5aef32&url=https://streetlogix-dev-server.herokuapp.com&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAyNiwibmFtZSI6IlNocnV0aWthIFNhd2FudCIsImV4cCI6MTYyNTY2NDU3NiwiaWF0IjoxNjIzMDcyNTc2fQ.vEFh0PAIs6ZT0JQnknJ_XJleZWCSWMvOzTGa6L5F4k0')

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_forms_in_group/Page_Streetlogix/div_Work Orders'))

List<WebElement> list = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_forms_in_group/Allgroups/Page_Streetlogix/ul_forms'), 30)
List<String> allGroupsList1 = new ArrayList<>()
def allGroupsList2 = ["AAA111", "AAAAAA", "asphalt cost", "Bridge Maintenance", "Catch Basin", "Catch Basin 3", "Conduct Road Patrol", "Dead Animal", "Dead Animal 2", "Develop - Test 1", "Feb 03rd form", "Fire Hydrant Maintenance", "Guardrail Maintenance", "Matloob's Form", "Park Maintenance", "Park Maintenance 2", "Pavement Repair", "PCI Inspection", "Pothole Filling", "Ramp Maintenance", "Service Request", "Sidewalk Maintenance", "Sign Maintenance", "Sign Maintenance with cost", "Street Furniture Maintenance", "Test Sohaib", "Traffic Signal Maintenance", "Tree Maintenance"] as String[]

for(WebElement el : list) {
	allGroupsList1.add(el.getText())
}

if(allGroupsList1.equals(allGroupsList2)) {
	println("All Groups")
} else {
	throw new Exception("All groups form do not match")
}

WebUI.click(findTestObject('Object Repository/Work_Orders/Select_group/Page_Streetlogix/div_All groups'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Select_group/Page_Streetlogix/li_Operations'))

List<WebElement> list2 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_forms_in_group/Allgroups/Page_Streetlogix/ul_forms'), 30)
List<String> operationsList1 = new ArrayList<>()
def operationsList2 = ["asphalt cost", "Conduct Road Patrol",  "Park Maintenance", "PCI Inspection", "Service Request"] as String[]

for(WebElement el : list2) {
	operationsList1.add(el.getText())
}

if(operationsList1.equals(operationsList2)) {
	println("Operations")
} else {
	throw new Exception("Operations form do not match")
}

WebUI.click(findTestObject('Object Repository/Work_Orders/Select_group/Page_Streetlogix/div_All groups'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Select_group/Page_Streetlogix/li_Roads and Highways'))

List<WebElement> list3 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_forms_in_group/Allgroups/Page_Streetlogix/ul_forms'), 30)
List<String> raodsList1 = new ArrayList<>()
def raodsList2 = ["Bridge Maintenance", "Conduct Road Patrol",  "Dead Animal 2", "PCI Inspection", "Service Request", "Sign Maintenance with cost"] as String[]

for(WebElement el : list3) {
	raodsList1.add(el.getText())
}

if(raodsList1.equals(raodsList2)) {
	println("Roads And Highways")
} else {
	throw new Exception("Roads and Highways form do not match")
}

WebUI.click(findTestObject('Object Repository/Work_Orders/Select_group/Page_Streetlogix/div_All groups'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Select_group/Page_Streetlogix/li_water group'))

List<WebElement> list4 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_forms_in_group/Allgroups/Page_Streetlogix/ul_forms'), 30)
List<String> waterList1 = new ArrayList<>()
def waterList2 = ["Catch Basin", "Catch Basin 3",  "Pavement Repair"] as String[]

for(WebElement el : list4) {
	waterList1.add(el.getText())
}

if(waterList1.equals(waterList2)) {
	println("Water Group")
} else {
	throw new Exception("Water group form do not match")
}

