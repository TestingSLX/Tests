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

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Create Charts'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/svg_Customize Charts_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/li_Sign Maintenance'))

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Count by category'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/li_Count by category'))

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Functional Class'))

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/li_signcondition'))

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Column'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/li_Column'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Generate Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_signcondition'), "signcondition")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Critical'), "Critical")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Good'), "Good")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Fair'), "Fair")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_count'), "count")

String SCtd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_433'))

WebUI.verifyGreaterThanOrEqual(SCtd1, 0)

String SCtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_20169'))

WebUI.verifyGreaterThanOrEqual(SCtd2, 0)

String SCtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_1243'))

WebUI.verifyGreaterThanOrEqual(SCtd3, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(jpeg.name)

String jpegChart = jpeg.name

if (jpegChart.contains('Chart') && jpegChart.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/button'))
} else {
	throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png.name)

String pngChart = png.name

if (pngChart.contains('Chart') && pngChart.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/li_postmaterial'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Generate Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_postmaterial'), "postmaterial")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Metal'), "Metal")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Plastic'), "Plastic")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Other1'), "Other")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Wood'), "Wood")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_count'), "count")

String PMtd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_18083'))

WebUI.verifyGreaterThanOrEqual(PMtd1, 0)

String PMtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_5'))

WebUI.verifyGreaterThanOrEqual(PMtd2, 0)

String PMtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_215'))

WebUI.verifyGreaterThanOrEqual(PMtd3, 0)

String PMtd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_1866'))

WebUI.verifyGreaterThanOrEqual(PMtd4, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(jpeg1.name)

String jpegChart1 = jpeg1.name

if (jpegChart1.contains('Chart') && jpegChart1.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/button'))
} else {
	throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png1.name)

String pngChart1 = png1.name

if (pngChart1.contains('Chart') && pngChart1.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/li_signcategory'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Generate Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_signcategory'), "signcategory")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Other2'), "Other")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Warning'), "Warning")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Recreation'), "Recreation")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Regulatory'), "Regulatory")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Information'), "Information")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Guide'), "Guide")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_School'), "School")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_General'), "General")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_count'), "count")

String SCatd1 = WebUI.getText(findTestObject('Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_5_1'))

WebUI.verifyGreaterThanOrEqual(SCatd1, 0)

String SCatd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_2191'))

WebUI.verifyGreaterThanOrEqual(SCatd2, 0)

String SCatd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_3'))

WebUI.verifyGreaterThanOrEqual(SCatd3, 0)

String SCatd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_13216'))

WebUI.verifyGreaterThanOrEqual(SCatd4, 0)

String SCatd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_55'))

WebUI.verifyGreaterThanOrEqual(SCatd5, 0)

String SCatd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_3337'))

WebUI.verifyGreaterThanOrEqual(SCatd6, 0)

String SCatd7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_216'))

WebUI.verifyGreaterThanOrEqual(SCatd7, 0)

String SCatd8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_1146'))

WebUI.verifyGreaterThanOrEqual(SCatd8, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(jpeg2.name)

String jpegChart2 = jpeg2.name

if (jpegChart2.contains('Chart') && jpegChart2.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/button'))
} else {
	throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png2.name)

String pngChart2 = png2.name

if (pngChart2.contains('Chart') && pngChart2.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/li_signposttype'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Generate Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2_3'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_signposttype'), "signposttype")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_U-Channel'), "U-Channel")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Post'), "Post")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Other3'), "Other")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Signal Mast'), "Signal Mast")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Utility Pole'), "Utility Pole")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Light Pole'), "Light Pole")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_count'), "count")

String SPtd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_13709'))

WebUI.verifyGreaterThanOrEqual(SPtd1, 0)

String SPtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_4715'))

WebUI.verifyGreaterThanOrEqual(SPtd2, 0)

String SPtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_263'))

WebUI.verifyGreaterThanOrEqual(SPtd3, 0)

String SPtd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_981'))

WebUI.verifyGreaterThanOrEqual(SPtd4, 0)

String SPtd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_1226'))

WebUI.verifyGreaterThanOrEqual(SPtd5, 0)

String SPtd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_951'))

WebUI.verifyGreaterThanOrEqual(SPtd6, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(jpeg3.name)

String jpegChart3 = jpeg3.name

if (jpegChart3.contains('Chart') && jpegChart3.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/button'))
} else {
	throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(png3.name)

String pngChart3 = png3.name

if (pngChart3.contains('Chart') && pngChart3.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/div_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/li_Maintenance Suggestion'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Generate Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Maintenance Suggestion'), "Maintenance Suggestion")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Replace'), "Replace")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Retire'), "Retire")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Do Nothing'), "Do Nothing")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Defer'), "Defer")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/th_Replace - Critical'), "Replace - Critical")

WebUI.verifyElementText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_count'), "count")

String MStd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_1042'))

WebUI.verifyGreaterThanOrEqual(MStd1, 0)

String MStd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_1290'))

WebUI.verifyGreaterThanOrEqual(MStd2, 0)

String MStd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_15558'))

WebUI.verifyGreaterThanOrEqual(MStd3, 0)

String MStd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_3752'))

WebUI.verifyGreaterThanOrEqual(MStd4, 0)

String MStd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/td_203'))

WebUI.verifyGreaterThanOrEqual(MStd5, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/span_Go back to options'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Customize_Chart/Sign_Count_By_Category/Page_Streetlogix/h6_Customize Charts'))

