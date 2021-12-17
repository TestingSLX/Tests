import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Budgeting'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Budget Estimator'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/h1_Budget Estimator'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/label_Filter by'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_Filter'))

List<WebElement> listLayers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def filter : listLayers) {
    if ((filter.getProperties()['text']) == 'No Filter') {
        filter.click()
    }
}

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 73'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_Filter'))

List<WebElement> listLayers1 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def filter1 : listLayers1) {
    if ((filter1.getProperties()['text']) == 'Maintenance Suggestion') {
        filter1.click()
    }
}

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/label_Select category'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category : listCategories) {
    if ((category.getProperties()['text']) == 'Reconstruction') {
        category.click()
    }
}

WebUI.delay(2)

String msPci1 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String maintenanceSuggestionAvgPCI1 = msPci1.replaceAll("[^0-9]", "")

def maintenanceSuggestionPCI1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('maintenance_suggestion', 'Reconstruction')
println(maintenanceSuggestionAvgPCI1)
println(maintenanceSuggestionPCI1)
WebUI.verifyMatch(maintenanceSuggestionAvgPCI1.toString(), maintenanceSuggestionPCI1.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories1 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category1 : listCategories1) {
    if ((category1.getProperties()['text']) == 'Chip Seal') {
        category1.click()
    }
}

WebUI.delay(2)

String msPci2 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String maintenanceSuggestionAvgPCI2 = msPci2.replaceAll("[^0-9]", "")

def maintenanceSuggestionPCI2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('maintenance_suggestion', 'Chip Seal')
println(maintenanceSuggestionAvgPCI2)
println(maintenanceSuggestionPCI2)
WebUI.verifyMatch(maintenanceSuggestionAvgPCI2.toString(), maintenanceSuggestionPCI2.toString(), false)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 75'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories2 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category2 : listCategories2) {
    if ((category2.getProperties()['text']) == 'Preventive Maintenance') {
        category2.click()
    }
}

WebUI.delay(2)

String msPci3 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String maintenanceSuggestionAvgPCI3 = msPci3.replaceAll("[^0-9]", "")

def maintenanceSuggestionPCI3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('maintenance_suggestion', 'Preventive Maintenance')
println(maintenanceSuggestionAvgPCI3)
println(maintenanceSuggestionPCI3)
WebUI.verifyMatch(maintenanceSuggestionAvgPCI3.toString(), maintenanceSuggestionPCI3.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories3 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category3 : listCategories3) {
    if ((category3.getProperties()['text']) == 'Defer Maintenance') {
        category3.click()
    }
}

WebUI.delay(2)

String msPci4 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String maintenanceSuggestionAvgPCI4 = msPci4.replaceAll("[^0-9]", "")

def maintenanceSuggestionPCI4 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('maintenance_suggestion', 'Defer Maintenance')
println(maintenanceSuggestionAvgPCI4)
println(maintenanceSuggestionPCI4)
WebUI.verifyMatch(maintenanceSuggestionAvgPCI4.toString(), maintenanceSuggestionPCI4.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories4 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category4 : listCategories4) {
    if ((category4.getProperties()['text']) == 'Crack Seal') {
        category4.click()
    }
}

WebUI.delay(2)

String msPci5 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String maintenanceSuggestionAvgPCI5 = msPci5.replaceAll("[^0-9]", "")

def maintenanceSuggestionPCI5 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('maintenance_suggestion', 'Crack Seal')
println(maintenanceSuggestionAvgPCI5)
println(maintenanceSuggestionPCI5)
WebUI.verifyMatch(maintenanceSuggestionAvgPCI5.toString(), maintenanceSuggestionPCI5.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories5 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category5 : listCategories5) {
    if ((category5.getProperties()['text']) == 'Rehabilitation') {
        category5.click()
    }
}

WebUI.delay(2)

String msPci6 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String maintenanceSuggestionAvgPCI6 = msPci6.replaceAll("[^0-9]", "")

def maintenanceSuggestionPCI6 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('maintenance_suggestion', 'Rehabilitation')
println(maintenanceSuggestionAvgPCI6)
println(maintenanceSuggestionPCI6)
WebUI.verifyMatch(maintenanceSuggestionAvgPCI6.toString(), maintenanceSuggestionPCI6.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_Filter'))

List<WebElement> listLayers2 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def filter2 : listLayers2) {
    if ((filter2.getProperties()['text']) == 'Functional Class') {
        filter2.click()
    }
}

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories6 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category6 : listCategories6) {
    if ((category6.getProperties()['text']) == 'Principal Arterial') {
        category6.click()
    }
}

WebUI.delay(2)

String fcPci1 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String functionalClassAvgPCI1 = fcPci1.replaceAll("[^0-9]", "")

def functionalClassPCI1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('functional_class', 'Principal Arterial')
println(functionalClassAvgPCI1)
println(functionalClassPCI1)
WebUI.verifyMatch(functionalClassAvgPCI1.toString(), functionalClassPCI1.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories7 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category7 : listCategories7) {
    if ((category7.getProperties()['text']) == 'Major/urb collector') {
        category7.click()
    }
}

