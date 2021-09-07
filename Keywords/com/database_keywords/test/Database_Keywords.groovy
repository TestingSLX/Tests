package com.database_keywords.test

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

	@Keyword
	def getGroups() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_groups WHERE url_id = 96"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def forms = []
		while(result.next()) {
			forms.add(result.getString('group_name'))
		}
		return forms
		closeConnection()
	}

	@Keyword
	def getForms(def formName) {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString2 = "SELECT * FROM sde.work_order_groups WHERE url_id = 96 and group_name = '" + formName + "'"
		Statement stm2 = c.createStatement()
		ResultSet result2 = stm2.executeQuery(queryString2)
		def groupid = 0
		while(result2.next()) {
			groupid = result2.getString('id')
		}

		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.group_forms WHERE group_id =" + groupid
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def formid = []
		while(result.next()) {
			formid.add(result.getString('form_id'))
		}

		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def formname = []
		for(int i = 0; i < formid.size(); i++) {
			def queryString1 = ("SELECT * FROM sde.work_order_form_library WHERE id =" + formid[i])
			Statement stm1 = c.createStatement()
			ResultSet result1 = stm1.executeQuery(queryString1)

			while(result1.next()) {
				formname.add(result1.getString('form_name'))
			}
		}
		return formname
		closeConnection()
	}

	@Keyword
	def getAllForms() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_form_library WHERE url_id = 96"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def forms = []
		while(result.next()) {
			forms.add(result.getString('form_name'))
		}
		return forms
		closeConnection()
	}

	@Keyword
	def uploadFile (TestObject to, String filePath) {
		WebUI.click(to)
		StringSelection ss = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000)
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(2000)
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000)
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(2000)
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000)
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000)
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000)
	}

	@Keyword
	def getWorkOrdersCount() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def count = 0
		while(result.next()) {
			count += 1
		}
		return count
		closeConnection()
	}

	@Keyword
	def verifyAttachmentsUploaded() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_loc ORDER BY objectid DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def items = []
		while(result.next()) {
			items.add(result.getString('image'))
		}
		def status = ""
		if(items[0].toString() == "[]" || items[0].toString() == "null") {
			status = 'Not Uploaded'
		} else if(items[0].toString() != "[]" || items[0].toString() != "null") {
			status = 'Uploaded'
		}
		return status
		closeConnection()
	}
}
