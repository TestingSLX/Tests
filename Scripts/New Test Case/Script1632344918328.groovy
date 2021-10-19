import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import groovy.json.JsonSlurper

Connection c = null
c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/development_portal", "sde", "V0ters!23");
def queryString = "SELECT * from sde.pavement_evaluation_loc WHERE objectid = 12"
Statement stm = c.createStatement()
ResultSet result = stm.executeQuery(queryString)
def woww = 0

while(result.next()) {
	woww = result.getString('last_edit')
}
println(woww)