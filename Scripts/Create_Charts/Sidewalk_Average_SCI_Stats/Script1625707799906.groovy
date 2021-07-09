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

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/div_Create Charts'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/svg_Sidewalk_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/p_Average SCI Stats'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Data'))

String Fth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Functional Class'))

WebUI.verifyMatch(Fth1, "Functional Class", false)

String Fth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Local'))

WebUI.verifyMatch(Fth2, "Local", false)

String Fth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Majorurb collector'))

WebUI.verifyMatch(Fth3, "Major/urb collector", false)

String Fth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Minor Arterial'))

WebUI.verifyMatch(Fth4, "Minor Arterial", false)

String Fth5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Other princ arterial'))

WebUI.verifyMatch(Fth5, "Other princ arterial", false)

String Fth6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Principal Arterial'))

WebUI.verifyMatch(Fth6, "Principal Arterial", false)

String Ftd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_sci'))

WebUI.verifyMatch(Ftd1, "sci", false)

String Ftd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_68.033'))

WebUI.verifyGreaterThan(Ftd2, 0)

String Ftd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_71.885'))

WebUI.verifyGreaterThan(Ftd3, 0)

String Ftd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_68.615'))

WebUI.verifyGreaterThan(Ftd4, 0)

String Ftd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_70.19'))

WebUI.verifyGreaterThan(Ftd5, 0)

String Ftd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_76.313'))

WebUI.verifyGreaterThan(Ftd6, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Ward'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Data1'))

String Wth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Ward'))

WebUI.verifyMatch(Wth1, "Ward", false)

String Wth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_1'))

WebUI.verifyMatch(Wth2, "1", false)

String Wth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_2'))

WebUI.verifyMatch(Wth3, "2", false)

String Wth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_3'))

WebUI.verifyMatch(Wth4, "3", false)

String Wth5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_4'))

WebUI.verifyMatch(Wth5, "4", false)

String Wth6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_5'))

WebUI.verifyMatch(Wth6, "5", false)

String Wth7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_10'))

WebUI.verifyMatch(Wth7, "10", false)

String Wth8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_null'))

WebUI.verifyMatch(Wth8, "null", false)

String Wtd1 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_sci1'))

WebUI.verifyMatch(Wtd1, "sci", false)

String Wtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_65.921'))

WebUI.verifyGreaterThan(Wtd2, 0)

String Wtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_65.871'))

WebUI.verifyGreaterThan(Wtd3, 0)

String Wtd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_69.875'))

WebUI.verifyGreaterThan(Wtd4, 0)

String Wtd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_69.764'))

WebUI.verifyGreaterThan(Wtd5, 0)

String Wtd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_70.698'))

WebUI.verifyGreaterThan(Wtd6, 0)

String Wtd7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_72'))

WebUI.verifyGreaterThan(Wtd7, 0)

String Wtd8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_62'))

WebUI.verifyGreaterThan(Wtd8, 0)

WebUI.click(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Chart1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Surface Type'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Data2'))

String Sth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Surface Type'))

WebUI.verifyMatch(Sth1, "Surface Type", false)

String Sth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Asphalt'))

WebUI.verifyMatch(Sth2, "Asphalt", false)

String Sth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Brick'))

WebUI.verifyMatch(Sth3, "Brick", false)

String Sth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/th_Concrete'))

WebUI.verifyMatch(Sth4, "Concrete", false)

String Std1 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_sci2'))

WebUI.verifyMatch(Std1, "sci", false)

String Std2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_68.96'))

WebUI.verifyGreaterThan(Std2, 0)

String Std3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_67.219'))

WebUI.verifyGreaterThan(Std3, 0)

String Std4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/td_69.014'))

WebUI.verifyGreaterThan(Std4, 0)

WebUI.click(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Chart2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg.name)

String jpegChart = jpeg.name

if(jpegChart.contains("Chart") && jpegChart.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/button'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png.name)

String pngChart = png.name

if(pngChart.contains("Chart") && pngChart.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Ward'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/button1'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/div_Save as JPEG1'))

WebUI.delay(5)

File jpeg1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg1.name)

String jpegChart1 = jpeg1.name

if(jpegChart1.contains("Chart") && jpegChart1.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/button1'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/div_Save as PNG1'))

WebUI.delay(5)

File png1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png1.name)

String pngChart1 = png1.name

if(pngChart1.contains("Chart") && pngChart1.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Surface Type'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Surface Type'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/button2'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/div_Save as JPEG2'))

WebUI.delay(5)

File jpeg2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg2.name)

String jpegChart2 = jpeg2.name

if(jpegChart2.contains("Chart") && jpegChart2.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/button2'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/div_Save as PNG2'))

WebUI.delay(5)

File png2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png2.name)

String pngChart2 = png2.name

if(pngChart2.contains("Chart") && pngChart2.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Average_SCI_Sats/Page_Streetlogix/h6_Sidewalk'))

