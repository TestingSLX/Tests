import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Work_Orders_Samples/Verify_forms_in_group/Page_Streetlogix/div_Work Orders'))

List<WebElement> list = WebUiCommonHelper.findWebElements(findTestObject('Work_Orders_Samples/Verify_forms_in_group/Allgroups/Page_Streetlogix/ul_forms'), 
    30)

List<WebElement> allGroupsList1 = new ArrayList()

def allGroupsList2 = ((['AAA111', 'AAAAAA', 'asphalt cost', 'Bridge Maintenance', 'Catch Basin', 'Catch Basin 3', 'Conduct Road Patrol'
        , 'Dead Animal', 'Dead Animal 2', 'Develop - Test 1', 'Feb 03rd form', 'Fire Hydrant Maintenance', 'Guardrail Maintenance'
        , 'Matloob\'s Form', 'Park Maintenance', 'Park Maintenance 2', 'Pavement Repair', 'PCI Inspection', 'Pothole Filling'
        , 'Ramp Maintenance', 'Service Request', 'Sidewalk Maintenance', 'Sign Maintenance', 'Sign Maintenance with cost'
        , 'Street Furniture Maintenance', 'Test Sohaib', 'Traffic Signal Maintenance', 'Tree Maintenance']) as String[])

for (WebElement el : list) {
    allGroupsList1.add(el.getText())
}

if (allGroupsList1.equals(allGroupsList2)) {
    println('All Groups')
} else {
    throw new Exception('All groups form do not match')
}

WebUI.click(findTestObject('Work_Orders_Samples/Select_group/Page_Streetlogix/div_All groups'))

List<WebElement> groups = WebUiCommonHelper.findWebElements(findTestObject('Work_Orders_Samples/Verify_forms_in_group/Page_Streetlogix/ul_GroupsDropdown'), 30)

println(groups.size())

for(group in groups) {
	if(group.getProperties()["text"].equals("Operations")) {
		group.click()
		List<WebElement> list2 = WebUiCommonHelper.findWebElements(findTestObject('Work_Orders_Samples/Verify_forms_in_group/Allgroups/Page_Streetlogix/ul_forms'),
		    30)
		
		List<WebElement> operationsList1 = new ArrayList()
		
		def operationsList2 = ((['asphalt cost', 'Conduct Road Patrol', 'Park Maintenance', 'PCI Inspection', 'Service Request']) as String[])
		
		for (WebElement el : list2) {
		    operationsList1.add(el.getText())
		}
		
		if (operationsList1.equals(operationsList2)) {
		    println('Operations')
		} else {
		    throw new Exception('Operations form do not match')
		}
	}
}

WebUI.click(findTestObject('Work_Orders_Samples/Select_group/Page_Streetlogix/div_All groups'))

List<WebElement> groups1 = WebUiCommonHelper.findWebElements(findTestObject('Work_Orders_Samples/Verify_forms_in_group/Page_Streetlogix/ul_GroupsDropdown'), 30)

println(groups1.size())

for(group1 in groups1) {
	
	if(group1.getProperties()["text"].equals("Roads and Highways")) {
		group1.click()
		List<WebElement> list3 = WebUiCommonHelper.findWebElements(findTestObject('Work_Orders_Samples/Verify_forms_in_group/Allgroups/Page_Streetlogix/ul_forms'),
			30)
		
		List<WebElement> raodsList1 = new ArrayList()
		
		def raodsList2 = ((['Bridge Maintenance', 'Conduct Road Patrol', 'Dead Animal 2', 'PCI Inspection', 'Service Request', 'Sign Maintenance with cost']) as String[])
		
		for (WebElement el : list3) {
			raodsList1.add(el.getText())
		}
		
		if (raodsList1.equals(raodsList2)) {
			println('Roads And Highways')
		} else {
			throw new Exception('Roads and Highways form do not match')
		}
	}
}

WebUI.click(findTestObject('Work_Orders_Samples/Select_group/Page_Streetlogix/div_All groups'))

List<WebElement> groups2 = WebUiCommonHelper.findWebElements(findTestObject('Work_Orders_Samples/Verify_forms_in_group/Page_Streetlogix/ul_GroupsDropdown'), 30)

println(groups2.size())

for(group2 in groups2) {
	
	if(group2.getProperties()["text"].equals("water group")) {
		group2.click()
		List<WebElement> list4 = WebUiCommonHelper.findWebElements(findTestObject('Work_Orders_Samples/Verify_forms_in_group/Allgroups/Page_Streetlogix/ul_forms'), 30)
		
		List<WebElement> waterList1 = new ArrayList()
		
		def waterList2 = ((['Catch Basin', 'Catch Basin 3', 'Pavement Repair']) as String[])
		
		for (WebElement el : list4) {
		    waterList1.add(el.getText())
		}
		
		if (waterList1.equals(waterList2)) {
		    println('Water Group')
		} else {
		    throw new Exception('Water group form do not match')
		}
	}
}

