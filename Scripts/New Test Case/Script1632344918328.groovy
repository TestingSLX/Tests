import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import groovy.json.JsonSlurper

Connection c = null
c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/development_portal", "sde", "V0ters!23");
def filter = 'ward'
def category = '0'
def queryString = "SELECT * from sde.pavement_evaluation_loc where " + filter + " = '" + category + "'"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double PCI = 0;
		double totalLength = 0;
		double pciLength = 0;
		double length = 0;
		double product = 0;
		while(result.next()) {
			PCI = result.getInt('pci')
			length = result.getInt('length_ft')
			pciLength = pciLength + PCI * length
			totalLength = totalLength + length
		}
		double avgPCI = pciLength / totalLength
		println(avgPCI.round())