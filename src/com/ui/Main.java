//package com.ui;
//import java.sql.*;
//import javax.swing.JOptionPane;
//import com.ui.EmployeeBeen;
//import com.ui.AdministratorDAO;
//
////
////public class Main {
////	public static void main(String[] args) throws ClassNotFoundException, SQLException {
////		Class.forName("com.mysql.cj.jdbc.Driver");
////	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ustglobal","root","pass@word1");
////	System.out.println("Connected Successfully");
////	PreparedStatement ps =con.prepareStatement("Insert into employee values(?,?,?)");
////	ps.setInt(1, 101);
////	ps.setString(2, "Rahul");
////	ps.setInt(3, 30000);
////	int i=ps.executeUpdate();
////	System.out.println(i+" record inserted...");
////	}
////}
////public class
//
////SQL CODES
//
//package com.example;
//
//
//
//public class ThreadDemo extends Thread{
//
//public static void main(String[] args) {
//
//ThreadDemo th1=new ThreadDemo();//New Born 
//
//	th1.start();//Runnable
//
//}
//
//public void run()
//
//{
//
//for(int i=1;i<=5;i++)
//
//{
//
//System.out.println(i);
//
//try {
//
//Thread.sleep(3000);
//
//} catch (InterruptedException e) {
//
//e.printStackTrace();
//
//}
//
//}
//
//}
//
//}
//
//---------------------------------------------------------------------------------------------------------------------
//
//
//
//package com.example;
//
//
//
//public class Demo implements Runnable{
//
//
//
//public static void main(String[] args) {
//
//Demo rn=new Demo();
//
//Thread th1=new Thread(rn);
//
//th1.start();
//
//Thread th2=new Thread(rn);
//
//th2.start();
//
//}
//
//@Override
//
//	public void run() {
//
//System.out.println("Runnable Object");
//
//}
//
//
//
//}
//
//--------------------------------------------------------------------------------------------------------------------------------
//
//package com.example;
//
//
//
//public class Table {
//
//public void print(int x)
//
//{
//
//for(int i=1;i<=5;i++)
//
//{
//
//System.out.println(i*x);
//
//try {
//
//Thread.sleep(3000);
//
//} catch (InterruptedException e) {
//
//// TODO Auto-generated catch block
//
// e.printStackTrace();
//
//}
//
//}
//
//}
//
//}
//
//-----------------------------------------------------------------------------------------------------------------------
//
//package com.example;
//
//
//
//public class A {
//
//Table t;
//
//A(Table t)
//
//{
//
//this.t=t;
//
//}
//
//public void disp()
//
//{
//
//t.print(5);
//
//}
//
//
//
//}
//
//-------------------------------------------------------------------------------------------------------------------------------------
//
//package com.example;
//
//
//
//public class User2 {
//
//public static void main(String[] args) {
//
//Table tbl=new Table();
//
//A a=new A(tbl);
//
//a.disp();
//
//}
//
//}
//
//--------------------------------------------------------------------------------------------------------------------------------------
//
//package com.example;
//
//
//
//public class Table {
//
//public synchronized void print(int x)
//
//{
//
//for(int i=1;i<=5;i++)
//
//{
//
//System.out.println(i*x);
//
//try {
//
//Thread.sleep(3000);
//
//} catch (InterruptedException e) {
//
//// TODO Auto-generated catch block
//
// e.printStackTrace();
//
//}
//
//}
//
//}
//
//}
//
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//
//package com.example;
//
//
//
//public class A extends Thread{
//
//Table t;
//
//A(Table t)
//
//{
//
//this.t=t;
//
//}
//
//public void run()
//
//{
//
//t.print(100);
//
//}
//
//
//
//}
//
//---------------------------------------------------------------------------------------------------------------------------------------------------------
//
//package com.example;
//
//
//
//public class B extends Thread{
//
//Table t;
//
//B(Table t)
//
//{
//
//this.t=t;
//
//}
//
//public void run()
//
//{
//
//t.print(1000);
//
//}
//
//}
//
//----------------------------------------------------------------------------------------------------------------------
//
//package com.example;
//
//
//
//public class User2 {
//
//public static void main(String[] args) {
//
//Table tbl=new Table();
//
//A th1=new A(tbl);
//
//B th2=new B(tbl);
//
//th1.start();
//
//th2.start();
//
//}
//
//}
//
//------------------------------------------------------------------------------------------------------------------------------------
//
//package com.example;
//
//
//
//public class Customer {
//
//int amount=2000;
//
//public synchronized void withdraw(int amount)
//
//{
//
//if(this.amount>=amount)
//
//{
//
//System.out.println("Amount withdrawn successfully "+amount);
//
//}
//
//else
//
//	{
//
// System.out.println("Insufficient account balance ");
//
//try {
//
//wait();
//
//} catch (InterruptedException e) {
//
//// TODO Auto-generated catch block
//
// e.printStackTrace();
//
//}
//
//}
//
//System.out.println("Withdraw process is continuing....");
//
//}
//
//public synchronized void deposit(int amount)
//
//{
//
//this.amount+=amount;
//
//System.out.println("Amount deposited successfully "+amount);
//
//notify();
//
//}
//
//public static void main(String[] args) {
//
//Customer c=new Customer();
//
//new Thread() {
//
//public void run()
//
//{
//
//c.withdraw(4000);
//
//}
//
//}.start();
//
//new Thread() {
//
//public void run()
//
//{
//
//c.deposit(10000);
//
//}
//
//}.start();
//
//}
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//---------------------------------------------------------------------------------------------------------------------------------------------------
//
//
//
//
//
//package com.example.ui;
//
//import java.sql.*;
//
//
//
//import javax.swing.JOptionPane;
//
//import java.util.*;
//
//import com.example.bean.EmployeeBean;
//
//import com.example.dao.AdministratorDao;
//
//public class Main {
//
//public static void main(String[] args)throws ClassNotFoundException, SQLException {
//
//ArrayList<EmployeeBean> al=AdministratorDao.selectAllEmployee();
//
//String str="";
//
//for(EmployeeBean e:al)
//
//{
//
//str+=e.getId()+" "+e.getName()+" "+e.getSalary()+"\n";
//
//}
//
//JOptionPane.showMessageDialog(null, str);
//
////	int id=Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID"));
//
////	EmployeeBean e1=AdministratorDao.selectEmployeeById(id);
//
////JOptionPane.showMessageDialog(null, e1.getId()+" "+e1.getName()+" "+e1.getSalary());
//
//	//JOptionPane.showMessageDialog(null, AdministratorDao.deleteEmployee(id)+" record deleted successfully...");
//
//	//	String name=JOptionPane.showInputDialog("Enter Employee Name");
//
////	int salary=Integer.parseInt(JOptionPane.showInputDialog("Enter Salary"));
//
////	EmployeeBean eb=new EmployeeBean();
//
////	eb.setId(id);
//
////	eb.setName(name);
//
////	eb.setSalary(salary);
//
//	//JOptionPane.showMessageDialog(null, AdministratorDao.addEmployee(eb)+" record inserted successfully...");
//
////	JOptionPane.showMessageDialog(null,AdministratorDao.updateEmployee(eb)+" record updated successfully....");
//
//}
//
//}
//
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//package com.example.dao;
//
//import java.sql.*;
//
//import java.util.ArrayList;
//
//
//
//import com.example.bean.EmployeeBean;
//
//public class AdministratorDao {
//
//public static Connection con=getCon();
//
//public static PreparedStatement ps;
//
//public static ResultSet rs;
//
//public static Connection getCon()
//
//{
//
//try
//
//	{
//
// Class.forName("com.mysql.cj.jdbc.Driver");
//
//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ustglobal","root","root");
//
//}
//
//catch(ClassNotFoundException cnf)
//
//{
//
//System.out.println(cnf);
//
//}
//
//catch(SQLException sql)
//
//{
//
//System.out.println(sql);
//
//}
//
//return con;
//
//}
//
//public static int addEmployee(EmployeeBean eb)
//
//{
//
//
//
//int i=0;
//
//try
//
//	{
//
//	ps=con.prepareStatement("insert into employee values(?,?,?)");
//
//ps.setInt(1, eb.getId());
//
//ps.setString(2, eb.getName());
//
//ps.setInt(3, eb.getSalary());
//
//i=ps.executeUpdate();
//
//}
//
//catch(SQLException sql)
//
//{
//
//System.out.println(sql);
//
//}
//
//return i;
//
//}
//
//public static int updateEmployee(EmployeeBean eb)
//
//{
//
//int i=0;
//
//try
//
//	{
//
//	ps=con.prepareStatement("update Employee set name=?,salary=? where id=?");
//
//
//
//ps.setString(1, eb.getName());
//
//ps.setInt(2, eb.getSalary());
//
//ps.setInt(3, eb.getId());
//
//i=ps.executeUpdate();
//
//}
//
//catch(SQLException sql)
//
//{
//
//System.out.println(sql);
//
//}
//
//return i;
//
//}
//
//
//
//public static int deleteEmployee(int id)
//
//{
//
//int i=0;
//
//try
//
//	{
//
//	ps=con.prepareStatement("delete from employee where id=?");
//
//ps.setInt(1, id);
//
//i=ps.executeUpdate();
//
//}
//
//catch(SQLException sql)
//
//{
//
//System.out.println(sql);
//
//}
//
//return i;
//
//}
//
//public static EmployeeBean selectEmployeeById(int id)
//
//{
//
//
//
//EmployeeBean e=new EmployeeBean();
//
//try
//
//	{
//
//	ps=con.prepareStatement("select * from employee where id=?");
//
//ps.setInt(1, id);
//
//rs=ps.executeQuery();
//
//if(rs.next())
//
//{
//
//e.setId(rs.getInt("id"));
//
//e.setName(rs.getString(2));
//
//e.setSalary(rs.getInt("salary"));
//
//}
//
//}
//
//catch(SQLException sql)
//
//{
//
//System.out.println(sql);
//
//}
//
//return e;
//
//}
//
//public static ArrayList<EmployeeBean> selectAllEmployee()
//
//{
//
//ArrayList<EmployeeBean> all=new ArrayList<EmployeeBean>();
//
//try
//
//	{
//
// ps=con.prepareStatement("select * from employee");
//
//rs=ps.executeQuery();
//
//while(rs.next())
//
//{
//
//EmployeeBean eb=new EmployeeBean();
//
//eb.setId(rs.getInt(1));
//
//eb.setName(rs.getString(2));
//
//eb.setSalary(rs.getInt(3));
//
//all.add(eb);
//
//}
//
//}
//
//catch(SQLException sql)
//
//{
//
//System.out.println(sql);
//
//}
//
//return all;
//
//}
//
//}

