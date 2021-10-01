import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.lang.Number

        Connection c = null;
		Statement stmt = null;
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/development_portal", "sde", "V0ters!23");
		def queryString = "SELECT * from sde.sidewalk_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double SCI = 0;
		double totalLength = 0;
		double sciLength = 0;
		double length = 0;
		double product = 0;
		while(result.next()) {
			SCI = result.getInt('sci')
			length = result.getInt('length_ft')
			sciLength = sciLength + SCI * length
			totalLength = totalLength + length
		}
		double avgSCI = sciLength / totalLength
		println( avgSCI)
		
		