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

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Create Charts'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/svg_Customize Charts_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Count by category'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/li_Count by category'))

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/li_Functional Class'))

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Column'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/li_Column'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Generate Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Functional Class'), "Functional Class")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Other princ arterial'), "Other princ arterial")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Principal Arterial'), "Principal Arterial")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Majorurb collector'), "Major/urb collector")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Minor Arterial'), "Minor Arterial")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Local'), "Local")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_count'), "count")

String Ftd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_65'))

WebUI.verifyGreaterThanOrEqual(Ftd1, 0)

String Ftd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_16'))

WebUI.verifyGreaterThanOrEqual(Ftd2, 0)

String Ftd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_131'))

WebUI.verifyGreaterThanOrEqual(Ftd3, 0)

String Ftd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_169'))

WebUI.verifyGreaterThanOrEqual(Ftd4, 0)

String Ftd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_1081'))

WebUI.verifyGreaterThanOrEqual(Ftd5, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg.name)

String jpegChart = jpeg.name

if (jpegChart.contains('Chart') && jpegChart.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/button'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png.name)

String pngChart = png.name

if (pngChart.contains('Chart') && pngChart.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/li_Maintenance Suggestion'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Generate Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Maintenance Suggestion'), "Maintenance Suggestion")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Crack Seal'), "Crack Seal")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Panel Replacement (50)'), "Panel Replacement (<50%)")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Defer Maintenance'), "Defer Maintenance")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Reconstruction'), "Reconstruction")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Mill and Overlay'), "Mill and Overlay")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_count'), "count")

String Mtd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_304'))

WebUI.verifyGreaterThanOrEqual(Mtd1, 0)

String Mtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_2'))

WebUI.verifyGreaterThanOrEqual(Mtd2, 0)

String Mtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_1'))

WebUI.verifyGreaterThanOrEqual(Mtd3, 0)

String Mtd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_92'))

WebUI.verifyGreaterThanOrEqual(Mtd4, 0)

String Mtd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_682'))

WebUI.verifyGreaterThanOrEqual(Mtd5, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg1.name)

String jpegChart1 = jpeg1.name

if (jpegChart1.contains('Chart') && jpegChart1.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/button'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png1.name)

String pngChart1 = png1.name

if (pngChart1.contains('Chart') && pngChart1.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Functional Class'))

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/li_Surface Type'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Generate Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Surface Type'), "Surface Type")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/th_Asphalt'), "Asphalt")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_count'), "count")

String Std1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/td_836'))

WebUI.verifyGreaterThanOrEqual(Std1, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg2.name)

String jpegChart2 = jpeg2.name

if (jpegChart2.contains('Chart') && jpegChart2.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/button'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png2.name)

String pngChart2 = png2.name

if (pngChart2.contains('Chart') && pngChart2.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Pavement_Count_By_Category/Page_Streetlogix/h6_Customize Charts'))

