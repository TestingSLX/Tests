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

def countBefore = CustomKeywords.'com.database_keywords.test.Database_Keywords.getWorkOrdersCount'()

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/div_Work Orders'))

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/div_Roads and Highways'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/li_All Groups'))

WebUI.setText(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_All Groups_MuiInputBase-input-450 Mui_1e97bd'), 
    'Atest')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/span_Atest'))

WebUI.setText(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Assignee'), 'Demo User')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/li_DUDemo User'))

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

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/p_Work order is created'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/button_OK'))

def countAfter = CustomKeywords.'com.database_keywords.test.Database_Keywords.getWorkOrdersCount'()

if (countAfter == (countBefore + 1)) {
	println('Work Order Created')
} else {
	throw new Exception('Work Orders are not Created')
}

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/div_Dashboard'))

WebUI.switchToWindowTitle('Steetlogix | Dashboard')

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/div_Work Orders2'))

WebUI.clickOffset(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Steetlogix  Dashboard/Page_Steetlogix  Dashboard/div_Offset1'), 
    50, 50)

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Steetlogix  Dashboard/Page_Steetlogix  Dashboard/div_Group FilterSelect GroupRoads and Highways'))

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Steetlogix  Dashboard/Page_Steetlogix  Dashboard/div_Roads and Highways'))

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Steetlogix  Dashboard/Page_Steetlogix  Dashboard/li_All'))

WebUI.clickOffset(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/div_offset'), 99, 99)

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Steetlogix  Dashboard/div_Creation Date'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Steetlogix  Dashboard/div_Creation Date'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Steetlogix  Dashboard/div_Atest'))

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/span_Equipment1'))

WebUI.verifyElementAttributeValue(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Equipment1_Dashboard'), 'value', 'Axe', 0)

WebUI.verifyElementAttributeValue(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Equipment2_Dashboard'), 'value', 'Snow Plow', 0)

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/span_Material1'))

WebUI.verifyElementAttributeValue(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Material1_Dashboard'), 'value', 'Concrete', 0)

WebUI.verifyElementAttributeValue(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Material2_Dashboard'), 'value', 'Asphalt', 0)

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/span_Labor1'))

WebUI.verifyElementAttributeValue(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Labor1_Dashboard'), 'value', 'Manager', 0)

WebUI.verifyElementAttributeValue(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/input_Labor2_Dashboard'), 'value', 'Supervisor', 0)

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Steetlogix  Dashboard/span_Cost'))

WebUI.click(findTestObject('Work_Orders/Create_WorkOrder_Resource_Management/Page_Streetlogix/div_cost2'))

def resources = []
resources = CustomKeywords.'com.database_keywords.test.Database_Keywords.workOrderResources'()

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Steetlogix  Dashboard/span_DELETE'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_WorkOrder_Resource_Management/Page_Steetlogix  Dashboard/span_Yes'))

def demoResources = ['Axe', 'Snow Plow', 'Concrete', 'Asphalt', 'Manager', 'Supervisor']

if(resources == demoResources) {
	println('All resources are stored in database')
} else {
	throw new Exception('Resources not stored in database')
}

WebUI.closeBrowser()

