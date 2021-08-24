package com.database_keywords.test

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.kms.katalon.core.annotation.Keyword

import groovy.json.JsonSlurper



public class Database_Keywords {

	Connection c = null;
	Statement stmt = null;

	@Keyword
	public void openConnection() {

		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/development_portal", "sde", "V0ters!23");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}

	@Keyword
	public void closeConnection(){
		c.close()
	}

	@Keyword
	public int getAveragePCI() {
		openConnection()
		def queryString = "SELECT pci from sde.pavement_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double rowCount = 0;
		double PCI = 0;
		while(result.next()) {
			rowCount += 1
			PCI = PCI + result.getInt('pci')
		}
		double avgPCI = PCI/rowCount
		return avgPCI.round()
		closeConnection()
	}

	@Keyword
	public int getPavementMiles() {
		openConnection()
		def queryString = "SELECT length_ft from sde.pavement_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double miles = 0;
		while(result.next()) {
			miles = miles + result.getInt('length_ft')
		}
		double totalMiles = miles/5280
		return totalMiles.round()
		closeConnection()
	}

	@Keyword
	public int getPavementBacklog() {
		openConnection()
		def queryString = "SELECT estimated_cost from sde.pavement_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double backlog = 0;
		while(result.next()) {
			backlog = backlog + result.getInt('estimated_cost')
		}
		double totalBacklog = backlog
		return totalBacklog.round()
		closeConnection()
	}

	@Keyword
	public int getAverageSCI() {
		openConnection()
		def queryString = "SELECT sci from sde.sidewalk_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double rowCount = 0;
		double SCI = 0;
		while(result.next()) {
			rowCount += 1
			SCI = SCI + result.getInt('sci')
		}
		double avgSCI = SCI/rowCount
		return avgSCI.round()
		closeConnection()
	}

	@Keyword
	public int getSidewalkMiles() {
		openConnection()
		def queryString = "SELECT length_ft from sde.sidewalk_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double miles = 0;
		while(result.next()) {
			miles = miles + result.getInt('length_ft')
		}
		double totalMiles = miles/5280
		return totalMiles.round()
		closeConnection()
	}

	@Keyword
	public int getSidewalkBacklog() {
		openConnection()
		def queryString = "SELECT estimated_cost from sde.sidewalk_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double backlog = 0;
		while(result.next()) {
			backlog = backlog + result.getInt('estimated_cost')
		}
		double totalBacklog = backlog
		return totalBacklog.round()
		closeConnection()
	}

	@Keyword
	def array() {
		openConnection()
		def queryString = "SELECT * from sde.pavement_evaluation_loc WHERE objectid = 25"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def woww = []

		while(result.next()) {
			for(int i=1; i <= 48 ; i++) {
				woww.add(result.getString(i))
			}
		}
		return woww
		closeConnection()
	}

	@Keyword
	def autoUpdate() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree ORDER BY id DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def maintenanceSuggestion = []
		def costs = []
		def pciBoundary = []
		def boundary = null
		list.each{
			def res = it.getAt('query')
			boundary = res.findAll(/\d{1,3}(?:\.\d{1,2})?/)
			pciBoundary.add(boundary)
			maintenanceSuggestion.add(it.getAt('ms'))
			costs.add(it.getAt('uc'))
		}

		def map = [maintenanceSuggestion, pciBoundary, costs].transpose()
		def pci = 85
		def val = null
		int min = 0
		int max = 0
		def item = null
		def cost = 0
		def array = []
		for(int i = 0; i < map.size(); i++) {
			item = map[i]
			val = item[1]
			min = Integer.parseInt(val[0])
			max = Integer.parseInt(val[1])
			if(pci > min && pci < max) {
				array.add(item[0])
				array.add(item[2])
			}
		}
		return array
		closeConnection()
	}

	@Keyword
	def decisionTreeMinMaxPCI() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree ORDER BY id DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def pciBoundary = []
		def boundary = null
		list.each{
			def res = it.getAt('query')
			boundary = res.findAll(/\d{1,3}(?:\.\d{1,2})?/)
			pciBoundary.add(boundary)
		}
		return pciBoundary
		closeConnection()
	}

	@Keyword
	def decisionTreeMaintenanceSuggestion() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree ORDER BY id DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def maintenanceSuggestion = []
		list.each{
			maintenanceSuggestion.add(it.getAt('ms'))
		}
		return maintenanceSuggestion
		closeConnection()
	}

	@Keyword
	def decisionTreeCost() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree ORDER BY id DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def cost = []
		list.each{
			cost.add(it.getAt('uc'))
		}
		return cost
		closeConnection()
	}

	@Keyword
	def decisionTreeMinMaxPCILoadNew() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree WHERE id = 76"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def pciBoundary = []
		def boundary = null
		list.each{
			def res = it.getAt('query')
			boundary = res.findAll(/\d{1,3}(?:\.\d{1,2})?/)
			pciBoundary.add(boundary)
		}
		return pciBoundary
		closeConnection()
	}

	@Keyword
	def decisionTreeMaintenanceSuggestionLoadNew() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree WHERE id = 76"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def maintenanceSuggestion = []
		list.each{
			maintenanceSuggestion.add(it.getAt('ms'))
		}
		return maintenanceSuggestion
		closeConnection()
	}

	@Keyword
	def decisionTreeCostLoadNew() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree WHERE id = 76"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def cost = []
		list.each{
			cost.add(it.getAt('uc'))
		}
		return cost
		closeConnection()
	}

	@Keyword
	def repairImpactMaintenanceSuggestion() {
		openConnection()
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
		def maintenanceSuggestion = []
		list.each{
			maintenanceSuggestion.add(it.getKey())
		}
		return maintenanceSuggestion
		closeConnection()
	}

	@Keyword
	def repairImpactValues() {
		openConnection()
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
		def impact = []
		def impactValues =[]
		def x =[]
		list.each{
			x = it.getValue()
			for(int i=0; i< x.size(); i++) {
				impact.add(x[i].getAt('impact'))
			}
			impactValues.add(impact)
			impact = []
		}
		return impactValues
		closeConnection()
	}

	@Keyword
	def repairImpactBoundaries() {
		openConnection()
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
			for(int i=0; i< x.size(); i++) {
				pci.add(x[i].getAt('boundary'))
			}
			pciBoundary.add(pci)
			pci = []
		}
		return pciBoundary
		closeConnection()
	}
	
	@Keyword
	def repairImpactAttributeEditorValidation(def pci) {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree ORDER BY id DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def maintenanceSuggestion = []
		def costs = []
		def pciBoundary = []
		def boundary = null
		list.each{
			def res = it.getAt('query')
			boundary = res.findAll(/\d{1,3}(?:\.\d{1,2})?/)
			pciBoundary.add(boundary)
			maintenanceSuggestion.add(it.getAt('ms'))
			costs.add(it.getAt('uc'))
		}

		def map = [maintenanceSuggestion, pciBoundary, costs].transpose()
		def val = null
		int min = 0
		int max = 0
		def item = null
		def cost = 0
		def array = []
		for(int i = 0; i < map.size(); i++) {
			item = map[i]
			val = item[1]
			min = Integer.parseInt(val[0])
			max = Integer.parseInt(val[1])
			if(pci > min && pci <= max) {
				array.add(item[0])
				array.add(item[1])
				array.add(item[2])
			}
		}
		return array
		closeConnection()
	}
	
}
