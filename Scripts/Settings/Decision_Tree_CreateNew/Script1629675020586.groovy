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

WebUI.clickOffset(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_offset'), 15, 15)

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_Is last level node_nullNode'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Add_Surface_Type_Asphalt'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/text_1'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_SurfaceType_Dropdown'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/li_Concrete'))

WebUI.clickOffset(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_offset'), 2, 2)

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Include null value'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Add_Surface_Type_Concrete'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Surface TypeAsphaltor Null'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Surface TypeConcrete'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/text_2'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h2_Add Child Node'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Please set min and max boundary for this node'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h6_PCI'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Min'))

WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_PCI_min1'), '0')

WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_PCI_max1'), '30')

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Max'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Min Included1'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Max Included1'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Add_PCI1'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/text_3'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h2_Add Child Node'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Please set min and max boundary for this node'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/h6_PCI'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Min'))

WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_PCI_min2'), '30')

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Max'))

WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_PCI_max2'), '100')

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Max Included2'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Add_PCI2'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_nullUnit Cost (yd) 0'))

WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_Edit Node_ms1'), 'Reconstruction')

WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input__uc1'), '0100')

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Maintenance Suggestion'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Cost (yd)'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Save_Node1'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_nullUnit Cost (yd) 0'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Maintenance Suggestion'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Cost (yd)'))

WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_Edit Node_ms2'), 'Defer Maintenance')

WebUI.setText(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input__uc2'), '20.50')

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Save'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Save_Node2'))

WebUI.setText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/input_Decision Tree Name_dtName'), 
    'Automation')

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Save_Decision_Tree'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/p_Decision tree is saved'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_OK'))

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Decision Tree Editor'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_AssetPavement'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Surface TypeAsphaltor Null'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Surface TypeConcrete'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 0, Max 30'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 30, Max 100'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Reconstruction'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Defer Maintenance'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 0100'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 20.50'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Load Decision Tree'))

WebUI.click(findTestObject('Settings/Decision_Tree_Create_Delete/Page_Streetlogix/span_Delete_Decision_Tree'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/button_OK'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Decision Tree Editor'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 0, Max 40'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 40, Max 70'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 80, Max 90'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Min 90, Max 100'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Reconstruction'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Rehabilitation'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Preventive Maintenance'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Defer Maintenance'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 100'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 25'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 11.25'))

WebUI.getText(findTestObject('Object Repository/Settings/Decision_Tree_Create_Delete/Page_Streetlogix/div_Unit Cost (yd) 1.5'))

