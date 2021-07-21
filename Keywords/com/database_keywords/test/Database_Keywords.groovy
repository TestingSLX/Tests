package com.database_keywords.test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import internal.GlobalVariable

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
}
