import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import groovy.json.JsonSlurper

def min =[]
def max =[]

def minID = CustomKeywords.'com.database_keywords.test.Database_Keywords.getMinimumFunctionalCLassID'()
min.add(minID)

def maxID = CustomKeywords.'com.database_keywords.test.Database_Keywords.getMaximumFunctionalCLassID'()
max.add(maxID)

def minPCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getMinimumPCI'()
min.add(minPCI)

def maxPCI = CustomKeywords.'com.database_keywords.test.Database_Keywords.getMaximumPCI'()
max.add(maxPCI)

println(min)
println(max)

def weight = [4,-3]
def factors = [7, 80]
def newRp = 0
for(i=0; i< weight.size(); i++) {
	if (weight[i] > 0) {
		newRp += Math.abs((((factors[i] - min[i]) / (max[i] - min[i])) * weight[i]) / 7);
	} else {
		newRp += Math.abs(((1 - (factors[i] - min[i]) / (max[i] - min[i])) * weight[i]) / 7);
	}
}

println(newRp*100)