WebUI.delay(2)

String fcPci2 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String functionalClassAvgPCI2 = fcPci2.replaceAll("[^0-9]", "")

def functionalClassPCI2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('functional_class', 'Major/urb collector')
println(functionalClassAvgPCI2)
println(functionalClassPCI2)
WebUI.verifyMatch(functionalClassAvgPCI2.toString(), functionalClassPCI2.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories8 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category8 : listCategories8) {
    if ((category8.getProperties()['text']) == 'Local') {
        category8.click()
    }
}

WebUI.delay(2)

String fcPci3 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String functionalClassAvgPCI3 = fcPci3.replaceAll("[^0-9]", "")

def functionalClassPCI3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('functional_class', 'Local')
println(functionalClassAvgPCI3)
println(functionalClassPCI3)
WebUI.verifyMatch(functionalClassAvgPCI3.toString(), functionalClassPCI3.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories9 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category9 : listCategories9) {
    if ((category9.getProperties()['text']) == 'Minor Arterial') {
        category9.click()
    }
}

WebUI.delay(2)

String fcPci4 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String functionalClassAvgPCI4 = fcPci4.replaceAll("[^0-9]", "")

def functionalClassPCI4 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('functional_class', 'Minor Arterial')
println(functionalClassAvgPCI4)
println(functionalClassPCI4)
WebUI.verifyMatch(functionalClassAvgPCI4.toString(), functionalClassPCI4.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories10 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category10 : listCategories10) {
    if ((category10.getProperties()['text']) == 'Other princ arterial') {
        category10.click()
    }
}

WebUI.delay(2)

String fcPci5 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String functionalClassAvgPCI5 = fcPci5.replaceAll("[^0-9]", "")

def functionalClassPCI5 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('functional_class', 'Other princ arterial')
println(functionalClassAvgPCI5)
println(functionalClassPCI5)
WebUI.verifyMatch(functionalClassAvgPCI5.toString(), functionalClassPCI5.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_Filter'))

List<WebElement> listLayers3 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def filter3 : listLayers3) {
    if ((filter3.getProperties()['text']) == 'Last Repair Method') {
        filter3.click()
    }
}

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories11 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category11 : listCategories11) {
    if ((category11.getProperties()['text']) == 'Rehabilitation') {
        category11.click()
    }
}

WebUI.delay(2)

String lrmPci1 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String lastRepairMethodAvgPCI1 = lrmPci1.replaceAll("[^0-9]", "")

def lastRepairMethodPCI1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('last_repair_method', 'Rehabilitation')
println(lastRepairMethodAvgPCI1)
println(lastRepairMethodPCI1)
WebUI.verifyMatch(lastRepairMethodAvgPCI1.toString(), lastRepairMethodPCI1.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories12 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category12 : listCategories12) {
    if ((category12.getProperties()['text']) == 'Reconstruction') {
        category12.click()
    }
}

WebUI.delay(2)

String lrmPci2 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String lastRepairMethodAvgPCI2 = lrmPci2.replaceAll("[^0-9]", "")

def lastRepairMethodPCI2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('last_repair_method', 'Reconstruction')
println(lastRepairMethodAvgPCI2)
println(lastRepairMethodPCI2)
WebUI.verifyMatch(lastRepairMethodAvgPCI2.toString(), lastRepairMethodPCI2.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories13 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category13 : listCategories13) {
    if ((category13.getProperties()['text']) == 'Mill/Fill') {
        category13.click()
    }
}

WebUI.delay(2)

String lrmPci3 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String lastRepairMethodAvgPCI3 = lrmPci3.replaceAll("[^0-9]", "")

def lastRepairMethodPCI3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('last_repair_method', 'Mill/Fill')
println(lastRepairMethodAvgPCI3)
println(lastRepairMethodPCI3)
WebUI.verifyMatch(lastRepairMethodAvgPCI3.toString(), lastRepairMethodPCI3.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories14 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category14 : listCategories14) {
    if ((category14.getProperties()['text']) == 'Reclamation') {
        category14.click()
    }
}

WebUI.delay(2)

String lrmPci4 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String lastRepairMethodAvgPCI4 = lrmPci4.replaceAll("[^0-9]", "")

def lastRepairMethodPCI4 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('last_repair_method', 'Reclamation')
println(lastRepairMethodAvgPCI4)
println(lastRepairMethodPCI4)
WebUI.verifyMatch(lastRepairMethodAvgPCI4.toString(), lastRepairMethodPCI4.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories15 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category15 : listCategories15) {
    if ((category15.getProperties()['text']) == 'Preventive Maintenance') {
        category15.click()
    }
}

WebUI.delay(2)

String lrmPci5 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String lastRepairMethodAvgPCI5 = lrmPci5.replaceAll("[^0-9]", "")

