import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

Connection c = null;
Statement stmt = null;
	
try {
   Class.forName("org.postgresql.Driver");
   c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/development_portal", "sde", "V0ters!23");
} catch (Exception e) {
   e.printStackTrace();
   System.err.println(e.getClass().getName()+": "+e.getMessage());
   System.exit(0);
}
System.out.println("Opened database successfully");

def queryString = "SELECT length_ft from sde.pavement_evaluation_loc"
Statement stm = c.createStatement()
ResultSet result = stm.executeQuery(queryString)
double rowCount = 0;
double PCI = 0;
while(result.next()) {
	rowCount += 1
	PCI = PCI + result.getInt('length_ft')
}
double avgPCI = PCI/5280
println(avgPCI.round())


