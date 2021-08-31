import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import groovy.json.JsonSlurper


Connection c = null;
Statement stmt = null;

c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
def queryString = "SELECT * FROM sde.work_order_groups WHERE url_id = 96"
Statement stm = c.createStatement()
ResultSet result = stm.executeQuery(queryString)
def forms = []
while(result.next()) {
		forms.add(result.getString('group_name'))
}
println(forms)