import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Work Orders'))

WebUI.click(findTestObject('Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Roads and Highways'))
//
//List<WebElement> groups = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_Roads and HighwaysFreshcodeOne more grou_d8e86b'),30)
//
//List<WebElement> allGroupsList1 = new ArrayList()
//
//for (WebElement elG : groups) {
//	allGroupsList1.add(elG.getText())
//}
//
//def allGroupsList2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getGroups'()
////allGroupsList2.add('All Groups')
//println(allGroupsList2)
//println(allGroupsList1)
//if (allGroupsList2.containsAll(allGroupsList1)) {
//	println('All groups displayed in dropdown')
//} else {
//	throw new Exception('All groups are not displayed in dropdown')
//}

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_All Groups'))

List<WebElement> list = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_asphalt costAtestATest1Bridge Maintenanc_41699c'),
	30)

List<WebElement> allFormsList_1 = new ArrayList()

for (WebElement el : list) {
	allFormsList_1.add(el.getText())
}

def allFormsList_2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAllForms'()

if (allFormsList_1.containsAll(allFormsList_2)) {
	println('All Forms are displayed')
} else {
	throw new Exception('Wrong forms displayed')
}

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/p_Filter by group'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/p_Filter by name'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/h1_Work Orders'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/p_Filter by name'))

WebUI.click(findTestObject('Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Roads and Highways'))

String form1 = WebUI.getText(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_Roads and Highways'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_Roads and Highways'))

List<WebElement> list1 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_asphalt costAtestATest1Bridge Maintenanc_41699c'),
	30)

List<WebElement> allFormsList1 = new ArrayList()

for (WebElement el1 : list1) {
	allFormsList1.add(el1.getText())
}

def allFormsList2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getForms'(form1)
//
if (allFormsList1.containsAll(allFormsList2)) {
	println('All Forms are displayed')
} else {
	throw new Exception('Wrong forms displayed')
}

WebUI.click(findTestObject('Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Roads and Highways'))

String form2 = WebUI.getText(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_Freshcode'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_Freshcode'))

List<WebElement> list2 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_asphalt costAtestATest1Bridge Maintenanc_41699c'),
	30)

List<WebElement> allForms2List1 = new ArrayList()

for (WebElement el2 : list2) {
	allForms2List1.add(el2.getText())
}

def allForms2List2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getForms'(form2)

if (allForms2List1.containsAll(allForms2List2)) {
	println('All Forms are displayed')
} else {
	throw new Exception('Wrong forms displayed')
}

WebUI.click(findTestObject('Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Roads and Highways'))

String form3 = WebUI.getText(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_One more group'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_One more group'))

List<WebElement> list3 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_asphalt costAtestATest1Bridge Maintenanc_41699c'),
	30)

List<WebElement> allForms3List1 = new ArrayList()

for (WebElement el3 : list3) {
	allForms3List1.add(el3.getText())
}

def allForms3List2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getForms'(form3)

if (allForms3List1.containsAll(allForms3List2)) {
	println('All Forms are displayed')
} else {
	throw new Exception('Wrong forms displayed')
}

WebUI.click(findTestObject('Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Roads and Highways'))

String form4 = WebUI.getText(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_Operations'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_Operations'))

List<WebElement> list4 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_asphalt costAtestATest1Bridge Maintenanc_41699c'),
	30)

List<WebElement> allForms4List1 = new ArrayList()

for (WebElement el4 : list4) {
	allForms4List1.add(el4.getText())
}

def allForms4List2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getForms'(form4)
println(allForms4List1)
println(allForms4List2)
if (allForms4List1.containsAll(allForms4List2)) {
	println('All Forms are displayed')
} else {
	throw new Exception('Wrong forms displayed')
}

WebUI.click(findTestObject('Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Roads and Highways'))

String form5 = WebUI.getText(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_Parks and Open Space'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_Parks and Open Space'))

List<WebElement> list5 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_asphalt costAtestATest1Bridge Maintenanc_41699c'),
	30)

List<WebElement> allForms5List1 = new ArrayList()

for (WebElement el5 : list5) {
	allForms5List1.add(el5.getText())
}

def allForms5List2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getForms'(form5)

if (allForms5List1.containsAll(allForms5List2)) {
	println('All Forms are displayed')
} else {
	throw new Exception('Wrong forms displayed')
}

WebUI.click(findTestObject('Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Roads and Highways'))

String form6 = WebUI.getText(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_Sidewalks'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_Sidewalks'))

List<WebElement> list6 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_asphalt costAtestATest1Bridge Maintenanc_41699c'),
	30)

List<WebElement> allForms6List1 = new ArrayList()

for (WebElement el6 : list6) {
	allForms6List1.add(el6.getText())
}

def allForms6List2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getForms'(form6)

if (allForms6List1.containsAll(allForms6List2)) {
	println('All Forms are displayed')
} else {
	throw new Exception('Wrong forms displayed')
}

WebUI.click(findTestObject('Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Roads and Highways'))

String form7 = WebUI.getText(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_users'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_users'))

List<WebElement> list7 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_asphalt costAtestATest1Bridge Maintenanc_41699c'),
	30)

List<WebElement> allForms7List1 = new ArrayList()

for (WebElement el7 : list7) {
	allForms7List1.add(el7.getText())
}

def allForms7List2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getForms'(form7)

if (allForms7List1.containsAll(allForms7List2)) {
	println('All Forms are displayed')
} else {
	throw new Exception('Wrong forms displayed')
}

WebUI.click(findTestObject('Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Roads and Highways'))

String form8 = WebUI.getText(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_water group'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_water group'))

List<WebElement> list8 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_asphalt costAtestATest1Bridge Maintenanc_41699c'),
	30)

List<WebElement> allForms8List1 = new ArrayList()

for (WebElement el8 : list8) {
	allForms8List1.add(el8.getText())
}

def allForms8List2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getForms'(form8)

if (allForms8List1.containsAll(allForms8List2)) {
	println('All Forms are displayed')
} else {
	throw new Exception('Wrong forms displayed')
}

WebUI.click(findTestObject('Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/div_Roads and Highways'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/li_All Groups'))

List<WebElement> list9 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Work_Orders/Verify_Forms_In_Groups/Page_Streetlogix/ul_asphalt costAtestATest1Bridge Maintenanc_41699c'),
	30)

List<WebElement> allForms9List1 = new ArrayList()

for (WebElement el9 : list9) {
	allForms9List1.add(el9.getText())
}

def allForms9List2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAllForms'()

if (allForms9List1.containsAll(allForms9List2)) {
	println('All Forms are displayed')
} else {
	throw new Exception('Wrong forms displayed')
}
