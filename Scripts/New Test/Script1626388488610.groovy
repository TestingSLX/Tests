import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import groovy.json.JsonSlurper

def updatedRepairImpactAutoUpdate = CustomKeywords.'com.database_keywords.test.Database_Keywords.repairImpactAttributeEditorValidation'(100)

println(updatedRepairImpactAutoUpdate)
