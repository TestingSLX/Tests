import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

Connection c = null;
Statement stmt = null;


	try {
		Class.forName("org.postgresql.Driver");
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/development_portal", "sde", "V0ters!23");
	} catch (Exception e) {
		e.printStackTrace();
		System.err.println(e.getClass().getName()+": "+e.getMessage());
		System.exit(0);
	}
	System.out.println("Opened database successfully");

def queryString = "SELECT * from sde.pavement_evaluation_loc WHERE ss_id = 385 AND streetname = 'ABBY LN'"
Statement stm = c.createStatement()
ResultSet result = stm.executeQuery(queryString)
def woww = []

while(result.next()) {
	for(i=1; i < 48 ; i++) {
		woww.add(result.getString(i))
	}
	break;
}
println(woww)
