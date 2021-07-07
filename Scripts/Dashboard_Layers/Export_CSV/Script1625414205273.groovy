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

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement Maintenance'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Pavement Maintenance (Features 1,462_cbfabd'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV Pavement Maintenence'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile.name)

String pavementMaintenance = theNewestFile.name

if(pavementMaintenance.contains("Pavement Maintenance")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement Maintenance'))	
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Sidewalk Maintenance'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Sidewalk Maintenance (Features 1,455_fcce9b'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV Sidewalk Maintenance'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile2 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile2.name)

String sidewalkMaintenance = theNewestFile2.name

if(sidewalkMaintenance.contains("Sidewalk Maintenance")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Sidewalk Maintenance'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Sign Maintenance'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Sign Maintenance (Features 21,845, S_095b4d'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV Sign Maintenance'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile3 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile3.name)

String signMaintenance = theNewestFile3.name

if(signMaintenance.contains("Sign Maintenance")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Sign Maintenance'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Decrease opacity_esri-layer-list__chil_0d6485'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Pavement Evaluation - Pavement Condi_a36ff1'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV PavementEvaluation CI'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile4 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile4.name)

String pavementEvaluationPCI = theNewestFile4.name

if(pavementEvaluationPCI.contains("Pavement Evaluation - Pavement Condition Index")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement Condition Index'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement Distress'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Pavement Evaluation - Pavement Distr_23e04c'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV PavementEvaluation PD'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Decrease opacity_esri-layer-list__chil_0d6485'))

WebUI.delay(10)

File theNewestFile5 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile5.name)

String pavementEvaluationPD = theNewestFile5.name

if(pavementEvaluationPD.contains("Pavement Evaluation - Pavement Distress")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement Evaluation'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Sidewalk Evaluation'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/expand_Sidewalk Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Sidewalk Evaluation (Features 1,455,_c6e380'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV SidewalkEvaluation SCI'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile6 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile6.name)

String sidewalkEvaluationSCI = theNewestFile6.name

if(sidewalkEvaluationSCI.contains("Sidewalk Evaluation")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Sidewalk Condition Index'))
} else {
	println("File not downloaded")
}


WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Ramp Evaluation'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Sidewalk Evaluation - Ramp Evaluatio_7fa984'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV SidewalkEvaluation RE'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/expand_Sidewalk Evaluation'))

WebUI.delay(10)

File theNewestFile7 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile7.name)

String sidewalkEvaluationRE = theNewestFile7.name

if(sidewalkEvaluationRE.contains("Sidewalk Evaluation - Ramp Evaluation")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Sidewalk Evaluation'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Sign Types'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Street Sign (Features 21,847, Select_6d83a6'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV SignTypes SS'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile8 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile8.name)

String signTypes = theNewestFile8.name

if(signTypes.contains("Street Sign")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Sign Types'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Media'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/expand_Media'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Media - Pavement SurfaceView (Featur_4c3231'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV Media PS'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile9 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile9.name)

String mediaPS = theNewestFile9.name

if(mediaPS.contains("Media - Pavement SurfaceView")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement SurfaceView'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement FrontView'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Media - Pavement FrontView (Features_6f8b57'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV Media PF'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile10 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile10.name)

String mediaPF = theNewestFile10.name

if(mediaPF.contains("Media - Pavement FrontView")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement FrontView'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement Movie'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Media - Pavement Movie (Features 1,1_034afa'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV Media PM'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile11 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile11.name)

String mediaPM = theNewestFile11.name

if(mediaPM.contains("Media - Pavement Movie")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pavement Movie'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Pano'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Media - Pano (Features 320,665, Sele_0d33d7'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV Media Pano'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/expand_Media'))

WebUI.delay(10)

File theNewestFile12 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({ 
        -(it.lastModified())
    }).head()

println(theNewestFile12.name)

String mediaPano = theNewestFile12.name

if(mediaPano.contains("Media - Pano")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Media'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Other Assets'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/expand_OtherAssests'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Manholes and Utility Covers'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Other Assets - Manholes and Utility _ac36d0'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV OtherAssets MUC'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile13 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(theNewestFile13.name)

String assetsMUC = theNewestFile13.name

if(assetsMUC.contains("Other Assets - Manholes and Utility Covers")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Manholes and Utility Covers'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_PavementMarkings'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Other Assets - PavementMarkings (Fea_743376'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV OtherAssets PM'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile14 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(theNewestFile14.name)

String assetsPM = theNewestFile14.name

if(assetsPM.contains("Other Assets - PavementMarkings")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_PavementMarkings'))
} else {
	println("File not downloaded")
}

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/span_PavementMarkings Lines'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/button_Other Assets - PavementMarkings Line_ef9b49'))

WebUI.click(findTestObject('DashBoard_Layers/Export_CSV/Page_Streetlogix/span_Export to CSV OtherAssets PML'))

WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

WebUI.delay(10)

File theNewestFile15 = new File('C:\\Users\\shrut\\Downloads').listFiles().sort({
		-(it.lastModified())
	}).head()

println(theNewestFile15.name)

String assetsPML = theNewestFile15.name

if(assetsPML.contains("Other Assets - PavementMarkings Lines")) {
	WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Export_CSV/Page_Streetlogix/expand_OtherAssests'))
} else {
	println("File not downloaded")
}








