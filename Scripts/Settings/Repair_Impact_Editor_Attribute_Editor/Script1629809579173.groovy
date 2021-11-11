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

def PCI = []

def pciBoundaries = []

PCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.repairImpactBoundaries'()

pciBoundaries = (PCI[0])

def impact = []

def impactValues = []

impact = CustomKeywords.'com.database_keywords.test.Database_Keywords.repairImpactValues'()

impactValues = (impact[0])

pciBoundaries1 = (PCI[1])

impactValues1 = (impact[1])

pciBoundaries2 = (PCI[2])

impactValues2 = (impact[2])

pciBoundaries3 = (PCI[3])

impactValues3 = (impact[3])

pciBoundaries4 = (PCI[4])

impactValues4 = (impact[4])

def pciDB = []

pciDB = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMinMaxPCI'()

def msDB = []

msDB = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeMaintenanceSuggestion'()

def costDB = []

costDB = CustomKeywords.'com.database_keywords.test.Database_Keywords.decisionTreeCost'()

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/div_Editing'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/div_Attribute Editor'))

WebUI.click(findTestObject('Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/div_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/label_Select layer'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/h1_Attribute Editor'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/label_Select feature by street name'))

WebUI.setText(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name'), 
    'ADELAIDE ST')

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name'), 
    Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Editing/Attribute_Editor_Restore_Edit/Page_Streetlogix/input_Select feature by street name'), 
    Keys.chord(Keys.ENTER))

String length = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__length_ft'), 'value')

String width = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__width_ft'), 'value')

String initialPCI = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input_Auto-update_pci'), 'value')

def repairImpactAutoUpdate = CustomKeywords.'com.database_keywords.test.Database_Keywords.repairImpactAttributeEditorValidation'(initialPCI.toInteger())

def index = null

String updatedPCI = null

def min, max, val = null
for(i = 0; i < 4 ; i++) {
	val = pciBoundaries[i]
	min = val[0] as Integer
	max = val[1] as Integer
	if(initialPCI.toInteger() > min && initialPCI.toInteger() <= max) {
		index = i
	}
}

String initialMaintenanceSuggestion = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Maintenance_Suggestion'), 'value')

String initialEstimatedCost = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__estimated_cost'), 'value')

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/span_Auto-update'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Last_Repair_Method'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/li_Preventive Maintenance'))

String newPCI1 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input_Auto-update_pci'), 'value')

def calculatePCI1 = null

calculatePCI1 = initialPCI.toInteger() + impactValues[index]
println(calculatePCI1 )
println(newPCI1)
if(calculatePCI1.toInteger() > 100) {
	newPCI1.toInteger() == 100
	println('PCI updated and maximised to 100')
} else if (calculatePCI1 < 100) {
	if(newPCI1.toInteger() == initialPCI.toInteger() + impactValues[index]) {
		println('PCI autoupdated')
	} else {
		throw new Exception('PCI is not autoupdated')
	}
} 

String newMaintenanceSuggestion1 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Maintenance_Suggestion'), 'value')

def updatedRepairImpactAutoUpdate1 = CustomKeywords.'com.database_keywords.test.Database_Keywords.repairImpactAttributeEditorValidation'(newPCI1.toInteger())

if(updatedRepairImpactAutoUpdate1 == []) {
	if(newMaintenanceSuggestion1 == initialMaintenanceSuggestion) {
		println('Maintenance is and should be same')
	} else {
		throw new Exception('Maintenance suggestion should be same but it is updated')
	}
} else if(updatedRepairImpactAutoUpdate1 != []){
	if(newMaintenanceSuggestion1 == updatedRepairImpactAutoUpdate1[0]){
		println('Maintenance Suggestion Auto updated')
	} else {
		throw new Exception('Maintenance Suggestion is not Auto updated')
	}
} else {
	throw new Exception('Should be empty but it gives result')
}

String newEstimatedCost1 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__estimated_cost'), 'value')

if(updatedRepairImpactAutoUpdate1 == []) {
	if(newEstimatedCost1 == initialEstimatedCost) {
		println('Estimated cost is and should be same')
	} else {
		throw new Exception('Estimated cost should be same but it is updated')
	}
} else if(updatedRepairImpactAutoUpdate1 != []) {
	double cost1 = Integer.parseInt(length)*Integer.parseInt(width)*0.111
	
	int estimate1 = cost1.round()
	
	double finalEstimatedCost1 = estimate1 * Double.parseDouble(updatedRepairImpactAutoUpdate1[2])
	
	double estimatedCost1 = newEstimatedCost1.toDouble()
	println(estimatedCost1)
	println(finalEstimatedCost1)
	WebUI.verifyMatch(estimatedCost1.toString(), finalEstimatedCost1.toString(), false)
	println('Estimated Cost is auto updated')
}

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/button_Reset'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/span_Auto-update'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Last_Repair_Method'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/li_Reclamation'))

