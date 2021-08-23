import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import groovy.json.JsonSlurper

Connection c = null;
Statement stmt = null;

//c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
//def queryString = "SELECT * FROM sde.repair_impact WHERE id = 82"
//Statement stm = c.createStatement()
//ResultSet result = stm.executeQuery(queryString)
//
//def decisionTree = null
//def list = null
//while(result.next()){
//	decisionTree = result.getString('impact')
//	list = new JsonSlurper().parseText(decisionTree )
//}
//def maintenanceSuggestion = null
//def MS = []
//def impact = []
//def pciBoundary = []
//def PCIRange = []
//def impactValue = []
//def boundary = null
//def x = []
//list.each{
//	maintenanceSuggestion = it.getKey()
//	x = it.getValue()
//	for(i=0; i< x.size(); i++) {
//		pciBoundary.add(x[i].getAt('boundary'))
//		impact.add(x[i].getAt('impact'))
//	}
//	PCIRange.add(pciBoundary)
//	impactValue.add(impact)
//	MS.add(maintenanceSuggestion)
//	pciBoundary = []
//	impact = []
//}
//
//def map = [MS, PCIRange, impactValue].transpose()
//println(map)
//for(int i = 0; i < map.size(); i++) {
//	println(map[i])
//}

c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.repair_impact WHERE id = 82"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		
		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('impact')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def pci = []
		def pciBoundary =[]
		def x =[]
		list.each{
			x = it.getValue()
			for(i=0; i< x.size(); i++) {
				pci.add(x[i].getAt('boundary'))
			}
			pciBoundary.add(pci)
			pci = []
		}

println(pciBoundary)










