import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import org.openqa.selenium.WebElement

Connection c = null;
Statement stmt = null;

c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
def queryString = "SELECT * FROM sde.work_order_loc ORDER BY objectid DESC LIMIT 1"
Statement stm = c.createStatement()
ResultSet result = stm.executeQuery(queryString)
def items = []
while(result.next()) {
		items.add(result.getString('videos'))
}

println(items[0].toString())
if(items[0].toString() == "[]") {
	println("Not uploaded")
} else if(items[0].toString() != "[]") {
	println("Uploaded")
}