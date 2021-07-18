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

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Create Charts'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/svg_Work Orders_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/p_Number of Work Order Stats'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_form_name'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/th_form_name'), 
    'form_name')

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/td_count'), 
    'count')

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Creation Date'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Data1'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/th_Creation Date'), 
    'Creation Date')

WebUI.verifyElementText(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/td_count1'), 
    'count')

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Chart1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Priority'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Data2'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/th_Priority'), 
    'Priority')

WebUI.verifyElementText(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/td_count2'), 
    'count')

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Chart2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Status'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2_3'))

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Data3'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/th_Status'), 
    'Status')

WebUI.verifyElementText(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/td_count3'), 
    'count')

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Chart3'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Assignee Name'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2_3_4'))

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Data4'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/th_Assignee Name'), 
    'Assignee Name')

WebUI.verifyElementText(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/td_count4'), 
    'count')

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Chart4'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_form_name'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(jpeg.name)

String jpegChart = jpeg.name

if (jpegChart.contains('Chart') && jpegChart.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/button'))
} else {
	throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png.name)

String pngChart = png.name

if (pngChart.contains('Chart') && pngChart.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Creation Date'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/button1'))

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Save as JPEG1'))

WebUI.delay(5)

File jpeg1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(jpeg1.name)

String jpegChart1 = jpeg1.name

if (jpegChart1.contains('Chart') && jpegChart1.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/button1'))
} else {
	throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Save as PNG1'))

WebUI.delay(5)

File png1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png1.name)

String pngChart1 = png1.name

if (pngChart1.contains('Chart') && pngChart1.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Priority'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/button2'))

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Save as JPEG2'))

WebUI.delay(5)

File jpeg2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(jpeg2.name)

String jpegChart2 = jpeg2.name

if (jpegChart2.contains('Chart') && jpegChart2.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/button2'))
} else {
	throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Save as PNG2'))

WebUI.delay(5)

File png2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png2.name)

String pngChart2 = png2.name

if (pngChart2.contains('Chart') && pngChart2.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Status'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/button3'))

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Save as JPEG3'))

WebUI.delay(5)

File jpeg3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(jpeg3.name)

String jpegChart3 = jpeg3.name

if (jpegChart3.contains('Chart') && jpegChart3.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/button3'))
} else {
	throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Save as PNG3'))

WebUI.delay(5)

File png3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png3.name)

String pngChart3 = png3.name

if (pngChart3.contains('Chart') && pngChart3.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Assignee Name'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/button4'))

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Save as JPEG4'))

WebUI.delay(5)

File jpeg4 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(jpeg4.name)

String jpegChart4 = jpeg.name

if (jpegChart4.contains('Chart') && jpegChart4.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/button4'))
} else {
	throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/div_Save as PNG4'))

WebUI.delay(5)

File png4 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png4.name)

String pngChart4 = png4.name

if (pngChart4.contains('Chart') && pngChart4.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/h6_Work Orders'))

