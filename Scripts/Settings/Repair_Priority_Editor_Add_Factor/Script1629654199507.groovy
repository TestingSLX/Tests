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

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/div_Repair Priority Editor'))

WebUI.click(findTestObject('Settings/Repair_Priority_Add_Factor/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/h1_Repair Priority Editor'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/label_Select Factor'))

WebUI.click(findTestObject('Settings/Repair_Priority_Add_Factor/Page_Streetlogix/div_PCI_historic'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/li_PCI_historic'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Functional Class'), 'Functional Class')

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_PCI'), 'PCI')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/button_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_PCI_historic'), 'Estimated Cost ($)')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_TravelLane'), 'Repair Priority')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Length (ft)'), 'Length (ft)')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Width (ft)'), 'Width (ft)')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Estimated Cost ()'), 'Area (sy)')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Repair Priority'), 'Last Repair Cost')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Area (sy)'), 'Ward')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Last Repair Cost'), 'Management Section')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Width (ft)1'), 'need_year')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Length (ft)1'), 'L/T Crack Density')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Ward'), 'Alligator Crack Density')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Surface Type ID'), 'Bump Density')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Management Section'), 'Load Associated Deducts')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Need Year'), 'TravelLane')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))
//
//WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Alligator Crack Density'), 'Alligator Crack Density')
//
//WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Bump Density'), 'Bump Density')
//
//WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Add Factor'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/td_Load Associated Deducts'), 'Load Associated Deducts')
//
//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/button_Add Factor'))
//
WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/button_Add Factor'), 'disabled', 0)

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/span_Reset'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/label_Select Factor'))

WebUI.click(findTestObject('Settings/Repair_Priority_Add_Factor/Page_Streetlogix/div_PCI_historic'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Priority_Add_Factor/Page_Streetlogix/li_PCI_historic'))

