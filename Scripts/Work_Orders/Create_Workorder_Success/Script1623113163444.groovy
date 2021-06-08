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

WebUI.click(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/div_Work Orders'))

WebUI.setText(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/input_All groups_MuiInputBase-input-439 Mui_bf7e6e'), 
    'asphalt cost')

WebUI.click(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/div_asphalt cost'))

WebUI.setText(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/input_Send Email Notification_mui-76097'), 
    'Shrutika Sawant')

WebUI.click(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/li_Shrutika Sawant'))

WebUI.setText(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/input__mui-52328'), 'CUTTER ST')

WebUI.click(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/li_CUTTER ST, Portland, ME, USAfromstreet E_86497a'))

WebUI.setText(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/input_Upload_asphalt(tons)'), '70')

WebUI.click(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/p_asphalt (cost)'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/div_Success'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Page_Streetlogix/button_OK'))