String newPCI2 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input_Auto-update_pci'), 'value')

def index1 = null

def min1, max1, val1 = null
for(i = 0; i < 4 ; i++) {
	val1 = pciBoundaries[i]
	min1 = val1[0] as Integer
	max1 = val1[1] as Integer
	if(initialPCI.toInteger() > min1 && initialPCI.toInteger() <= max1) {
		index1 = i
	}
}

def calculatePCI2 = null

calculatePCI2 = initialPCI.toInteger() + impactValues1[index1]
println(calculatePCI2)
println(newPCI2)
if(calculatePCI2.toInteger() > 100) {
	newPCI2.toInteger() == 100
	println('PCI updated and maximised to 100')
} else if (calculatePCI2.toInteger() < 100) {
	if(newPCI2.toInteger() == initialPCI.toInteger() + impactValues1[index1]) {
		println('PCI autoupdated')
	} else {
		throw new Exception('PCI is not autoupdated')
	}
}

String newMaintenanceSuggestion2 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Maintenance_Suggestion'), 'value')

def updatedRepairImpactAutoUpdate2 = CustomKeywords.'com.database_keywords.test.Database_Keywords.repairImpactAttributeEditorValidation'(newPCI2.toInteger())

if(updatedRepairImpactAutoUpdate2 == []) {
	if(newMaintenanceSuggestion2 == initialMaintenanceSuggestion) {
		println('Maintenance is and should be same')
	} else {
		throw new Exception('Maintenance suggestion should be same but it is updated')
	}
} else if(updatedRepairImpactAutoUpdate2 != []){
	if(newMaintenanceSuggestion2 == updatedRepairImpactAutoUpdate2[0]){
		println('Maintenance Suggestion Auto updated')
	} else {
		throw new Exception('Maintenance Suggestion is not Auto updated')
	}
} else {
	throw new Exception('Should be empty but it gives result')
}

String newEstimatedCost2 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__estimated_cost'), 'value')

if(updatedRepairImpactAutoUpdate2 == []) {
	if(newEstimatedCost2 == initialEstimatedCost) {
		println('Estimated cost is and should be same')
	} else {
		throw new Exception('Estimated cost should be same but it is updated')
	}
} else if(updatedRepairImpactAutoUpdate2 != []) {
	double cost2 = Integer.parseInt(length)*Integer.parseInt(width)*0.111
	
	int estimate2 = cost2.round()
	
	double finalEstimatedCost2 = estimate2 * Double.parseDouble(updatedRepairImpactAutoUpdate2[2])
	
	double estimatedCost2 = newEstimatedCost2.toDouble()
	println(estimatedCost2)
	println(finalEstimatedCost2)
	WebUI.verifyMatch(estimatedCost2.toString(), finalEstimatedCost2.toString(), false)	
	println('Estimated Cost is auto updated')
}

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/button_Reset'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/span_Auto-update'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Last_Repair_Method'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/li_Rehabilitation'))

String newPCI3 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input_Auto-update_pci'), 'value')

def index2 = null

def min2, max2, val2 = null
for(i = 0; i < 4 ; i++) {
	val2 = pciBoundaries[i]
	min2 = val2[0] as Integer
	max2 = val2[1] as Integer
	if(initialPCI.toInteger() > min2 && initialPCI.toInteger() <= max2) {
		index2 = i
	}
}

def calculatePCI3 = null

calculatePCI3 = initialPCI.toInteger() + impactValues2[index2]
println(calculatePCI3)
println(newPCI3)
if(calculatePCI3.toInteger() > 100) {
	newPCI3.toInteger() == 100
	println('PCI updated and maximised to 100')
} else if (calculatePCI3.toInteger() < 100) {
	if(newPCI3.toInteger() == initialPCI.toInteger() + impactValues2[index2]) {
		println('PCI autoupdated')
	} else {
		throw new Exception('PCI is not autoupdated')
	}
}

String newMaintenanceSuggestion3 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Maintenance_Suggestion'), 'value')

def updatedRepairImpactAutoUpdate3 = CustomKeywords.'com.database_keywords.test.Database_Keywords.repairImpactAttributeEditorValidation'(newPCI3.toInteger())

