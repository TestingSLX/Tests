import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Decision Tree Editor'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h1_Decision Tree Editor'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Hierachy'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Save_Hierarchy'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_AssetPavement'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/text_1'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h2_Add Child Node'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Please select from unique values for this node'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h6_Surface Type'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Value'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_SurfaceType_Dropdown'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/li_Asphalt'))

WebUI.clickOffset(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_offset'), 50, 50)

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_Is last level node_nullNode'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Add_Surface_Type_Asphalt'))
//
WebDriver driver = DriverFactory.getWebDriver()
//
def el = driver.findElements(By.xpath("//g[starts-with(@id='1631803')]")).get(1)
el.click()
//List<WebElement> elements = WebUI.executeJavaScript("return document.getElementsByClassName('node-button-g')", null)
////
//println(elements)
//
//elements[1].click()

//WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/text_1'))
//
//WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_SurfaceType_Dropdown'))
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/li_Concrete'))
//
//WebUI.clickOffset(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_offset'), 50, 50)
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Include null value'))

//WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Add_Surface_Type_Concrete'))

//WebUI.executeJavaScript('elements[1]', null)
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h2_Add Child Node'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Please set min and max boundary for this node'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h6_PCI'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Min'))
////
////WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_PCI_min1'), '0')
////
////WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_PCI_max1'), '30')
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Max'))
////
////WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Min Included1'))
////
////WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Max Included1'))
////
////WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Add_PCI1'))
////
////WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/text_3'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h2_Add Child Node'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Please set min and max boundary for this node'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h6_PCI'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Min'))
////
////WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_PCI_min2'), '30')
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Max'))
////
////WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_PCI_max2'), '100')
////
////WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Max Included2'))
////
////WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Add_PCI2'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_nullUnit Cost (yd) 0'))
////
////WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_Edit Node_ms1'), 'Reconstruction')
////
////WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input__uc1'), '0100')
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Maintenance Suggestion'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Cost (yd)'))
////
////WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Save_Node1'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_nullUnit Cost (yd) 0'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Maintenance Suggestion'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Cost (yd)'))
////
////WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_Edit Node_ms2'), 'Defer Maintenance')
////
////WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input__uc2'), '20.50')
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Save'))
////
////WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Save_Node2'))
//
//
//WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Save_Decision_Tree'))
//
//WebUI.setText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_Decision Tree Name_dtName'), 
//    'Automation')
//
//WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Save_Confirm_Save'))
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Decision tree is saved'))
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_OK'))
//
//WebUI.refresh(FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Setting'))
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Decision Tree Editor'))
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_AssetPavement'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Surface TypeAsphaltor Null'))
////
////WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Surface TypeConcrete'))
////
////WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 0, Max 30'))
////
////WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 30, Max 100'))
////
////WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Reconstruction'))
////
////WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Defer Maintenance'))
////
////WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 0100'))
////
////WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 20.50'))
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Load Decision Tree'))
//
//WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Delete_Decision_Tree'))
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Confirm'))
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_OK_Delete_Decision_Tree'))
//
//WebUI.refresh()
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Setting'))
//
//WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Decision Tree Editor'))
//
//def pci = []
//
//String pci1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 0, Max 40'))
//
//pci.add(pci1.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))
//
//String pci2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 40, Max 70'))
//
//pci.add(pci2.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))
//
//String pci3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 80, Max 90'))
//
//pci.add(pci3.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))
//
//String pci4 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 90, Max 100'))
//
//pci.add(pci4.findAll('\\d{1,3}(?:\\.\\d{1,2})?'))
//
//def pciDB = []
//
//pciDB = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMinMaxPCI'()
//
//if (pci == pciDB) {
//    println('Correct Decision Tree Loaded')
//} else {
//    throw new Exception('Decision Tree loaded is incorrect')
//}
//
//def ms = []
//
//String ms1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Reconstruction'))
//
//ms.add(ms1)
//
//String ms2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Rehabilitation'))
//
//ms.add(ms2)
//
//String ms3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Preventive Maintenance'))
//
//ms.add(ms3)
//
//String ms4 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Defer Maintenance'))
//
//ms.add(ms4)
//
//def msDB = []
//
//msDB = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMaintenanceSuggestion'()
//
//if (ms == msDB) {
//	println('Correct Decision Tree Loaded')
//} else {
//	throw new Exception('Decision Tree loaded is incorrect')
//}
//
//def cost = []
//
//String cost1 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 100'))
//
//cost.add(cost1.find('\\d{1,3}(?:\\.\\d{1,2})?'))
//
//String cost2 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 25'))
//
//cost.add(cost2.find('\\d{1,3}(?:\\.\\d{1,2})?'))
//
//String cost3 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 11.25'))
//
//cost.add(cost3.find('\\d{1,3}(?:\\.\\d{1,2})?'))
//
//String cost4 = WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 1.5'))
//
//cost.add(cost4.find('\\d{1,3}(?:\\.\\d{1,2})?'))
//
//def costDB = []
//
//costDB = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeCost'()
//
//if (cost == costDB) {
//	println('Correct Decision Tree Loaded')
//} else {
//	throw new Exception('Decision Tree loaded is incorrect')
//}

