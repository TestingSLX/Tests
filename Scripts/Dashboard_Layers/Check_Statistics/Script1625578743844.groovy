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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/h1_Dashboard'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/h6_Statistics'))

String pci = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/h6_Pavement Average PCI 65'))

String pciAvg = pci.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)")[1]

WebUI.verifyGreaterThan(pciAvg, 0)

String milesPCI = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Length 342 miles'))

String pciMiles = milesPCI.substring(14, 16)

WebUI.verifyGreaterThan(pciMiles, 0)

String backlogPCI = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Backlog  125,226,108'))

String pciBacklog = backlogPCI.substring(18, 28)

String newPCIBacklog = pciBacklog.replace(',', '')

int pcibacklog = Integer.parseInt(newPCIBacklog)

WebUI.verifyGreaterThan(pcibacklog, 0)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/button_Pavement Average PCI 65_MuiButtonBas_02e04c'))

WebUI.delay(5)

String sci = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/h6_Sidewalk Average SCI 69'))

String sciAvg = sci.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)")[1]

WebUI.verifyGreaterThan(sciAvg, 0)

String milesSCI = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Length 344 miles'))

String sciMiles = milesSCI.substring(14, 16)

WebUI.verifyGreaterThan(sciMiles, 0)

String backlogSCI = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Backlog  219,604,111'))

String sciBacklog = backlogSCI.substring(18, 28)

String newSCIBacklog = sciBacklog.replace(',', '')

int scibacklog = Integer.parseInt(newSCIBacklog)

WebUI.verifyGreaterThan(scibacklog, 0)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/button_Pavement Average PCI 65_MuiButtonBas_02e04c'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/canvas_Statistics_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/button_Pavement Average PCI 65_MuiButtonBas_02e04c'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/canvas_Statistics_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/button_Pavement Average PCI 65_MuiButtonBas_02e04c'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/h6_Pavement Average PCI 65'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Length 342 miles'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Backlog  125,226,108'))

