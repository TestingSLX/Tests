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

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/div_Create Charts'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/svg_Sidewalk_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/p_Distribution of Repairs'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Data'))

String Fth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_Functional Class'))

WebUI.verifyMatch(Fth1, "Functional Class", false)

String Fth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_Local'))

WebUI.verifyMatch(Fth2, "Local", false)

String Ftd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_count'))

WebUI.verifyMatch(Ftd1, "count", false)

String Ftd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Defer Maintenance'))

WebUI.verifyMatch(Ftd2, "Defer Maintenance", false)

String Ftd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Grinding'))

WebUI.verifyMatch(Ftd3, "Grinding", false)

String Ftd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Partial Replacement'))

WebUI.verifyMatch(Ftd4, "Partial Replacement", false)

String Ftd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Paver Reset'))

WebUI.verifyMatch(Ftd5, "Paver Reset", false)

String Ftd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Reconstruction'))

WebUI.verifyMatch(Ftd6, "Reconstruction", false)

String Ftd7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_3'))

WebUI.verifyGreaterThanOrEqual(Ftd7, 0)

String Ftd8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_44'))

WebUI.verifyGreaterThanOrEqual(Ftd8, 0)

String Ftd9 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_386'))

WebUI.verifyGreaterThanOrEqual(Ftd9, 0)

String Ftd10 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_411'))

WebUI.verifyGreaterThanOrEqual(Ftd10, 0)

String Ftd11 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_192'))

WebUI.verifyGreaterThanOrEqual(Ftd11, 0)

String Ftd12 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_40'))

WebUI.verifyGreaterThanOrEqual(Ftd12, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Ward'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Data1'))

String Wth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_Ward'))

WebUI.verifyMatch(Wth1, "Ward", false)

String Wth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_1'))

WebUI.verifyMatch(Wth2, "1", false)

String Wth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_5'))

WebUI.verifyMatch(Wth3, "5", false)

String Wth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_10'))

WebUI.verifyMatch(Wth4, "10", false)

String Wtd1 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_count1'))

WebUI.verifyMatch(Wtd1, "count", false)

String Wtd2 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Defer Maintenance1'))

WebUI.verifyMatch(Wtd2, "Defer Maintenance", false)

String Wtd3 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Grinding1'))

WebUI.verifyMatch(Wtd3, "Grinding", false)

String Wtd4 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Partial Replacement1'))

WebUI.verifyMatch(Wtd4, "Partial Replacement", false)

String Wtd5 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Paver Reset1'))

WebUI.verifyMatch(Wtd5, "Paver Reset", false)

String Wtd6 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Reconstruction1'))

WebUI.verifyMatch(Wtd6, "Reconstruction", false)

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Chart1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Surface Type'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Data2'))

String Sth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_Surface Type'))

WebUI.verifyMatch(Sth1, "Surface Type", false)

String Sth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_Asphalt'))

WebUI.verifyMatch(Sth2, "Asphalt", false)

String Sth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_Brick'))

WebUI.verifyMatch(Sth3, "Brick", false)

String Sth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_Concrete'))

WebUI.verifyMatch(Sth4, "Concrete", false)

String Std1 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Defer Maintenance2'))

WebUI.verifyMatch(Std1, "Defer Maintenance", false)

String Std2 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Grinding2'))

WebUI.verifyMatch(Std2, "Grinding", false)

String Std3 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Partial Replacement2'))

WebUI.verifyMatch(Std3, "Partial Replacement", false)

String Std4 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Reconstruction2'))

WebUI.verifyMatch(Std4, "Reconstruction", false)

String Std5 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_count2'))

WebUI.verifyMatch(Std5, "count", false)

String Std6 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Paver Reset2'))

WebUI.verifyMatch(Std6, "Paver Reset", false)

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Chart2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Condition Index'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Data3'))

String Cth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_Condition Index'))

WebUI.verifyMatch(Cth1, "Condition Index", false)

String Cth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_10 - 25'))

WebUI.verifyMatch(Cth2, "10 - 25", false)

String Cth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/th_null'))

WebUI.verifyMatch(Cth3, "null", false)

String Ctd1 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Reconstruction3'))

WebUI.verifyMatch(Ctd1, "Reconstruction", false)

String Ctd2 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Grinding3'))

WebUI.verifyMatch(Ctd2, "Grinding", false)

String Ctd3 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Paver Reset3'))

WebUI.verifyMatch(Ctd3, "Paver Reset", false)

String Ctd4 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Partial Replacement3'))

WebUI.verifyMatch(Ctd4, "Partial Replacement", false)

String Ctd5 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_count3'))

WebUI.verifyMatch(Ctd5, "count", false)

String Ctd6 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/td_Defer Maintenance3'))

WebUI.verifyMatch(Ctd6, "Defer Maintenance", false)

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Chart3'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg.name)

String jpegChart = jpeg.name

if(jpegChart.contains("Chart") && jpegChart.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/button'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png.name)

String pngChart = png.name

if(pngChart.contains("Chart") && pngChart.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Ward'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/button1'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/div_Save as JPEG1'))

WebUI.delay(5)

File jpeg1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg1.name)

String jpegChart1 = jpeg1.name

if(jpegChart1.contains("Chart") && jpegChart1.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/button1'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/div_Save as PNG1'))

WebUI.delay(5)

File png1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png1.name)

String pngChart1 = png1.name

if(pngChart1.contains("Chart") && pngChart1.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Surface Type'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Surface Type'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/button2'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/div_Save as JPEG2'))

WebUI.delay(5)

File jpeg2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg2.name)

String jpegChart2 = jpeg2.name

if(jpegChart2.contains("Chart") && jpegChart2.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/button2'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/div_Save as PNG2'))

WebUI.delay(5)

File png2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png2.name)

String pngChart2 = png2.name

if(pngChart2.contains("Chart") && pngChart2.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Distribution_Of_Repairs/Page_Streetlogix/h6_Sidewalk'))

