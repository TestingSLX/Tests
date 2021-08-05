import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    'Select layer:')

WebUI.verifyElementText(findTestObject('null'), 
    'Filter by:')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    'Program duration:')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    'Annual budget:')

String budget1 = '123456789'

int budget = 123456789

WebUI.setText(findTestObject('null'), 
    budget1)

WebUI.verifyElementText(findTestObject('null'), 
    'Scenario name:')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'T')

WebUI.setText(findTestObject('null'), 
    'Te')

WebUI.setText(findTestObject('null'), 
    'Tes')

WebUI.setText(findTestObject('null'), 
    'Test')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 'Year')

WebUI.verifyElementText(findTestObject('null'), 
    'Length (ft)')

WebUI.verifyElementText(findTestObject('null'), 'Cost')

WebUI.verifyElementText(findTestObject('null'), 
    'Average Condition Index')

WebUI.verifyElementText(findTestObject('null'), 
    'Condition Index Change')

WebUI.verifyElementText(findTestObject('null'), '1')

WebUI.click(findTestObject('null'))

String estimatedCost = WebUI.getText(findTestObject('null'))

int cost = estimatedCost.replaceAll('[^0-9]', '').toInteger()

if ((budget > cost) && (cost > 100000000)) {
    println('Estimated Cost is correct')
} else {
    throw new Exception('Estimated cost difference is more')
}

String avgCI = WebUI.getText(findTestObject('null'))

String totalCI = WebUI.getText(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.scrollToElement(findTestObject('null'), 10)

List<WebElement> formnameAddress = WebUiCommonHelper.findWebElements(findTestObject('null'), 30)

		int value = 0
		int count = 0
        for (def formname : formnameAddress) {
            String fname = formname.getProperties()['text']
//			count = count + 1
            value = value + fname.toInteger()
        }
		println(value)




