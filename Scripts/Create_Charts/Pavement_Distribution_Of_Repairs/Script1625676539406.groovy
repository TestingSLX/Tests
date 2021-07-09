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

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/div_Create Charts'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462_1'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/p_Distribution of Repairs'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Data'))

String Fth1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_Functional Class'))

WebUI.verifyMatch(Fth1, "Functional Class", false)

String Fth2 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_Local'))

WebUI.verifyMatch(Fth2, "Local", false)

String Fth3 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_Majorurb collector'))

WebUI.verifyMatch(Fth3, "Major/urb collector", false)

String Fth4 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_Minor Arterial'))

WebUI.verifyMatch(Fth4, "Minor Arterial", false)

String Fth5 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_Other princ arterial'))

WebUI.verifyMatch(Fth5, "Other princ arterial", false)

String Fth6 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_Principal Arterial'))

WebUI.verifyMatch(Fth6, "Principal Arterial", false)

String Ftd1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Crack Seal'))

WebUI.verifyMatch(Ftd1, "Crack Seal", false)

String Ftd2 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Defer Maintenance'))

WebUI.verifyMatch(Ftd2, "Defer Maintenance", false)

String Ftd3 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Mill and Overlay'))

WebUI.verifyMatch(Ftd3, "Mill and Overlay", false)

String Ftd4 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Panel Replacement (50)'))

WebUI.verifyMatch(Ftd4, "Panel Replacement (<50%)", false)

String Ftd5 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Reconstruction'))

WebUI.verifyMatch(Ftd5, "Reconstruction", false)

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Ward'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Data1'))

String Wth1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_Ward'))

WebUI.verifyMatch(Wth1, "Ward", false)

String Wth2 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_1'))

WebUI.verifyMatch(Wth2, "1", false)

String Wth3 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_2'))

WebUI.verifyMatch(Wth3, "2", false)

String Wth4 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_3'))

WebUI.verifyMatch(Wth4, "3", false)

String Wth5 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_4'))

WebUI.verifyMatch(Wth5, "4", false)

String Wth6 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_5'))

WebUI.verifyMatch(Wth6, "5", false)

String Wth7 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_43'))

WebUI.verifyMatch(Wth7, "43", false)

String Wth8 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_null'))

WebUI.verifyMatch(Wth8, "null", false)

String Wtd1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Crack Seal1'))

WebUI.verifyMatch(Wtd1, "Crack Seal", false)

String Wtd2 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Mill and Overlay1'))

WebUI.verifyMatch(Wtd2, "Mill and Overlay", false)

String Wtd3 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Reconstruction1'))

WebUI.verifyMatch(Wtd3, "Reconstruction", false)

String Wtd4 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Defer Maintenance1'))

WebUI.verifyMatch(Wtd4, "Defer Maintenance", false)

String Wtd5 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Panel Replacement (50)1'))

WebUI.verifyMatch(Wtd5, "Panel Replacement (<50%)", false)

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Chart1'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Surface Type'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Data2'))

String Sth1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_Surface Type'))

WebUI.verifyMatch(Sth1, "Surface Type", false)

String Sth2 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_Asphalt'))

WebUI.verifyMatch(Sth2, "Asphalt", false)

String Std1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Crack Seal2'))

WebUI.verifyMatch(Std1, "Crack Seal", false)

String Std2 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Defer Maintenance2'))

WebUI.verifyMatch(Std2, "Defer Maintenance", false)

String Std3 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Mill and Overlay2'))

WebUI.verifyMatch(Std3, "Mill and Overlay", false)

String Std4 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Reconstruction2'))

WebUI.verifyMatch(Std4, "Reconstruction", false)

String Std5 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Panel Replacement (50)2'))

WebUI.verifyMatch(Std5, "Panel Replacement (<50%)", false)

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Chart2'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Condition Index'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2_3'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Data3'))

String Cth1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_Condition Index'))

WebUI.verifyMatch(Cth1, "Condition Index", false)

String Cth2 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_0 - 10'))

WebUI.verifyMatch(Cth2, "0 - 10", false)

String Cth3 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_10 - 25'))

WebUI.verifyMatch(Cth3, "10 - 25", false)

String Cth4 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_25 - 40'))

WebUI.verifyMatch(Cth4, "25 - 40", false)

String Cth5 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/th_40 - 55'))

WebUI.verifyMatch(Cth5, "40 - 55", false)

String Ctd1 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Reconstruction3'))

WebUI.verifyMatch(Ctd1, "Reconstruction", false)

String Ctd2 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Mill and Overlay3'))

WebUI.verifyMatch(Ctd2, "Mill and Overlay", false)

String Ctd3 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Panel Replacement (50)3'))

WebUI.verifyMatch(Ctd3, "Panel Replacement (<50%)", false)

String Ctd4 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Crack Seal3'))

WebUI.verifyMatch(Ctd4, "Crack Seal", false)

String Ctd5 = WebUI.getText(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/td_Defer Maintenance3'))

WebUI.verifyMatch(Ctd5, "Defer Maintenance", false)

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Chart3'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/button'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg.name)

String jpegChart = jpeg.name

if(jpegChart.contains("Chart") && jpegChart.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/button'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png.name)

String pngChart = png.name

if(pngChart.contains("Chart") && pngChart.endsWith('.png')) {
	WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Ward'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/button1'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/div_Save as JPEG1'))

WebUI.delay(5)

File jpeg1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg1.name)

String jpegChart1 = jpeg1.name

if(jpegChart1.contains("Chart") && jpegChart1.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/button1'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/div_Save as PNG1'))

WebUI.delay(5)

File png1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png1.name)

String pngChart1 = png1.name

if(pngChart1.contains("Chart") && pngChart1.endsWith('.png')) {
	WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Surface Type'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/button2'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/div_Save as JPEG2'))

WebUI.delay(5)

File jpeg2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg2.name)

String jpegChart2 = jpeg2.name

if(jpegChart2.contains("Chart") && jpegChart2.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/button2'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/div_Save as PNG2'))

WebUI.delay(5)

File png2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png2.name)

String pngChart2 = png2.name

if(pngChart2.contains("Chart") && pngChart2.endsWith('.png')) {
	WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Condition Index'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Condition Index'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/button3'))

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/div_Save as JPEG3'))

WebUI.delay(5)

File jpeg3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg3.name)

String jpegChart3 = jpeg3.name

if(jpegChart3.contains("Chart") && jpegChart3.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/button3'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/div_Save as PNG3'))

WebUI.delay(5)

File png3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png3.name)

String pngChart3 = png3.name

if(pngChart3.contains("Chart") && pngChart3.endsWith('.png')) {
	WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Distribution_Of_Repairs/Page_Streetlogix/h6_Pavement'))

