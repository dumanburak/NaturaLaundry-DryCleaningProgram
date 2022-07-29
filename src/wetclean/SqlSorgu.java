package wetclean; // YENÝ SÝPARÝS FRAME'Ý ÝÇÝN 

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlSorgu {
	
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
	static ResultSet mustericari() {
		ResultSet myRs = null;
		try {
			
			myConn = (Connection )DriverManager.getConnection("jdbc:mysql://localhost:3306/wetclean?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from mustericari");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return myRs;
		
	}
	
	static ResultSet bakiye() {
		ResultSet myRs = null;
		try {
			
			myConn = (Connection )DriverManager.getConnection("jdbc:mysql://localhost:3306/wetclean?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from bakiye");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return myRs;
		
	}
	static ResultSet ürünler() {
		ResultSet myRs = null;
		try {
			
			myConn = (Connection )DriverManager.getConnection("jdbc:mysql://localhost:3306/wetclean?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from ürünler");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return myRs;
		
	}
	static ResultSet toplamkazanc() {
		ResultSet myRs = null;
		try {
			
			myConn = (Connection )DriverManager.getConnection("jdbc:mysql://localhost:3306/wetclean?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from toplamkazanc");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return myRs;
		
	}
	
	static ResultSet siparisdurumu() {
		ResultSet myRs = null;
		try {
			
			myConn = (Connection )DriverManager.getConnection("jdbc:mysql://localhost:3306/wetclean?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
			myStat = (Statement) myConn.createStatement();
			myRs = myStat.executeQuery("select * from siparisdurumu");
			
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
	
	static void guncelle(String sql_sorgu) {
		try {
			myStat.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static ResultSet sorgula(String sql_sorgu) {
		ResultSet myRs = null;
		
		try {
			myRs= myStat.executeQuery(sql_sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return myRs;
	}
	static ResultSet bakiyesorgula(String sql_sorgu) {
		ResultSet myRs = null;
		try {
			myConn = (Connection )DriverManager.getConnection("jdbc:mysql://localhost:3306/wetclean?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
			myStat = (Statement) myConn.createStatement();
			myRs= myStat.executeQuery(sql_sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myRs;
	}
	
	static ResultSet isimcagir(String sql_sorgu) {
		ResultSet myRs = null;
		try {
			myConn = (Connection )DriverManager.getConnection("jdbc:mysql://localhost:3306/wetclean?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
			myStat = (Statement) myConn.createStatement();
			myRs= myStat.executeQuery(sql_sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myRs;
	}
	
}
