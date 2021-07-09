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

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/div_Create Charts'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462_1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/svg_Sidewalk_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/p_Maintenance Backlog Stats'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Data'))

String functionalClass = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/th_Functional Class'))

WebUI.verifyMatch(functionalClass, 'Functional Class', false)

String local = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/th_Local'))

WebUI.verifyMatch(local, 'Local', false)

String majorurbCollector = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/th_Majorurb collector'))

WebUI.verifyMatch(majorurbCollector, 'Major/urb collector', false)

String minorArterial = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/th_Minor Arterial'))

WebUI.verifyMatch(minorArterial, 'Minor Arterial', false)

String otherArterial = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/th_Other princ arterial'))

WebUI.verifyMatch(otherArterial, 'Other princ arterial', false)

String principalArterial = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/th_Principal Arterial'))

WebUI.verifyMatch(principalArterial, 'Principal Arterial', false)

String FCCost = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/td_estimated_cost'))

WebUI.verifyMatch(FCCost, 'estimated_cost', false)

String Ftd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_105617082'))

WebUI.verifyGreaterThanOrEqual(Ftd1, 0)

String Ftd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_26086389'))

WebUI.verifyGreaterThanOrEqual(Ftd2, 0)

String Ftd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_72061501'))

WebUI.verifyGreaterThanOrEqual(Ftd3, 0)

String Ftd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_12798601'))

WebUI.verifyGreaterThanOrEqual(Ftd4, 0)

String Ftd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_3040538'))

WebUI.verifyGreaterThanOrEqual(Ftd4, 0)

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Ward'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Data1'))

String Wth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_Ward'))

WebUI.verifyMatch(Wth1, 'Ward', false)

String Wth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_1'))

WebUI.verifyMatch(Wth2, '1', false)

String Wth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_2'))

WebUI.verifyMatch(Wth3, '2', false)

String Wth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_3'))

WebUI.verifyMatch(Wth4, '3', false)

String Wth5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_4'))

WebUI.verifyMatch(Wth5, '4', false)

String Wth6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_5'))

WebUI.verifyMatch(Wth6, '5', false)

String Wth7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_10'))

WebUI.verifyMatch(Wth7, '10', false)

String Wth8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_null'))

WebUI.verifyMatch(Wth8, 'null', false)

String Wtd1 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_estimated_cost1'))

WebUI.verifyMatch(Wtd1, 'estimated_cost', false)

String Wtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_31505479'))

WebUI.verifyGreaterThanOrEqual(Wtd2, 0)

String Wtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_38458305'))

WebUI.verifyGreaterThanOrEqual(Wtd3, 0)

String Wtd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_80386064'))

WebUI.verifyGreaterThanOrEqual(Wtd4, 0)

String Wtd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_34970033'))

WebUI.verifyGreaterThanOrEqual(Wtd5, 0)

String Wtd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_33921909'))

WebUI.verifyGreaterThanOrEqual(Wtd6, 0)

String Wtd7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_2158'))

WebUI.verifyGreaterThanOrEqual(Wtd7, 0)

String Wtd8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_360163'))

WebUI.verifyGreaterThanOrEqual(Wtd8, 0)

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Chart1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Surface Type'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Data2'))

String Sth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_Surface Type'))

WebUI.verifyMatch(Sth1, 'Surface Type', false)

String Sth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_Asphalt'))

WebUI.verifyMatch(Sth2, 'Asphalt', false)

String Sth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_Brick'))

WebUI.verifyMatch(Sth3, 'Brick', false)

String Sth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_Concrete'))

WebUI.verifyMatch(Sth4, 'Concrete', false)

String Std1 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_estimated_cost2'))

WebUI.verifyMatch(Std1, 'estimated_cost', false)

String Std2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_180621976'))

WebUI.verifyGreaterThanOrEqual(Std2, 0)

String Std3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_12836036'))

WebUI.verifyGreaterThanOrEqual(Std3, 0)

String Std4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_26146099'))

