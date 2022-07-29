package wetclean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class nosayici {
   public static int musterino() throws Exception {
      //Registering the Driver
      //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost/wetclean?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
      //Creating a Statement object
      Statement stmt = con.createStatement();
      //Retrieving the data
      ResultSet rs = stmt.executeQuery("select * from musteriler");
      //Moving the cursor to the last row
      rs.last();
      //System.out.println(rs.getRow());
      return rs.getRow()+1;
   }
   
 
	
   
   public static ResultSet sorgu() throws Exception {
	      //Registering the Driver
	      //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	      //Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost/wetclean?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
	      //Creating a Statement object
	      Statement stmt = con.createStatement();
	      //Retrieving the data
	      ResultSet rs = stmt.executeQuery("select * from musteriler where no=1");
	      System.out.println(rs);
	      //Moving the cursor to the last row
	      return rs;
	      //System.out.println(rs.getRow());
	      
	   }
   public static void main(String[]args) throws Exception {
	   
   }
}