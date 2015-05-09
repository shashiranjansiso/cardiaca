package com.kerthy.sqlite;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.kerthy.parser.Parser;
import com.kerthy.parser.Patient;

public class SQLiteJDBC
{
	private static String dbfile = "/Users/shashi/Desktop/workspace/RestfulWebservice/database/test.db";
 /* public static void main( String args[] )
  {
	 //deleteExistingFile(dbfile);
	 createdb(dbfile);
	 insertInTable(dbfile);
	 readFromdb(dbfile);
  }*/
  
  private static SQLiteJDBC sqliteInstance = null;
  public static SQLiteJDBC getInstance()
  {
	  if(sqliteInstance == null)
		  sqliteInstance = new SQLiteJDBC();
	  return sqliteInstance;
  }
  
  private SQLiteJDBC()
  {
	  createdb(dbfile);
	  //insertInTable(dbfile, null);
	  //readFromdb(dbfile);
  }
  
  public static void createdb(String db)
  {
	  File f = new File(db);
	  if(f.exists())
		  return;
	  Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:" + db);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "CREATE TABLE   PATIENT " +
	                   "(NAME CHAR(50)     NOT NULL," +			/*PRIMARY KEY */
	                   " DOB           DATE    NOT NULL, " + 
	                   " GENDER        CHAR(20)     NOT NULL, " + 
	                   " AGE           INT, " + 
	                   " EMAIL         CHAR(50))"; 
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } 
	    catch ( Exception e ) {
	    	
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      //System.exit(0);
	    }
	    System.out.println("Table created successfully");
  }
  
  public void insertInTable(Patient patient)
  {
	  Connection c = null;
	  
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:" + dbfile);
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");
	      stmt = c.createStatement();
	      String sql = "INSERT INTO PATIENT (NAME,DOB,GENDER,AGE,EMAIL) " +
	                   "VALUES ("
	                   + patient.toString() + ");";
	                   //+ "'shashi','2011-03-12' , 'male', 22, 'shashiranjansiso@gmail.com' );"; 
	      stmt.executeUpdate(sql);

	      stmt.close();
	      c.commit();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Records created successfully");
  }
  
  public static void deleteExistingFile(String file)
  {
	  File f = new File(file);
	  if(f.exists())
		  f.delete();
  }
  
  public static String readFromdb(String email_t)
  {
	  Connection c = null;
	  Patient pt = new Patient();
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:" + dbfile);
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM PATIENT where EMAIL='"+email_t + "';" );
	     
	      while ( rs.next() ) {
	         String  name = rs.getString("NAME");
	         String dob = rs.getString("DOB");
	         String gender = rs.getString("GENDER");
	         int age = rs.getInt("AGE");
	         String email = rs.getString("EMAIL");
	         pt.setName(name);
	         pt.setDob(dob);
	         pt.setGender(gender);
	         pt.setAge(age);
	         pt.setEmail(email);
	         System.out.println( "NAME = " + name );
	         System.out.println( "DOB = " + dob);
	         System.out.println( "GENDER = " + gender );
	         System.out.println( "AGE = " + age );
	         System.out.println( "EMAIL = " + email );
	         System.out.println();
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      return null;
	      //System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	    return Parser.toJSONString(pt);
	   
  }
  
  public static void readFromdb()
  {
	  Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:" + dbfile);
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM PATIENT;" );
	      while ( rs.next() ) {
	         String  name = rs.getString("NAME");
	         String dob = rs.getString("DOB");
	         String gender = rs.getString("GENDER");
	         int age = rs.getInt("AGE");
	         String email = rs.getString("EMAIL");
	         
	         System.out.println( "NAME = " + name );
	         System.out.println( "DOB = " + dob);
	         System.out.println( "GENDER = " + gender );
	         System.out.println( "AGE = " + age );
	         System.out.println( "EMAIL = " + email );
	         System.out.println();
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
  }
  
}
