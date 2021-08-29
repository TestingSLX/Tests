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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8081/?config=9c338e84e55940e4ba48a09e9f5aef32&url=https://streetlogix-dev-server.herokuapp.com&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAyNiwibmFtZSI6IlNocnV0aWthIFNhd2FudCIsImV4cCI6MTYyNTY2NDU3NiwiaWF0IjoxNjIzMDcyNTc2fQ.vEFh0PAIs6ZT0JQnknJ_XJleZWCSWMvOzTGa6L5F4k0')

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/span_No time-aware layers are visible_esri-_2711ac'))

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/img_Measurement_pinsContainer'))

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/div_Print_esri-view-surface esri-view-surfa_097dec'))

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/button_EDIT'))

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/div_'))

//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_T'), 'T')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Te'), 'Te')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Tes'), 'Tes')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Test'), 'Test')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Testi'), 'Testi')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Testin'), 'Testin')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Testing'), 'Testing')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Testing_1'), 'Testing ')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Testing U'), 'Testing U')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Testing Up'), 'Testing Up')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Testing Upd'), 
//    'Testing Upd')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Testing Upda'), 
//    'Testing Upda')
//
//WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Testing Updat'), 
//    'Testing Updat')

WebUI.setText(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/textarea_Testing Update'), 
    'Testing Update')

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/div_Success'))

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/button_OK'))

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/div_Print_esri-view-surface esri-view-surfa_097dec'))

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/span_Note'))

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/div_Testing Update'))

WebUI.click(findTestObject('Work_Orders_Samples/Update_Work_Orders/Page_Streetlogix/span_CANCEL'))

WebUI.closeBrowser()

