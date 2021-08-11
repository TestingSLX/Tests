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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Editing'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Attribute Editor'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/label_Select feature by street name'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name'), 
    'ABBY LN')

WebUI.sendKeys(findTestObject("Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name"), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject("Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name"), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_ABBY LN'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_SS_ID'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_streetname'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_fromstreetname'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_fromstreetname'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_fromstreetname'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_fromstreetname'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_fromstreetname'), 'ADAMS ST')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_ADAMS ST'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_tostreetname'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_tostreetname'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_tostreetname'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_tostreetname'), 'ACCESS RD')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_ACCESS RD'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_PCI'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_PCI'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_PCI'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_PCI'), '75')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Maintenance Suggestion'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Maintenance Suggestion'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Maintenance Suggestion'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Maintenance Suggestion'), 'Reconstruction')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Reconstruction'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Estimated Cost ()'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__estimated_cost'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__estimated_cost'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__estimated_cost'), '43521')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Repair Priority'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__repair_priority'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__repair_priority'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__repair_priority'), '78.66')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Functional Class'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Functional Class'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Functional Class'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Functional Class'), 'Minor Arterial')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Minor Arterial'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Functional Class'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__functional_class_id'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__functional_class_id'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__functional_class_id'), 
    '4')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Length (ft)'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft'), 
    '798')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Width (ft)'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft'), 
    '35')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Area (sy)'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__area_sy'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__area_sy'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__area_sy'), 
    '4022')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Surface Type'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Surface Type'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Surface Type'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Surface Type'), 'Asphalt')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Asphalt'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Last Repair Method'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Last Repair Method'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Last Repair Method'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Last Repair Method'), 'Preventive Maintenance')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Preventive Maintenance'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Last Repair Date'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Last Repair Cost'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__last_repair_cost'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__last_repair_cost'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__last_repair_cost'), 
    '98876')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Future Event'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__future_event'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__future_event'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__future_event'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Future Event Date'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_PCI_historic'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__pci_historic'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__pci_historic'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__pci_historic'), 
    '78')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_notes'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__notes'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__notes'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__notes'), ' Testing')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_UID'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__uid'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__uid'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__uid'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__uid'), '15031_2')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_TravelLane'))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__travellane'), 
    '3')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Editor Name'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__editor_name'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Editor Id'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Last Edit'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Editor Notes'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__editor_notes'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__editor_notes'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__editor_notes'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Width (ft)'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft_1'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft_1'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft_1'), 
    '44')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Length (ft)'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft_1'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft_1'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft_1'), 
    '798')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Ward'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Ward'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Ward'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Ward'), '2')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_2'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Surface Type ID'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_city'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__city'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__city'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__city'), 'Portland')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_state'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__state'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__state'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__state'), 'ME')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_country'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__country'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__country'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__country'), 
    'USA')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Management Section'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Need Year'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__need_year'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__need_year'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__need_year'), 
    '6')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_LT Crack Density'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__l_t_crack_density'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__l_t_crack_density'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__l_t_crack_density'), 
    '11')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Alligator Crack Density'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__alligator_crack_density'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__alligator_crack_density'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__alligator_crack_density'), 
    '11')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Bump Density'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__bump_density'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__bump_density'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__bump_density'), 
    '11')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Load Associated Deducts'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__load_associated_deducts'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__load_associated_deducts'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__load_associated_deducts'), 
    '11')

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/span_Save'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/h2_Success'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Feature attribute updated'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/button_OK'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Setting'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Restore Edits'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Pavement Maintenance_Restore_Edits'))

WebUI.click(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Pavement Maintenance_Restore_Edits'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Demo Admin_6368'))

WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/span_Restore'))

//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Editing'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/div_Attribute Editor'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/body_JavaScript is required in order to use_0996c0_1'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_Pavement Maintenance'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Select feature by street name_MuiSvgIco_4db4a3'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/svg_Select feature by street name_MuiSvgIco_358b07'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name_mui-63797'), 
//    'ABBY LN')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/li_ABBY LN'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name_mui-63797'), 
//    'ABBY LN')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_streetname'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__streetname'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_fromstreetname'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__free-solo-with-text'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_tostreetname'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__free-solo-with-text'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_PCI'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Maintenance Suggestion'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__free-solo-with-text'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Estimated Cost ()'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Repair Priority'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Functional Class'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__free-solo-with-text'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Functional Class'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__functional_class_id'), 
//    '0')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Length (ft)'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft'), 
//    '868')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Width (ft)'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft'), 
//    '32')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Area (sy)'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__area_sy'), 
//    '3086')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Surface Type'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__free-solo-with-text'), 
//    't')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Last Repair Method'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__free-solo-with-text'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Last Repair Cost'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__last_repair_cost'), 
//    '0')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Future Event'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__future_event'), 
//    '')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Future Event Date'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_PCI_historic'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__pci_historic'), 
//    '88')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_notes'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__notes'), ' test')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_UID'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__uid'), '15031_1')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_TravelLane'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__travellane'), 
//    '03')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Editor Name'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__editor_name'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Editor Id'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Editor Notes'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__editor_notes'), 
//    'test')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Width (ft)'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__width_ft_1'), 
//    '321')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Length (ft)'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__length_ft_1'), 
//    '8681')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Ward'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__free-solo-with-text'), 
//    '1')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Surface Type ID'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_city'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__city'), 'Portland')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_state'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__state'), 'ME')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_country'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__country'), 
//    'USA')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Management Section'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Need Year'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__need_year'), 
//    '07')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_LT Crack Density'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__l_t_crack_density'), 
//    '10')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Alligator Crack Density'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__alligator_crack_density'), 
//    '10')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Bump Density'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__bump_density'), 
//    '10')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/p_Load Associated Deducts'))
//
//WebUI.setText(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input__load_associated_deducts'), 
//    '10')
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/span_Reset'))
//
//WebUI.click(findTestObject('Object Repository/Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/span_Cancel'))
//
