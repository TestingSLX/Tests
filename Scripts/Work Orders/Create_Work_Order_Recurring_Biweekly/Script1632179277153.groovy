import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.time.TimeCategory as TimeCategory

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

WebUI.click(findTestObject('Object Repository/Work_Orders/Create_Recurring_Work_Orders/Page_Streetlogix/li_Biweekly'))

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
        def sevenDays = today + 6.weeks

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

if (countAfter == (countBefore + 3)) {
    println('Work Order Created')
} else {
    throw new Exception('Work Orders are not Created')
}

