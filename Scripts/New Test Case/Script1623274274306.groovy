import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/PE_layer'))

WebUI.click(findTestObject('Object Repository/PM_layer'))

WebUI.click(findTestObject('Object Repository/table'))

String value = WebUI.getText(findTestObject('Object Repository/testtt'))

println(value)