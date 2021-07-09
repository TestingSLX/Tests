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

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/div_Create Charts'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462_1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/p_Distribution of Length'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Data'))

String Fth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Functional Class'))

WebUI.verifyMatch(Fth1, "Functional Class", false)

String Fth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Local'))

WebUI.verifyMatch(Fth2, "Local", false)

String Fth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Majorurb collector'))

WebUI.verifyMatch(Fth3, "Major/urb collector", false)

String Fth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Minor Arterial'))

WebUI.verifyMatch(Fth4, "Minor Arterial", false)

String Fth5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Other princ arterial'))

WebUI.verifyMatch(Fth5, "Other princ arterial", false)

String Fth6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Principal Arterial'))

WebUI.verifyMatch(Fth6, "Principal Arterial", false)

String Ftd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_length_ft'))

WebUI.verifyMatch(Ftd1, "length_ft", false)

String Ftd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_930742'))

WebUI.verifyGreaterThan(Ftd2, 0)

String Ftd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_284152'))

WebUI.verifyGreaterThan(Ftd3, 0)

String Ftd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_422746'))

WebUI.verifyGreaterThan(Ftd4, 0)

String Ftd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_140659'))

WebUI.verifyGreaterThan(Ftd5, 0)

String Ftd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_28642'))

WebUI.verifyGreaterThan(Ftd6, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Ward'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Data1'))

String Wth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Ward'))

WebUI.verifyMatch(Wth1, "Ward", false)

String Wth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_1'))

WebUI.verifyMatch(Wth2, "1", false)

String Wth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_2'))

WebUI.verifyMatch(Wth3, "2", false)

String Wth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_3'))

WebUI.verifyMatch(Wth4, "3", false)

String Wth5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_4'))

WebUI.verifyMatch(Wth5, "4", false)

String Wth6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_5'))

WebUI.verifyMatch(Wth6, "5", false)

String Wth7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_43'))

WebUI.verifyMatch(Wth7, "43", false)

String Wth8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_50'))

WebUI.verifyMatch(Wth8, "50", false)

String Wth9 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_null'))

WebUI.verifyMatch(Wth9, "null", false)

String Wtd1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_length_ft1'))

WebUI.verifyMatch(Wtd1, "length_ft", false)

String Wtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_265199'))

WebUI.verifyGreaterThan(Wtd2, 0)

String Wtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_237576'))

WebUI.verifyGreaterThan(Wtd3, 0)

String Wtd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_611149'))

WebUI.verifyGreaterThan(Wtd4, 0)

String Wtd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_335711'))

WebUI.verifyGreaterThan(Wtd5, 0)

String Wtd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_339283'))

WebUI.verifyGreaterThan(Wtd6, 0)

String Wtd7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_1347'))

WebUI.verifyGreaterThan(Wtd7, 0)

String Wtd8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_834'))

WebUI.verifyGreaterThan(Wtd8, 0)

String Wtd9 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_15842'))

WebUI.verifyGreaterThan(Wtd9, 0)

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Chart1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Surface Type'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Data2'))

String Sth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Surface Type'))

WebUI.verifyMatch(Sth1, "Surface Type", false)

String Sth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Asphalt'))

WebUI.verifyMatch(Sth2, "Asphalt", false)

String Sth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Concrete'))

WebUI.verifyMatch(Sth3, "Concrete", false)

String Std1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_length_ft2'))

WebUI.verifyMatch(Std1, "length_ft", false)

String Std2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_1805693'))

WebUI.verifyGreaterThan(Std2, 0)

String Std3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_1248'))

WebUI.verifyGreaterThan(Std3, 0)

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Chart2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Condition Index'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2_3'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Data3'))

String Cth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_Condition Index'))

WebUI.verifyMatch(Cth1, "Condition Index", false)

String Cth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_0 - 10'))

WebUI.verifyMatch(Cth2, "0 - 10", false)

String Cth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_10 - 25'))

WebUI.verifyMatch(Cth3, "10 - 25", false)

String Cth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_25 - 40'))

WebUI.verifyMatch(Cth4, "25 - 40", false)

String Cth5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_40 - 55'))

WebUI.verifyMatch(Cth5, "40 - 55", false)

String Cth6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_55 - 70'))

WebUI.verifyMatch(Cth6, "55 - 70", false)

String Cth7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_70 - 85'))

WebUI.verifyMatch(Cth7, "70 - 85", false)

String Cth8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/th_85 - 100'))

WebUI.verifyMatch(Cth8, "85 - 100", false)

String Ctd1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_length_ft3'))

WebUI.verifyMatch(Ctd1, "length_ft", false)

String Ctd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_994'))

WebUI.verifyGreaterThan(Ctd2, 0)

String Ctd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_6940'))

WebUI.verifyGreaterThan(Ctd3, 0)

String Ctd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_57129'))

WebUI.verifyGreaterThan(Ctd4, 0)

String Ctd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_178993'))

WebUI.verifyGreaterThan(Ctd5, 0)

String Ctd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_723110'))

WebUI.verifyGreaterThan(Ctd6, 0)

String Ctd7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_748985'))

WebUI.verifyGreaterThan(Ctd7, 0)

String Ctd8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/td_90790'))

WebUI.verifyGreaterThan(Ctd8, 0)

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Chart3'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg.name)

String jpegChart = jpeg.name

if(jpegChart.contains("Chart") && jpegChart.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/button'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png.name)

String pngChart = png.name

if(pngChart.contains("Chart") && pngChart.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Ward'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/button1'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/div_Save as JPEG1'))

WebUI.delay(5)

File jpeg1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg1.name)

String jpegChart1 = jpeg1.name

if(jpegChart1.contains("Chart") && jpegChart1.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/button1'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/div_Save as PNG1'))

WebUI.delay(5)

File png1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png1.name)

String pngChart1 = png1.name

if(pngChart1.contains("Chart") && pngChart1.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Surface Type'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Surface Type'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/button2'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/div_Save as JPEG2'))

WebUI.delay(5)

File jpeg2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg2.name)

String jpegChart2 = jpeg2.name

if(jpegChart2.contains("Chart") && jpegChart2.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/button2'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/div_Save as PNG2'))

WebUI.delay(5)

File png2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png2.name)

String pngChart2 = png2.name

if(pngChart2.contains("Chart") && pngChart2.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Condition Index'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/button3'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/div_Save as JPEG3'))

WebUI.delay(5)

File jpeg3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg3.name)

String jpegChart3 = jpeg3.name

if(jpegChart3.contains("Chart") && jpegChart3.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/button3'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/div_Save as PNG3'))

WebUI.delay(5)

File png3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png3.name)

String pngChart3 = png3.name

if(pngChart3.contains("Chart") && pngChart3.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Distribution_Of_lengths/Page_Streetlogix/h6_Pavement'))