if(updatedRepairImpactAutoUpdate3 == []) {
	if(newMaintenanceSuggestion3 == initialMaintenanceSuggestion) {
		println('Maintenance is and should be same')
	} else {
		throw new Exception('Maintenance suggestion should be same but it is updated')
	}
} else if(updatedRepairImpactAutoUpdate3 != []){
	if(newMaintenanceSuggestion3 == updatedRepairImpactAutoUpdate3[0]){
		println('Maintenance Suggestion Auto updated')
	} else {
		throw new Exception('Maintenance Suggestion is not Auto updated')
	}
} else {
	throw new Exception('Should be empty but it gives result')
}

String newEstimatedCost3 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__estimated_cost'), 'value')

if(updatedRepairImpactAutoUpdate3 == []) {
	if(newEstimatedCost3 == initialEstimatedCost) {
		println('Estimated cost is and should be same')
	} else {
		throw new Exception('Estimated cost should be same but it is updated')
	}
} else if(updatedRepairImpactAutoUpdate3 != []) {
	double cost3 = Integer.parseInt(length)*Integer.parseInt(width)*0.111
	
	int estimate3 = cost3.round()
	
	double finalEstimatedCost3 = estimate3 * Double.parseDouble(updatedRepairImpactAutoUpdate3[2])
	
	double estimatedCost3 = newEstimatedCost3.toDouble()
	println(estimatedCost3)
	println(finalEstimatedCost3)
	WebUI.verifyMatch(estimatedCost3.toString(), finalEstimatedCost3.toString(), false)
	println('Estimated Cost is auto updated')
}

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/button_Reset'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/span_Auto-update'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Last_Repair_Method'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/li_Extensive Patching'))

String newPCI4 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input_Auto-update_pci'), 'value')

def index3 = null

def min3, max3, val3 = null
for(i = 0; i < 4 ; i++) {
	val3 = pciBoundaries[i]
	min3 = val3[0] as Integer
	max3 = val3[1] as Integer
	if(initialPCI.toInteger() > min3 && initialPCI.toInteger() <= max3) {
		index3 = i
	}
}

def calculatePCI4 = null

calculatePCI4 = initialPCI.toInteger() + impactValues3[index3]
println(calculatePCI4)
println(newPCI4)
if(calculatePCI4.toInteger() > 100) {
	newPCI4.toInteger() == 100
	println('PCI updated and maximised to 100')
} else if (calculatePCI4.toInteger() < 100) {
	if(newPCI4.toInteger() == initialPCI.toInteger() + impactValues3[index3]) {
		println('PCI autoupdated')
	} else {
		throw new Exception('PCI is not autoupdated')
	}
}

String newMaintenanceSuggestion4 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Maintenance_Suggestion'), 'value')

def updatedRepairImpactAutoUpdate4 = CustomKeywords.'com.database_keywords.test.Database_Keywords.repairImpactAttributeEditorValidation'(newPCI4.toInteger())

if(updatedRepairImpactAutoUpdate4 == []) {
	if(newMaintenanceSuggestion4 == initialMaintenanceSuggestion) {
		println('Maintenance is and should be same')
	} else {
		throw new Exception('Maintenance suggestion should be same but it is updated')
	}
} else if(updatedRepairImpactAutoUpdate4 != []){
	if(newMaintenanceSuggestion4 == updatedRepairImpactAutoUpdate4[0]){
		println('Maintenance Suggestion Auto updated')
	} else {
		throw new Exception('Maintenance Suggestion is not Auto updated')
	}
} else {
	throw new Exception('Should be empty but it gives result')
}

String newEstimatedCost4 = WebUI.getAttribute(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__estimated_cost'), 'value')

if(updatedRepairImpactAutoUpdate4 == []) {
	if(newEstimatedCost4 == initialEstimatedCost) {
		println('Estimated cost is and should be same')
	} else {
		throw new Exception('Estimated cost should be same but it is updated')
	}
} else if(updatedRepairImpactAutoUpdate4 != []) {
	double cost4 = Integer.parseInt(length)*Integer.parseInt(width)*0.111
	
	int estimate4 = cost4.round()
	
	double finalEstimatedCost4 = estimate4 * Double.parseDouble(updatedRepairImpactAutoUpdate4[2])
	
	double estimatedCost4 = newEstimatedCost4.toDouble()
	println(estimatedCost4)
	println(finalEstimatedCost4)
	WebUI.verifyMatch(estimatedCost4.toString(), finalEstimatedCost4.toString(), false)
	println('Estimated Cost is auto updated')
}

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/button_Reset'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/span_Auto-update'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Last_Repair_Method'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/li_Defer 1'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input_Auto-update_pci'))

WebUI.getText(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__Maintenance_Suggestion'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/input__estimated_cost'))

WebUI.click(findTestObject('Object Repository/Settings/Repair_Impact_Editor_Validation/Page_Streetlogix/button_Reset'))

