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

WebUI.click(findTestObject('Object Repository/Budget_Estimator/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budget_Estimator/Page_Streetlogix/div_Budget Estimator'))

WebUI.setText(findTestObject('Object Repository/Budget_Estimator/Page_Streetlogix/input_Target condition index_MuiInputBase-i_e8f2ca'), 
    '88')

WebUI.click(findTestObject('Object Repository/Budget_Estimator/Page_Streetlogix/span_Calculate'))

WebUI.click(findTestObject('Object Repository/Budget_Estimator/Page_Streetlogix/td_88'))

WebUI.click(findTestObject('Object Repository/Budget_Estimator/Page_Streetlogix/td_103,912,070'))

