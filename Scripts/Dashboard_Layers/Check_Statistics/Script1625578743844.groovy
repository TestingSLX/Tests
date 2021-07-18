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

String pciAvg = pci.replaceAll("[^0-9]", "")

String avgPCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCI'()

WebUI.verifyMatch(pciAvg, avgPCI, false)

String milesPCI = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Length 342 miles'))

String pciMiles = milesPCI.replaceAll("[^0-9]", "")

String totalMilesPCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getPavementMiles'()

WebUI.verifyMatch(pciMiles, totalMilesPCI, false)

String backlogPCI = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Backlog  125,226,108'))

String pciBacklog = backlogPCI.replaceAll("[^0-9]", "")

String totalBacklogPCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getPavementBacklog'()

WebUI.verifyMatch(pciBacklog, totalBacklogPCI, false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/button_Pavement Average PCI 65_MuiButtonBas_02e04c'))

WebUI.delay(5)

String sci = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/h6_Sidewalk Average SCI 69'))

String sciAvg = sci.replaceAll("[^0-9]", "")

String avgSCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAverageSCI'()

WebUI.verifyMatch(sciAvg, avgSCI, false)

String milesSCI = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Length 344 miles'))

String sciMiles = milesSCI.replaceAll("[^0-9]", "")

String totalMilesSCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getSidewalkMiles'()

WebUI.verifyMatch(sciMiles, totalMilesSCI, false)

String backlogSCI = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Backlog  219,604,111'))

String sciBacklog = backlogSCI.replaceAll("[^0-9]", "")

String totalBacklogSCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getSidewalkBacklog'()
 
WebUI.verifyMatch(sciBacklog, totalBacklogSCI, false)

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/button_Pavement Average PCI 65_MuiButtonBas_02e04c'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/canvas_Statistics_canvasjs-chart-canvas'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/button_Pavement Average PCI 65_MuiButtonBas_02e04c'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/canvas_Statistics_canvasjs-chart-canvas_1'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/button_Pavement Average PCI 65_MuiButtonBas_02e04c'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/h6_Pavement Average PCI 65'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Length 342 miles'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Statistics/Page_Streetlogix/p_Total Backlog  125,226,108'))

