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

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Decision Tree Editor'))

WebUI.click(findTestObject('Settings/Decision_Tree_Loading/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/h1_Decision Tree Editor'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_AssetPavement'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Surface TypeAsphalt'))

def pci = []

String pci1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Min 0, Max 40'))

pci.add(pci1.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Min 40, Max 70'))

pci.add(pci2.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Min 80, Max 90'))

pci.add(pci3.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

String pci4 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Min 90, Max 100'))

pci.add(pci4.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))

def pciDB = []

pciDB = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMinMaxPCI'()

if (pci == pciDB) {
    println('Correct Decision Tree Loaded')
} else {
    throw new Exception('Decision Tree loaded is incorrect')
}

def ms = []

String ms1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Reconstruction'))

ms.add(ms1)

String ms2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Rehabilitation'))

ms.add(ms2)

String ms3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Preventive Maintenance'))

ms.add(ms3)

String ms4 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Defer Maintenance'))

ms.add(ms4)

def msDB = []

msDB = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMaintenanceSuggestion'()
println(ms)
println(msDB)
if (ms == msDB) {
	println('Correct Decision Tree Loaded')
} else {
	throw new Exception('Decision Tree loaded is incorrect')
}

def cost = []

String cost1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Unit Cost (yd) 100'))

cost.add(cost1.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Unit Cost (yd) 25'))

cost.add(cost2.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Unit Cost (yd) 11.25'))

cost.add(cost3.find('\\d{1,3}(?:\\.\\d{1,2})?'))

String cost4 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Loading/Page_Streetlogix/div_Unit Cost (yd) 1.5'))

cost.add(cost4.find('\\d{1,3}(?:\\.\\d{1,2})?'))

def costDB = []

costDB = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeCost'()
println(cost)
println(costDB)
if (cost == costDB) {
	println('Correct Decision Tree Loaded')
} else {
	throw new Exception('Decision Tree loaded is incorrect')
}