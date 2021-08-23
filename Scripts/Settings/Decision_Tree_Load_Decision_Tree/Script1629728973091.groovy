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

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Decision Tree Editor'))

def PCI1 = []

String pci1_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 0, Max 40'))

PCI1.add(pci1_1.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci2_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 40, Max 70'))

PCI1.add(pci2_1.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci3_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 80, Max 90'))

PCI1.add(pci3_1.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci4_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 90, Max 100'))

PCI1.add(pci4_1.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

def pciDB1 = []

pciDB1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMinMaxPCI'()

if (PCI1 == pciDB1) {
    println('Correct Decision Tree Loaded')
} else {
    throw new Exception('Decision Tree loaded is incorrect')
}

def MS1 = []

String ms1_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Reconstruction'))

MS1.add(ms1_1)

String ms2_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Rehabilitation'))

MS1.add(ms2_1)

String ms3_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Preventive Maintenance'))

MS1.add(ms3_1)

String ms4_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Defer Maintenance'))

MS1.add(ms4_1)

def msDB1 = []

msDB1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMaintenanceSuggestion'()

if (MS1 == msDB1) {
	println('Correct Decision Tree Loaded')
} else {
	throw new Exception('Decision Tree loaded is incorrect')
}

def COST1 = []

String cost1_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 100'))

COST1.add(cost1_1.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost2_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 25'))

COST1.add(cost2_1.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost3_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 11.25'))

COST1.add(cost3_1.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost4_1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 1.5'))

COST1.add(cost4_1.find('\\d{1,3}(?:\\.\\d{1,2})?'))

def costDB1 = []

costDB1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeCost'()
println(COST1)
println(costDB1)
if (COST1 == costDB1) {
	println('Correct Decision Tree Loaded')
} else {
	throw new Exception('Decision Tree loaded is incorrect')
}

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/button_Load Decision Tree'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/td_TESTING'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/button_Load Decision Tree'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/td_default'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/span_Save'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/span_Confirm'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/button_OK'))

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Decision Tree Editor'))

def PCI2 = []

String pci1_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 0, Max 40'))

PCI2.add(pci1_2.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci2_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 40, Max 70'))

PCI2.add(pci2_2.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci3_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 80, Max 90'))

PCI2.add(pci3_2.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci4_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 90, Max 100'))

PCI2.add(pci4_2.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

def pciDB2 = []

pciDB2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMinMaxPCILoadNew'()
println(PCI2)
println(pciDB2)
if (PCI2 == pciDB2) {
    println('Correct Decision Tree Loaded')
} else {
    throw new Exception('Decision Tree loaded is incorrect')
}

def MS2 = []

String ms1_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Reconstruction'))

MS2.add(ms1_2)

String ms2_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Rehabilitation'))

MS2.add(ms2_2)

String ms3_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Preventive Maintenance'))

MS2.add(ms3_2)

String ms4_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Defer Maintenance'))

MS2.add(ms4_2)

def msDB2 = []

msDB2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMaintenanceSuggestionLoadNew'()

if (MS2 == msDB2) {
	println('Correct Decision Tree Loaded')
} else {
	throw new Exception('Decision Tree loaded is incorrect')
}

def COST2 = []

String cost1_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 100'))

COST2.add(cost1_2.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost2_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 25'))

COST2.add(cost2_2.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost3_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 11.25'))

COST2.add(cost3_2.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost4_2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 1.5'))

COST2.add(cost4_2.find('\\d{1,3}(?:\\.\\d{1,2})?'))

def costDB2 = []

costDB2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeCostLoadNew'()
println(COST2)
println(costDB2)
if (COST2 == costDB2) {
	println('Correct Decision Tree Loaded')
} else {
	throw new Exception('Decision Tree loaded is incorrect')
}

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/button_Load Decision Tree'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/td_test warning'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/span_Save'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/span_OK'))

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Decision Tree Editor'))

def PCI3 = []

String pci1_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 0, Max 40'))

PCI3.add(pci1_3.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci2_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 40, Max 70'))

PCI3.add(pci2_3.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci3_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 80, Max 90'))

PCI3.add(pci3_3.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci4_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Min 90, Max 100'))

PCI3.add(pci4_3.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

def pciDB3 = []

pciDB3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMinMaxPCI'()

if (PCI3 == pciDB3) {
    println('Correct Decision Tree Loaded')
} else {
    throw new Exception('Decision Tree loaded is incorrect')
}

def MS3 = []

String ms1_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Reconstruction'))

MS3.add(ms1_3)

String ms2_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Rehabilitation'))

MS3.add(ms2_3)

String ms3_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Preventive Maintenance'))

MS3.add(ms3_3)

String ms4_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Defer Maintenance'))

MS3.add(ms4_3)

def msDB3 = []

msDB3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMaintenanceSuggestion'()

if (MS3 == msDB3) {
	println('Correct Decision Tree Loaded')
} else {
	throw new Exception('Decision Tree loaded is incorrect')
}

def COST3 = []

String cost1_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 100'))

COST3.add(cost1_3.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost2_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 25'))

COST3.add(cost2_3.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost3_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 11.25'))

COST3.add(cost3_3.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost4_3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading_Decision_Tree/Page_Streetlogix/div_Unit Cost (yd) 1.5'))

COST3.add(cost4_3.find('\\d{1,3}(?:\\.\\d{1,2})?'))

def costDB3 = []

costDB3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeCost'()
println(COST3)
println(costDB3)
if (COST3 == costDB3) {
	println('Correct Decision Tree Loaded')
} else {
	throw new Exception('Decision Tree loaded is incorrect')
}