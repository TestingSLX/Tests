import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8081/?config=9c338e84e55940e4ba48a09e9f5aef32&url=https://streetlogix-dev-server.herokuapp.com&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAyNiwibmFtZSI6IlNocnV0aWthIFNhd2FudCIsImV4cCI6MTYyNTY2NDU3NiwiaWF0IjoxNjIzMDcyNTc2fQ.vEFh0PAIs6ZT0JQnknJ_XJleZWCSWMvOzTGa6L5F4k0')

WebUI.click(findTestObject('Object Repository/Work_Orders/Select_group/Page_Streetlogix/div_Work Orders'))

WebUI.click(findTestObject('Work_Orders/Select_group/Page_Streetlogix/div_All groups'))

WebUI.verifyElementPresent(findTestObject('Work_Orders/Select_group/Page_Streetlogix/li_All groups'), 0)

WebUI.verifyElementPresent(findTestObject('Work_Orders/Select_group/Page_Streetlogix/li_Operations'), 0)

WebUI.verifyElementPresent(findTestObject('Work_Orders/Select_group/Page_Streetlogix/li_Roads and Highways'), 0)

WebUI.verifyElementPresent(findTestObject('Work_Orders/Select_group/Page_Streetlogix/li_water group'), 0)

WebUI.click(findTestObject('Object Repository/Work_Orders/Select_group/Page_Streetlogix/div_Bridge Maintenance'))

WebUI.click(findTestObject('Object Repository/Work_Orders/Select_group/Page_Streetlogix/span_Cancel'))

