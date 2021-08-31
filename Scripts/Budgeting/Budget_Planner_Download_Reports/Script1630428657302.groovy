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

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/div_Budget Planner'))

WebUI.click(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/div_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/li_No Filter'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/label_Filter by'))

WebUI.click(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/div_year'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/li_3 years'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/label_Program duration'))

WebUI.setText(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/input_Annual budget'), 
    '123,456,789')

WebUI.setText(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/input_Scenario Name'), 
    'ATestBudget')

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/span_Execute'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/button_Report'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/h2_Export Budget Planner Results'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/span_PDF'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/span_Word'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/span_PDF'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/button_EXPORT'))

WebUI.delay(150)

File pdf = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(pdf.name)

String pdfFile = pdf.name

if(pdfFile.contains("budgetPlannerReport") && pdfFile.endsWith('.pdf')) {
	println('File Downloaded')
} else {
	throw new Exception("Pdf File Not Downloaded")
}

WebUI.click(findTestObject('Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/button_Report'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/span_Word'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/span_EXPORT'))

WebUI.delay(20)

File doc = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
	-(it.lastModified())
}).head()

println(doc.name)

String docFile = doc.name

if(docFile.contains("BudgetPlannerResult") && docFile.endsWith('.docx')) {
	println('File Downloaded')
} else {
	throw new Exception("Doc File Not Downloaded")
}

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/button_Discard'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/h1_Budget Planner'))

WebUI.click(findTestObject('Object Repository/Budgeting/Bdget_Planner/Budget_Planner_Download_Reports/Page_Streetlogix/label_Select layer'))

