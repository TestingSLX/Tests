import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import groovy.json.JsonSlurper

String length = "499"
String width = "60"

double cost = Integer.parseInt(length)*Integer.parseInt(width)*0.111

int estimate = cost.round()

int finalEstimatedCost = estimate * 25

println(finalEstimatedCost)









