package com;

import java.sql.*;  
class InsertPrepared{  
public static void main(String args[]){  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP","aja185core","aja185core");  
  
PreparedStatement stmt=con.prepareStatement("insert into EMPLOYEE values(?,?,?,?,?)");  
stmt.setInt(1,101);//1 specifies the first parameter in the query  
stmt.setString(2,"Ratan"); 
stmt.setString(3,"male");
stmt.setString(4,"ASE");
stmt.setString(5,"abc@xyz.com"); 
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  