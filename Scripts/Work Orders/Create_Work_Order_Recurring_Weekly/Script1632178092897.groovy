import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.time.TimeCategory as TimeCategory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

def countBefore = CustomKeywords.'com.database_keywords.test.Database_Keywords.getWorkOrdersCount'()

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/div_Work Orders'))

WebUI.click(findTestObject('Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/div_Roads and Highways'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/li_All Groups'))

WebUI.setText(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input_Roads and Highways_MuiInputBase-input_6d2a02'), 
    'ATest')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/span_Atest'))

WebUI.setText(findTestObject('Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input_Assignee'), 'Demo User')

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/li_DUDemo User'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input_Upload_repeating'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/div_Daily'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/li_Weekly'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input__till'))

WebUI.sendKeys(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input__till'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input__till'), 
    Keys.chord(Keys.DELETE))

def acceptedFormat = 'MM/dd/yyyy'

def today = new Date()

def currentdate = today.format(acceptedFormat)

println(currentdate)

def repeatUntil = ''

use(TimeCategory, { 
        def sevenDays = today + 4.weeks

        repeatUntil = sevenDays.format(acceptedFormat)

        println(repeatUntil)
    })

WebUI.setText(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/input__till'), 
    repeatUntil)

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/p_Work order is created'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/button_OK'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/h1_Work Orders'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/h6_Select Form'))

def countAfter = CustomKeywords.'com.database_keywords.test.Database_Keywords.getWorkOrdersCount'()

if (countAfter == (countBefore + 4)) {
    println('Work Order Created')
} else {
    throw new Exception('Work Orders are not Created')
}

