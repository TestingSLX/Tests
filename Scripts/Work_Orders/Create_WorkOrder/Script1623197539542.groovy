import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/div_Work Orders'))

WebUI.click(findTestObject('Work_Orders/Select_group/Page_Streetlogix/div_All groups'))

WebUI.click(findTestObject('Create_work_Order/Page_Streetlogix/li_FreshCode'))

WebUI.setText(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/input_Operations_MuiInputBase-input-852 Mui_49be15'), 
    'asphalt cost')

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/div_asphalt cost'))

WebUI.setText(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/input_Send Email Notification_mui-34955'), 
    'Shrutika Sawant')

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/li_Shrutika Sawant'))

WebUI.setText(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/input__mui-91742'), 'FOREST AVE')

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/li_FOREST AVE, Portland, ME, USAfromstreet _3ce67d'))

WebUI.click(findTestObject('Create_work_Order/Page_Streetlogix/div_Urgent'))

List<WebElement> list = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/ul_UrgentHighMediumLow'), 
    30)

List<WebElement> priorityList1 = new ArrayList()

def priorityList2 = ((['Urgent', 'High', 'Medium', 'Low']) as String[])

for (WebElement el : list) {
    priorityList1.add(el.getText())
}

if (priorityList1.equals(priorityList2)) {
    println('Priority')
} else {
    throw new Exception('Priorities list do not match')
}

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/li_High'))

WebUI.click(findTestObject('Create_work_Order/Page_Streetlogix/div_New'))

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/li_In Progress'))

//WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/button_Upload'))
WebUI.setText(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/input_Upload_asphalt(tons)'), '50')

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/button_Save'))

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/div_Success'))

WebUI.click(findTestObject('Object Repository/Create_work_Order/Page_Streetlogix/button_OK'))

WebUI.closeBrowser()

