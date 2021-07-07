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

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Create Charts'))

WebUI.click(findTestObject('Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-102'))

WebUI.click(findTestObject('Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-102'))

String pciAvg = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/h6_Pavement Average PCI 65'))

WebUI.verifyMatch(pciAvg, '^Pavement Average PCI.*', true, FailureHandling.STOP_ON_FAILURE)

String pavementTotalLength = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/p_Total Length 342 miles'))

WebUI.verifyMatch(pavementTotalLength, '^Total Length.*', true, FailureHandling.STOP_ON_FAILURE)

String pavementTotalBacklog = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/p_Total Backlog  125,226,108'))

WebUI.verifyMatch(pavementTotalBacklog, '^Total Backlog.*', true, FailureHandling.STOP_ON_FAILURE)

String avgPCIStats = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Average PCI Stats'))

WebUI.verifyMatch(avgPCIStats, '^Average PCI Stats.*', true, FailureHandling.STOP_ON_FAILURE)

String pavementMaintenanceBacklogStats =WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Maintenance Backlog Stats'))

WebUI.verifyMatch(pavementMaintenanceBacklogStats, '^Maintenance Backlog Stats.*', true, FailureHandling.STOP_ON_FAILURE)

String pavementDistributionRepairs = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Distribution of Repairs'))

WebUI.verifyMatch(pavementDistributionRepairs, '^Distribution of Repairs.*', true, FailureHandling.STOP_ON_FAILURE)

String pavementDistributionofLength = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Distribution of Length'))

WebUI.verifyMatch(pavementDistributionofLength, '^Distribution of Length.*', true, FailureHandling.STOP_ON_FAILURE)

String pavementDistributionofArea = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Distribution of Area'))

WebUI.verifyMatch(pavementDistributionofArea, '^Distribution of Area.*', true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Pavement_MuiSvgIcon-root-102'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Sidewalk_MuiSvgIcon-root-462'))

String sidewalk = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/h6_Sidewalk'))

WebUI.verifyMatch(sidewalk, 'Sidewalk', true, FailureHandling.STOP_ON_FAILURE)

String sidewalkAvg = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/h6_Sidewalk Average SCI 69'))

WebUI.verifyMatch(sidewalkAvg, '^Sidewalk Average SCI.*', true, FailureHandling.STOP_ON_FAILURE)

String sidewalkTotalLength = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/p_Total Length 344 miles'))

WebUI.verifyMatch(sidewalkTotalLength, '^Total Length.*', true, FailureHandling.STOP_ON_FAILURE)

String sidewalkTotalBacklog = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/p_Total Backlog  219,604,111'))

WebUI.verifyMatch(sidewalkTotalBacklog, '^Total Backlog.*', true, FailureHandling.STOP_ON_FAILURE)

String avgSCIStats = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Average SCI Stats'))

WebUI.verifyMatch(avgSCIStats, 'Average SCI Stats', true, FailureHandling.STOP_ON_FAILURE)

String sidewalkMaintenanceBacklogStats = WebUI.getText(findTestObject('Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Maintenance Backlog Stats - Sidewalk'))

WebUI.verifyMatch(sidewalkMaintenanceBacklogStats, 'Maintenance Backlog Stats', true, FailureHandling.STOP_ON_FAILURE)

String sidewalkDistributionofRepairs = WebUI.getText(findTestObject('Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Distribution of Repairs - Sidewalk'))

WebUI.verifyMatch(sidewalkDistributionofRepairs, 'Distribution of Repairs', true, FailureHandling.STOP_ON_FAILURE)

String sidewalkDistributionofLength = WebUI.getText(findTestObject('Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Distribution of Length - Sidewalk'))

WebUI.verifyMatch(sidewalkDistributionofLength, 'Distribution of Length', true, FailureHandling.STOP_ON_FAILURE)

String sidewalkDistributionofArea = WebUI.getText(findTestObject('Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Distribution of Area - Sidewalk'))

WebUI.verifyMatch(sidewalkDistributionofArea, 'Distribution of Area', true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Sidewalk_MuiSvgIcon-root-462_1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Sign_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas'))

String numberOfSIgnStats = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Number of Sign Stats'))

WebUI.verifyMatch(numberOfSIgnStats, "Number of Sign Stats", false)

String signBacklogStats = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Sign Backlog Stats'))

WebUI.verifyMatch(signBacklogStats, "Sign Backlog Stats", false)

String percentageOfSignStats = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Percentage of Sign Stats'))

WebUI.verifyMatch(percentageOfSignStats, "Percentage of Sign Stats", false)

String signCategoryStats = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Sign Category Stats'))

WebUI.verifyMatch(signCategoryStats, "Sign Category Stats", false)

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Sign_MuiSvgIcon-root-462_1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Work Orders_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/canvas_Data_canvasjs-chart-canvas_1'))

String numberOfWorkOrderStats = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Number of Work Order Stats'))

WebUI.verifyMatch(numberOfWorkOrderStats, "Number of Work Order Stats", false)

String workOrderTypeStats = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Work Order Type Stats'))

WebUI.verifyMatch(workOrderTypeStats, "Work Order Type Stats", false)

String workOrderAssigneeStats = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Work Order Assignee Stats'))

WebUI.verifyMatch(workOrderAssigneeStats, "Work Order Assignee Stats", false)

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Work Orders_MuiSvgIcon-root-462_1'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Customize Charts_MuiSvgIcon-root-462'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Select a layer as data sourcePavement M_90028c'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Select a method analyze and display dat_f229e2'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Select category fieldFunctional Class'))

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/div_Select chart typeColumn'))

String selectLayer = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/label_Select a layer as data source'))

WebUI.verifyMatch(selectLayer, "Select a layer as data source:", false)

String selectMethod = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/label_Select a method analyze and display d_879325'))

WebUI.verifyMatch(selectMethod, "Select a method analyze and display data as charts:", false)

String selectCategory = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/label_Select category field'))

WebUI.verifyMatch(selectCategory, "Select category field:", false)

String selectChart = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/label_Select chart type'))

WebUI.verifyMatch(selectChart, "Select chart type:", false)

String buttonText = WebUI.getText(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/button_Generate Chart'))

WebUI.verifyMatch(buttonText, "GENERATE CHART", false)

WebUI.click(findTestObject('Object Repository/Create_Charts/Chart_Section_Types/Page_Streetlogix/svg_Customize Charts_MuiSvgIcon-root-462_1'))