def lastRepairMethodPCI5 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('last_repair_method', 'Preventive Maintenance')
println(lastRepairMethodAvgPCI5)
println(lastRepairMethodPCI5)
WebUI.verifyMatch(lastRepairMethodAvgPCI5.toString(), lastRepairMethodPCI5.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_Filter'))

List<WebElement> listLayers4 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def filter4 : listLayers4) {
    if ((filter4.getProperties()['text']) == 'Ward') {
        filter4.click()
    }
}

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 30'))

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories16 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category16 : listCategories16) {
    if ((category16.getProperties()['text']) == '0') {
        category16.click()
    }
}

WebUI.delay(2)

String wPci1 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String wardAvgPCI1 = wPci1.replaceAll("[^0-9]", "")

def wardPCI1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('ward', '0')
println(wardPCI1)
println(wardPCI1)
WebUI.verifyMatch(wardPCI1.toString(), wardPCI1.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories17 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category17 : listCategories17) {
    if ((category17.getProperties()['text']) == '1') {
        category17.click()
    }
}

WebUI.delay(2)

String wPci2 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String wardAvgPCI2 = wPci2.replaceAll("[^0-9]", "")

def wardPCI2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('ward', '1')
println(wardPCI2)
println(wardPCI2)
WebUI.verifyMatch(wardPCI2.toString(), wardPCI2.toString(), false)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories18 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category18 : listCategories18) {
    if ((category18.getProperties()['text']) == '2') {
        category18.click()
    }
}

WebUI.delay(2)

String wPci3 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String wardAvgPCI3 = wPci3.replaceAll("[^0-9]", "")

def wardPCI3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('ward', '2')
println(wardPCI3)
println(wardPCI3)
WebUI.verifyMatch(wardPCI3.toString(), wardPCI3.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories19 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category19 : listCategories19) {
    if ((category19.getProperties()['text']) == '3') {
        category19.click()
    }
}

WebUI.delay(2)

String wPci4 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String wardAvgPCI4 = wPci4.replaceAll("[^0-9]", "")

def wardPCI4 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('ward', '3')
println(wardPCI4)
println(wardPCI4)
WebUI.verifyMatch(wardPCI4.toString(), wardPCI4.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories20 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category20 : listCategories20) {
    if ((category20.getProperties()['text']) == '4') {
        category20.click()
    }
}

WebUI.delay(2)

String wPci5 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String wardAvgPCI5 = wPci5.replaceAll("[^0-9]", "")

def wardPCI5 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('ward', '4')
println(wardPCI5)
println(wardPCI5)
WebUI.verifyMatch(wardPCI5.toString(), wardPCI5.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories21 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category21 : listCategories21) {
    if ((category21.getProperties()['text']) == '5') {
        category21.click()
    }
}

WebUI.delay(2)

String wPci6 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String wardAvgPCI6 = wPci6.replaceAll("[^0-9]", "")

def wardPCI6 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('ward', '5')
println(wardPCI6)
println(wardPCI6)
WebUI.verifyMatch(wardPCI6.toString(), wardPCI6.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories22 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category22 : listCategories22) {
    if ((category22.getProperties()['text']) == '43') {
        category22.click()
    }
}

WebUI.delay(2)

String wPci7 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String wardAvgPCI7 = wPci7.replaceAll("[^0-9]", "")

def wardPCI7 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('ward', '43')
println(wardPCI7)
println(wardPCI7)
WebUI.verifyMatch(wardPCI7.toString(), wardPCI7.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories23 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category23 : listCategories23) {
    if ((category23.getProperties()['text']) == '50') {
        category23.click()
    }
}

WebUI.delay(2)

String wPci8 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String wardAvgPCI8 = wPci8.replaceAll("[^0-9]", "")

def wardPCI8 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('ward', '50')
println(wardPCI8)
println(wardPCI8)
WebUI.verifyMatch(wardPCI8.toString(), wardPCI8.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_Filter'))

List<WebElement> listLayers5 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def filter5 : listLayers5) {
    if ((filter5.getProperties()['text']) == 'Surface Type') {
        filter5.click()
    }
}

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_category'))

List<WebElement> listCategories24 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def category24 : listCategories24) {
    if ((category24.getProperties()['text']) == 'Asphalt') {
        category24.click()
    }
}

WebUI.delay(2)

String stPci1 = WebUI.getText(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 19'))

String surfaceTypeAvgPCI1 = stPci1.replaceAll("[^0-9]", "")

def surfaceTypePCI1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.getAveragePCIByFilter'('surface_type', 'Asphalt')
println(surfaceTypePCI1)
println(surfaceTypePCI1)
WebUI.verifyMatch(surfaceTypePCI1.toString(), surfaceTypePCI1.toString(), false)

WebUI.click(findTestObject('Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/div_Select_Filter'))

List<WebElement> listLayers6 = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/ul_Select_Filter'), 
    30)

for (def filter6 : listLayers6) {
    if ((filter6.getProperties()['text']) == 'No Filter') {
        filter6.click()
    }
}

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Budgeting/Budget Estimator/Budget_Estimator_verifyPCI/Page_Streetlogix/span_Current average condition index 73'))

