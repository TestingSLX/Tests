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

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/div_Create Charts'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/svg_Sign_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/p_Percentage of Sign Stats'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_signcondition'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_Data'))

String SCth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_signcondition'))

WebUI.verifyMatch(SCth1, 'signcondition', false)

String SCth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Critical'))

WebUI.verifyMatch(SCth2, 'Critical', false)

String SCth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Good'))

WebUI.verifyMatch(SCth3, 'Good', false)

String SCth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Fair'))

WebUI.verifyMatch(SCth4, 'Fair', false)

String SCtd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_count'))

WebUI.verifyMatch(SCtd1, 'count', false)

String SCtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_433'))

WebUI.verifyGreaterThanOrEqual(SCtd2, 0)

String SCtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_20169'))

WebUI.verifyGreaterThanOrEqual(SCtd3, 0)

String SCtd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_1243'))

WebUI.verifyGreaterThanOrEqual(SCtd4, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_postmaterial'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_Data1'))

String PMth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_postmaterial'))

WebUI.verifyMatch(PMth1, 'postmaterial', false)

String PMth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Metal'))

WebUI.verifyMatch(PMth2, 'Metal', false)

String PMth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Plastic'))

WebUI.verifyMatch(PMth3, 'Plastic', false)

String PMth4 = WebUI.getText(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Other1'))

WebUI.verifyMatch(PMth4, 'Other', false)

String PMth5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Wood'))

WebUI.verifyMatch(PMth5, 'Wood', false)

String PMtd1 = WebUI.getText(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_count1'))

WebUI.verifyMatch(PMtd1, 'count', false)

String PMtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_19290'))

WebUI.verifyGreaterThanOrEqual(PMtd2, 0)

String PMtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_7'))

WebUI.verifyGreaterThanOrEqual(PMtd3, 0)

String PMtd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_234'))

WebUI.verifyGreaterThanOrEqual(PMtd4, 0)

String PMtd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_2314'))

WebUI.verifyGreaterThanOrEqual(PMtd5, 0)

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_Chart1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_signcategory'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_Data2'))

String SCath1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_signcategory'))

WebUI.verifyMatch(SCath1, 'signcategory', false)

String SCath2 = WebUI.getText(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Other2'))

WebUI.verifyMatch(SCath2, 'Other', false)

String SCath3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Warning'))

WebUI.verifyMatch(SCath3, 'Warning', false)

String SCath4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Recreation'))

WebUI.verifyMatch(SCath4, 'Recreation', false)

String SCath5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Regulatory'))

WebUI.verifyMatch(SCath5, 'Regulatory', false)

String SCath6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Information'))

WebUI.verifyMatch(SCath6, 'Information', false)

String SCath7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Guide'))

WebUI.verifyMatch(SCath7, 'Guide', false)

String SCath8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_School'))

WebUI.verifyMatch(SCath8, 'School', false)

String SCath9 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_General'))

WebUI.verifyMatch(SCath9, 'General', false)

String SCatd1 = WebUI.getText(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_count2'))

WebUI.verifyMatch(SCatd1, 'count', false)

String SCatd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_5'))

WebUI.verifyGreaterThanOrEqual(SCatd2, 0)

String SCatd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_2339'))

WebUI.verifyGreaterThanOrEqual(SCatd3, 0)

String SCatd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_4'))

WebUI.verifyGreaterThanOrEqual(SCatd4, 0)

String SCatd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_14537'))

WebUI.verifyGreaterThanOrEqual(SCatd5, 0)

String SCatd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_59'))

WebUI.verifyGreaterThanOrEqual(SCatd6, 0)

String SCatd7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_3473'))

WebUI.verifyGreaterThanOrEqual(SCatd7, 0)

String SCatd8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_232'))

WebUI.verifyGreaterThanOrEqual(SCatd8, 0)

String SCatd9 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_1196'))

WebUI.verifyGreaterThanOrEqual(SCatd9, 0)

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_Chart2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_signposttype'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2_3'))

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_Data3'))

String SPth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_signposttype'))

WebUI.verifyMatch(SPth1, 'signposttype', false)

String SPth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_U-Channel'))

WebUI.verifyMatch(SPth2, 'U-Channel', false)

String SPth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Post'))

WebUI.verifyMatch(SPth3, 'Post', false)

String SPth4 = WebUI.getText(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Other3'))

WebUI.verifyMatch(SPth4, 'Other', false)

String SPth5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Signal Mast'))

WebUI.verifyMatch(SPth5, 'Signal Mast', false)

String SPth6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Utility Pole'))

WebUI.verifyMatch(SPth6, 'Utility Pole', false)

String SPth7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/th_Light Pole'))

WebUI.verifyMatch(SPth7, 'Light Pole', false)

String SPtd1 = WebUI.getText(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_count3'))

WebUI.verifyMatch(SPtd1, 'count', false)

String SPtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_13709'))

WebUI.verifyGreaterThanOrEqual(SPtd2, 0)

String SPtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_4715'))

WebUI.verifyGreaterThanOrEqual(SPtd3, 0)

String SPtd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_263'))

WebUI.verifyGreaterThanOrEqual(SPtd4, 0)

String SPtd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_981'))

WebUI.verifyGreaterThanOrEqual(SPtd5, 0)

String SPtd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_1226'))

WebUI.verifyGreaterThanOrEqual(SPtd6, 0)

String SPtd7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/td_951'))

WebUI.verifyGreaterThanOrEqual(SPtd7, 0)

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_Chart3'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_signcondition'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg.name)

String jpegChart = jpeg.name

if (jpegChart.contains('Chart') && jpegChart.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/button'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(png.name)

String pngChart = png.name

if (pngChart.contains('Chart') && pngChart.endsWith('.png')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_postmaterial'))
} else {
    throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/button1'))

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/div_Save as JPEG1'))

WebUI.delay(5)

File jpeg1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg1.name)

String jpegChart1 = jpeg1.name

if (jpegChart1.contains('Chart') && jpegChart1.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/button1'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/div_Save as PNG1'))

WebUI.delay(5)

File png1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(png1.name)

String pngChart1 = png1.name

if (pngChart1.contains('Chart') && pngChart1.endsWith('.png')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_signcategory'))
} else {
    throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/button2'))

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/div_Save as JPEG2'))

WebUI.delay(5)

File jpeg2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg2.name)

String jpegChart2 = jpeg2.name

if (jpegChart2.contains('Chart') && jpegChart2.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/button2'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/div_Save as PNG2'))

WebUI.delay(5)

File png2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(png2.name)

String pngChart2 = png2.name

if (pngChart2.contains('Chart') && pngChart2.endsWith('.png')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_signposttype'))
} else {
    throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/button3'))

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/div_Save as JPEG3'))

WebUI.delay(5)

File jpeg3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg3.name)

String jpegChart3 = jpeg3.name

if (jpegChart3.contains('Chart') && jpegChart3.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/button3'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/div_Save as PNG3'))

WebUI.delay(5)

File png3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(png3.name)

String pngChart3 = png3.name

if (pngChart3.contains('Chart') && pngChart3.endsWith('.png')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/span_Go back to options'))
} else {
    throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sign/Percentage_Of_Sign_Stats/Page_Streetlogix/h6_Sign'))

