import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.lang.Number

        Connection c = null;
		Statement stmt = null;
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_loc ORDER BY objectid DESC LIMIT 4"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def objectid = []
		while(result.next()) {
			objectid.add(result.getString('objectid'))
		}
		
		Connection c1 = null;
		Statement stmt1 = null;
		c1 = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def images = []
		for(int i=0; i< objectid.size(); i++) {
			def queryString1 = "SELECT * FROM sde.work_order_loc WHERE objectid = " + objectid[i]
			Statement stm1 = c1.createStatement()
			ResultSet result1 = stm1.executeQuery(queryString1)
			
			while(result1.next()) {
				images.add(result1.getString('image'))
			}
		}
		
		for(i=0; i< images.size(); i++) {
			if(images[i].toString() == "[]" || images[i].toString() == "null") {
				throw new Exception("Image is not stored in database")
			} else if(images[i].toString() != "[]" || images[i].toString() != "null") {
				println("Image is stored in database")
			}
		}

		
		
		

		
		
		
		