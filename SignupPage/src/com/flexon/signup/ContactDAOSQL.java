package com.flexon.signup;

import java.sql.*;

public class ContactDAOSQL {
	private static final String USERNAME = "root";
	private static final String PASSWORD = "abc123";
	private static final String CONN_STRING = "jdbc:mysql://localhost:3306/hello_java";
	
	public void printContacts(){
		Connection conn = null;
	    
	    try {
	        // Class.forName("com.mysql.jdbc.Driver");
	        conn = (Connection) DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
	        System.out.println("Connected");
	        
	        
	        String query = "SELECT * FROM contacts_tbl";

	        // create the java statement
	        Statement st = (Statement) conn.createStatement();
	        
	        // execute the query, and get a java resultset
	        ResultSet rs = st.executeQuery(query);
	        
	        // iterate through the java resultset
	        while (rs.next())
	        {
	          int id = rs.getInt("contactID");
	          String firstName = rs.getString("contact_name");
	          String lastName = rs.getString("contact_lastname");
	          int phoneNum = rs.getInt("contact_phoneNume");
	          String emailAdd = rs.getString("contact_email");

	          // print the results
	          System.out.format("%s, %s, %s, %s, %s\n", id, firstName, lastName, phoneNum, emailAdd);
	        }
	        st.close();
	        
	    }catch (Exception exc){
	    	exc.printStackTrace();
	    }		
	}
}
