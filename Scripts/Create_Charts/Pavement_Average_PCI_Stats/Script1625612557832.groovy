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

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/div_Create Charts - Copy'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-462_1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/p_Average PCI Stats'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Data'))

String functionalCLass = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_Functional Class'))

WebUI.verifyMatch(functionalCLass, 'Functional Class', false)

String local = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_Local'))

WebUI.verifyMatch(local, 'Local', false)

String majorurbCollector = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_Majorurb collector'))

WebUI.verifyMatch(majorurbCollector, 'Major/urb collector', false)

String minorArterial = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_Minor Arterial'))

WebUI.verifyMatch(minorArterial, 'Minor Arterial', false)

String otherPrincArterial = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_Other princ arterial'))

WebUI.verifyMatch(otherPrincArterial, 'Other princ arterial', false)

String principalArterial = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_Principal Arterial'))

WebUI.verifyMatch(principalArterial, 'Principal Arterial', false)

String tdPCI = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_pci'))

WebUI.verifyMatch(tdPCI, 'pci', false)

String Ftd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_62.219'))

String DBFtd1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('functional_class', 'Local').toString()

WebUI.verifyMatch(Ftd1, DBFtd1, false)

String Ftd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_71.71'))

String DBFtd2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('functional_class', 'Major/urb collector').toString()

WebUI.verifyMatch(Ftd2, DBFtd2, false)

String Ftd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_70.527'))

String DBFtd3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('functional_class', 'Minor Arterial').toString()

WebUI.verifyMatch(Ftd3, DBFtd3, false)

String Ftd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_73.462'))

String DBFtd4 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('functional_class', 'Other princ arterial').toString()

WebUI.verifyMatch(Ftd4, DBFtd4, false)

String Ftd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_72.375'))

String DBFtd5 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('functional_class', 'Principal Arterial').toString()

WebUI.verifyMatch(Ftd5, DBFtd5, false)

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Chart'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Ward'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Data1'))

String ward = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_Ward'))

WebUI.verifyMatch(ward, 'Ward', false)

String Wth1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_1'))

WebUI.verifyMatch(Wth1, '1', false)

String Wth2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_2'))

WebUI.verifyMatch(Wth2, '2', false)

String Wth3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_3'))

WebUI.verifyMatch(Wth3, '3', false)

String Wth4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_4'))

WebUI.verifyMatch(Wth4, '4', false)

String Wth5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_5'))

WebUI.verifyMatch(Wth5, '5', false)

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_43'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_50'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_null'))

String pci1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_pci1'))

WebUI.verifyMatch(pci1, 'pci', false)

String Wtd1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_62.118'))

String DBWtd1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('Ward', '1').toString()

WebUI.verifyMatch(Wtd1, DBWtd1, false)

String Wtd2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_62.588'))

String DBWtd2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('Ward', '2').toString()

WebUI.verifyMatch(Wtd2, DBWtd2, false)

String Wtd3 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_66.303'))

String DBWtd3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('Ward', '3').toString()

WebUI.verifyMatch(Wtd3, DBWtd3, false)

String Wtd4 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_65.308'))

String DBWtd4 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('Ward', '4').toString()

WebUI.verifyMatch(Wtd4, DBWtd4, false)

String Wtd5 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_66.183'))

String DBWtd5 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('Ward', '5').toString()

WebUI.verifyMatch(Wtd5, DBWtd5, false)

String Wtd6 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_72'))

String DBWtd6 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('Ward', '43').toString()

WebUI.verifyMatch(Wtd6, DBWtd6, false)

String Wtd7 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_70'))

String DBWtd7 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('Ward', '50').toString()

WebUI.verifyMatch(Wtd7, DBWtd7, false)

String Wtd8 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_57.467'))

String DBWtd8 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilterForNullWard'().toString()

WebUI.verifyMatch(Wtd8, DBWtd8, false)

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Chart1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/svg_Surface Type_MuiSvgIcon-root-462 MuiSvg_0fb56f'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Surface Type'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1_2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Data2'))

String surfaceType = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_Surface Type'))

WebUI.verifyMatch(surfaceType, 'Surface Type', false)

String asphalt = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/th_Asphalt'))

WebUI.verifyMatch(asphalt, 'Asphalt', false)

String pci2 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_pci2'))

WebUI.verifyMatch(pci2, 'pci', false)

String Std1 = WebUI.getText(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/td_64.652'))

String DBStd1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('surface_type', 'Asphalt').toString()

WebUI.verifyMatch(Std1, DBStd1, false)

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Chart2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Functional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/button'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/div_Save as JPEG'))

WebUI.delay(5)

File jpeg = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg.name)

String jpegChart = jpeg.name

if(jpegChart.contains("Chart") && jpegChart.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/button'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/div_Save as PNG'))

WebUI.delay(5)

File png = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png.name)

String pngChart = png.name

if(pngChart.contains("Chart") && pngChart.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Ward'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/button1'))

WebUI.click(findTestObject('Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/div_Save as JPEG1'))

WebUI.delay(5)

File jpeg1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg1.name)

String jpegChart1 = jpeg1.name

if(jpegChart1.contains("Chart") && jpegChart1.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/button1'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/div_Save as PNG1'))

WebUI.delay(5)

File png1 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png1.name)

String pngChart1 = png1.name

if(pngChart1.contains("Chart") && pngChart1.endsWith('.png')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/svg_Surface Type_MuiSvgIcon-root-462 MuiSvg_0fb56f'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Surface Type'))

WebUI.click(findTestObject('Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/button2'))

WebUI.click(findTestObject('Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/div_Save as JPEG2'))

WebUI.delay(5)

File jpeg2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(jpeg2.name)

String jpegChart2 = jpeg2.name

if(jpegChart2.contains("Chart") && jpegChart2.endsWith('.jpeg')) {
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/button2'))
} else {
	throw new Exception("JPEG Chart Not Downloaded")
}

WebUI.click(findTestObject('Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/div_Save as PNG2'))

WebUI.delay(5)

File png2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(png2.name)

String pngChart2 = png2.name

if(pngChart2.contains("Chart") && pngChart2.endsWith('.png')) {	
	WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/span_Go back to options'))
} else {
	throw new Exception("PNG Chart Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Create_Charts/Pavement/Average_PCI_Stats/Page_Streetlogix/h6_Pavement'))