WebUI.verifyGreaterThanOrEqual(Std4, 0)

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Chart2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Condition Index'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2_3'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Data3'))

String Cth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_Condition Index'))

WebUI.verifyMatch(Cth1, 'Condition Index', false)

String Cth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_0 - 10'))

WebUI.verifyMatch(Cth2, '0 - 10', false)

String Cth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_10 - 25'))

WebUI.verifyMatch(Cth3, '10 - 25', false)

String Cth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_25 - 40'))

WebUI.verifyMatch(Cth4, '25 - 40', false)

String Cth5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_40 - 55'))

WebUI.verifyMatch(Cth5, '40 - 55', false)

String Cth6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_55 - 70'))

WebUI.verifyMatch(Cth6, '55 - 70', false)

String Cth7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_70 - 85'))

WebUI.verifyMatch(Cth7, '70 - 85', false)

String Cth8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/th_85 - 100'))

WebUI.verifyMatch(Cth8, '85 - 100', false)

String Ctd1 = WebUI.getText(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_estimated_cost3'))

WebUI.verifyMatch(Ctd1, 'estimated_cost', false)

String Ctd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_0'))

WebUI.verifyGreaterThanOrEqual(Ctd2, 0)

String Ctd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_663933'))

WebUI.verifyGreaterThanOrEqual(Ctd3, 0)

String Ctd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_13090512'))

WebUI.verifyGreaterThanOrEqual(Ctd4, 0)

String Ctd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_27418797'))

WebUI.verifyGreaterThanOrEqual(Ctd5, 0)

String Ctd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_144221481'))

WebUI.verifyGreaterThanOrEqual(Ctd6, 0)

String Ctd7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_30872316'))

WebUI.verifyGreaterThanOrEqual(Ctd7, 0)

String Ctd8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/td_3337072'))

WebUI.verifyGreaterThanOrEqual(Ctd8, 0)

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Chart3'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_stats/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg.name)

String jpegChart = jpeg.name

if (jpegChart.contains('Chart') && jpegChart.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/button'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(png.name)

String pngChart = png.name

if (pngChart.contains('Chart') && pngChart.endsWith('.png')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/span_Ward'))
} else {
    throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/button1'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/div_Save as JPEG1'))

WebUI.delay(5)

File jpeg1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg1.name)

String jpegChart1 = jpeg1.name

if (jpegChart1.contains('Chart') && jpegChart1.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/button1'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/div_Save as PNG1'))

WebUI.delay(5)

File png1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(png1.name)

String pngChart1 = png1.name

if (pngChart1.contains('Chart') && pngChart1.endsWith('.png')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/span_Surface Type'))
} else {
    throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/button2'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/div_Save as JPEG2'))

WebUI.delay(5)

File jpeg2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg2.name)

String jpegChart2 = jpeg2.name

if (jpegChart2.contains('Chart') && jpegChart2.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/button2'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/div_Save as PNG2'))

WebUI.delay(5)

File png2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(png2.name)

String pngChart2 = png2.name

if (pngChart2.contains('Chart') && pngChart2.endsWith('.png')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/span_Condition Index'))
} else {
    throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/span_Condition Index'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/button3'))

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/div_Save as JPEG3'))

WebUI.delay(5)

File jpeg3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(jpeg3.name)

String jpegChart3 = jpeg3.name

if (jpegChart3.contains('Chart') && jpegChart3.endsWith('.jpeg')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/button3'))
} else {
    throw new Exception('JPEG Chart Not Downloaded')
}

WebUI.click(findTestObject('Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/div_Save as PNG3'))

WebUI.delay(5)

File png3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(png3.name)

String pngChart3 = png3.name

if (pngChart3.contains('Chart') && pngChart3.endsWith('.png')) {
    WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/span_Go back to options'))
} else {
    throw new Exception('PNG Chart Not Downloaded')
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Sidewalk/Maintenance_Backlog_Stats/Page_Streetlogix/h6_Sidewalk'))

