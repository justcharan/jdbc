package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Allexample {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		try(s;){
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 String url=System.getenv("jdbc_url");
			 String username=System.getenv("jdbc_username");
			 String password=System.getenv("jdbc_password");
			Connection con =DriverManager.getConnection(url,username,password);
		PreparedStatement ps= con.prepareStatement("insert into emp2 values(?,?,?)"); 
		PreparedStatement ps1=con.prepareStatement("select * from emp2 where id=?");
		PreparedStatement ps2=con.prepareStatement(" select * from emp2");
		PreparedStatement ps3=con.prepareStatement(" delete  from emp2 where id=?");
		
		
		while(true) {
			try {
			System.out.println("===============================================");
			System.out.println("---------Choices-------- ");
			System.out.println(" 1.insert the data \n 2.delete the  row  \n 3.Search by  id"
					+ "\n 4.view all data \n 5.Exit");
			System.out.println("===============================================");
			System.out.print("Please Enter Your Choice:");
			int count= Integer.parseInt(s.nextLine());
	switch(count) {
		case 1:
			System.out.print("Enter the name:");
			String name=s.nextLine();
			if(name.trim().isEmpty()) {
				System.out.println("Name Cannot Be Empty");
				return ;
			}
			System.out.print("Enter the id:");
			int id=Integer.parseInt(s.nextLine());
			System.out.print("enter the salary: ");
			int sal=Integer.parseInt(s.nextLine());
		    ps.setString(1,name );
			ps.setInt(2, id);
			ps.setInt(3,sal);
			      int k= ps.executeUpdate();
			if(k>0) {
				System.out.println(k+ " Row Sucessfully Inserted");
				
			}
			break;
		case 3:
			System.out.print("Enter the id :");
			int id1=Integer.parseInt(s.nextLine());
			ps1.setInt(1, id1);
			ResultSet rs=ps1.executeQuery();
			if(rs.next()) {
				
				System.out.println(rs.getString("name")+"\t"+rs.getInt(2)+"\t"+rs.getInt(3));
			} else {
				System.out.println("No Record Found ");
			}
		    break;
		case 4:
			ResultSet rs1=ps2.executeQuery();
			System.out.println("name \t\t id \t\t salary");
			System.out.println("-------------------------------------------------");
			boolean  found=false;
			while(rs1.next()) {
			 found=true;
				System.out.println(rs1.getString("name")+" \t\t"+rs1.getInt(2)+"     \t\t      "+rs1.getInt(3));
			}
			if(!found) {
				System.out.println("no data found in database");
			}else {
				System.out.println("Successfully Retrive data");
			}
		
			break;
		case 5:
			System.out.println(" Successfully exited from database");
		            return;
		            
		            
		case 2:
			System.out.println("Enter the id to delete :");
			int id2=Integer.parseInt(s.nextLine());
			ps3.setInt(1, id2);
			 int k1=ps3.executeUpdate();
			 if(k1>0) {
				 System.out.println( id2+" id row deleted  from database");
			 }    else {
				 System.out.println("no data with given id "+id2);
			 }
			 break;
			 default:
				 System.out.println("invalid choice");
				 continue;
		}
			}
		    catch(SQLIntegrityConstraintViolationException  slce) {
			       System.out.println("username already taken"+slce.getMessage());
			           continue;
		}catch(NumberFormatException e) {
			System.out.println("enter the integers only, other than name.");
		continue;
		} 

			catch(SQLException e) {
				System.out.println("Databass Error:"+e.getMessage());
			 continue;
			}
			
		}
		
		
		}
		catch( ClassNotFoundException cnf) {
	     	System.out.println("class not found:");
	        System.out.print(cnf.getMessage());
		        
	}
		
		catch(SQLException e) {
			System.out.println("Databass Error:"+e.getMessage());
		
		}
	
		

		}
	}
}