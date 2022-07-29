package wetclean;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Baglanti {
	
	static Connection myConn;
	static Statement myStat;
	
	static ResultSet yap() {
		ResultSet myRs = null;
		try {
			
			myConn = (Connection )DriverManager.getConnection("jdbc:mysql://localhost:3306/wetclean?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from musteriler");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return myRs;
		
	}
	static void ekle(String sql_sorgu) {
		
		try {
			myStat.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void sil(String sql_sorgu) {
		try {
			myStat.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void guncelle(String sql_sorgu) {
		try {
			myStat.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


