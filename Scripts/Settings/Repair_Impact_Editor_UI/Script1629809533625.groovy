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

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Repair Impact Editor'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/h1_Repair Impact Editor'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/label_Select surface type'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Asphalt'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_Asphalt'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/label_Maintenance Suggestion'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Preventive Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_Preventive Maintenance'))

def PCI = []

def pciBoundaries = []

PCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.repairImpactBoundaries'()

pciBoundaries = (PCI[0])

def impact = []

def impactValues = []

impact = CustomKeywords.'com.database_keywords.test.Database_Keywords.repairImpactValues'()

impactValues = (impact[0])

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_0,40'), 
    (pciBoundaries[0]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar1'), 
    (impactValues[0]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_40,70'), 
    (pciBoundaries[1]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar2'), 
    (impactValues[1]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_70,90'), 
    (pciBoundaries[2]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar3'), 
    (impactValues[2]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_90,100'), 
    (pciBoundaries[3]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar4'), 
    (impactValues[3]).toString())

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Preventive Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_Reclamation'))

pciBoundaries1 = (PCI[1])

impactValues1 = (impact[1])

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_0,40'), 
    (pciBoundaries1[0]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar1_1'), (impactValues1[0]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_40,70'), 
    (pciBoundaries1[1]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar2_1'), (impactValues1[1]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_70,90'), 
    (pciBoundaries1[2]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar3_1'), (impactValues1[2]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_90,100'), 
    (pciBoundaries1[3]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar4_1'), (impactValues1[3]).toString())

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Preventive Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_Rehabilitation'))

pciBoundaries2 = (PCI[2])

impactValues2 = (impact[2])

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_0,40'), 
    (pciBoundaries2[0]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar1_2'), (impactValues2[0]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_40,70'), 
    (pciBoundaries2[1]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar2_2'), (impactValues2[1]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_70,90'), 
    (pciBoundaries2[2]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar3_2'), (impactValues2[2]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_90,100'), 
    (pciBoundaries2[3]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar4_2'), (impactValues2[3]).toString())

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Preventive Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_Extensive Patching'))

pciBoundaries3 = (PCI[3])

impactValues3 = (impact[3])

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_0,40'), 
    (pciBoundaries3[0]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar1_3'), (impactValues3[0]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_40,70'), 
    (pciBoundaries3[1]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar2_3'), (impactValues3[1]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_70,90'), 
    (pciBoundaries3[2]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar3_3'), (impactValues3[2]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_90,100'), 
    (pciBoundaries3[3]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar4_3'), (impactValues3[3]).toString())

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_Preventive Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/li_Defer 1'))

pciBoundaries4 = (PCI[4])

impactValues4 = (impact[4])

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_0,40'), 
    (pciBoundaries4[0]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar1_4'), (impactValues4[0]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_40,70'), 
    (pciBoundaries4[1]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar2_4'), (impactValues4[1]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_70,90'), 
    (pciBoundaries4[2]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar3_4'), (impactValues4[2]).toString())

WebUI.verifyElementText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/text_90,100'), 
    (pciBoundaries4[3]).toString().replace('[', '').replace(']', '').replace(' ', ''))

WebUI.verifyElementText(findTestObject('Settings/Repair_Impact_Editor_UI/Page_Streetlogix/div_bar4_4'), (impactValues4[3]).toString())

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/button_Reset'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/p_New repair impact is saved'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_UI/Page_Streetlogix/button_OK'))

