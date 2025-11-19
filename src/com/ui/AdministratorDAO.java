//package com.ui;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class AdministratorDAO {
//	static Connection con;
//	static PreparedStatement ps;
//	public static Connection getcon() throws ClassNotFoundException, SQLException{
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		return con=DriverManager.getConnetion("jdbc:mysql://localhost3306/ustglobal","root","pass@word1");
//	}
//	public static int addEmployee(EmplyeeBeen eb)
//	{
//		int i=0;
//		
//	}
//	try {
//		ps=con.prepareStatement("insert into employee values(?,?,?)");
//		ps.setString(1,eb.getName());
//		ps.setInt(2,eb.getSalary());
//		ps.setInt(3,eb.getId());
//		i=ps.executeUpdate();
//		
//		
//		
//	}
//	catch(SQLException sql)
//	
//	{
//		System.out.println(sql);
//	}
//	return i;
//	
//	
//	
//
//}
