package fee;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Accountant 
{
	public void addStudent(BufferedReader buff) throws Exception
	{
		
			// TODO Auto-generated method stub
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb","root", "Lavanya@1998");
			PreparedStatement stmtInsert = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?)");
			System.out.println("enter the name");
			stmtInsert.setString(1, buff.readLine());
			System.out.println("enter the email");
			stmtInsert.setString(2, buff.readLine());
			System.out.println("enter the course");
			stmtInsert.setString(3, buff.readLine());
			System.out.println("enter the fee");
			stmtInsert.setString(4, buff.readLine());
			System.out.println("enter the paid");
			stmtInsert.setString(5, buff.readLine());
			System.out.println("enter the due");
			stmtInsert.setString(6, buff.readLine());
			System.out.println("enter the address");
			stmtInsert.setString(7, buff.readLine());
			System.out.println("enter the city");
			stmtInsert.setString(8, buff.readLine());
			System.out.println("enter the state");
			stmtInsert.setString(9, buff.readLine());
			System.out.println("enter the country");
			stmtInsert.setString(10, buff.readLine());
			System.out.println("enter the contactno");
			stmtInsert.setString(11, buff.readLine());

			System.out.println(stmtInsert.executeUpdate() + " No of Records Inserted");
			
		}
		
	
	public void viewStudent(BufferedReader buff) throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb", "root","Lavanya@1998");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from accountant");
		while(rs.next())
			System.out.println(rs.getString(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)
			+" "+rs.getString(10)+" "+rs.getString(11));

					con.close();
		
	}
	public void editStudent(BufferedReader buff) throws Exception
	{
		// TODO Auto-generated method stub
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb","root", "Lavanya@1998");
				PreparedStatement stmtUpdate1 = con.prepareStatement("update student   where student_name=?");
				System.out.println("enter student name which has to edit");
				String name=buff.readLine();
				stmtUpdate1.setString(1, name);
				System.out.println("Enter your Choice : ");
				System.out.println(" \n1. update email\n2. Update Course\n3. Update Fees\n4. Update Payment Paid\n5. Update Payment Due\n6. Update Address\n7. Update City\n8. Update State\n9. Update Country\n10. Update ContactNo");
				String ch=buff.readLine();
				
				switch (Integer.parseInt(ch)) 
				{
				case 1:System.out.println("update email");
				String email=buff.readLine();
				PreparedStatement stmtUpdate11 = con.prepareStatement("update student set  student_email=? where student_name=?");
				stmtUpdate11.setString(1, email); 
				stmtUpdate11.setString(2, name); 
				System.out.println(stmtUpdate11.executeUpdate()+ " No of Student Details Updated");
			
				break;
				case 2:System.out.println("update course");
				String student_course=buff.readLine();
			
			    PreparedStatement stmtUpdate111 = con.prepareStatement("update student set student_course=? where student_name=?");
				stmtUpdate111.setString(1, student_course); 
				stmtUpdate111.setString(2, name); 
				System.out.println(stmtUpdate111.executeUpdate()+ " No of Student Details Updated");
			
					break ;
				case 3: 	System.out.println("update fee");
					int student_fee=buff.read();
			    PreparedStatement stmtUpdate1111 = con.prepareStatement("update student set student_fee=? where student_name=?");
				stmtUpdate1111.setInt(1, student_fee); 
				stmtUpdate1111.setString(2, name); 
				System.out.println(stmtUpdate1111.executeUpdate() + " No of Student Details Updated");
			
					break ;
				case 4: System.out.println("update paid");
				int student_paid=buff.read();
			    PreparedStatement stmtUpdate11111 = con.prepareStatement("update student set  student_paid=? where student_name=?");
				stmtUpdate11111.setInt(1, student_paid); 
				stmtUpdate11111.setString(2, name); 
				System.out.println(stmtUpdate11111.executeUpdate() + " No of Student Details Updated");
			
					break ;
				case 5: 	System.out.println("update due");
				int student_due=buff.read();
			    PreparedStatement stmtUpdate111111 = con.prepareStatement("update student set student_due=? where student_name=?");
				stmtUpdate111111.setInt(1, student_due); 
				stmtUpdate111111.setString(2, name); 
				System.out.println(stmtUpdate111111.executeUpdate() + " No of Student Details Updated");
			
					break ;
				case 6: System.out.println("update address");
				String student_address=buff.readLine();
			    PreparedStatement stmtUpdate1111111 = con.prepareStatement("update student set student_address=? where student_name=?");
				stmtUpdate1111111.setString(1, student_address); 
				stmtUpdate1111111.setString(2, name); 
				System.out.println(stmtUpdate1111111.executeUpdate() + " No of Student Details Updated");
			
					break ;
				case 7: System.out.println("update city");
					String student_city=buff.readLine();
			    PreparedStatement stmtUpdate11111111 = con.prepareStatement("update student set student_city=? where"
			    		+ " student_name=?");
				stmtUpdate11111111.setString(1, student_city); 
				stmtUpdate11111111.setString(2, name); 
				System.out.println(stmtUpdate11111111.executeUpdate() + " No of Student Details Updated");
			
					break ;
				case 8: System.out.println("update state");
				String student_state=buff.readLine();
			    PreparedStatement stmtUpdate111111111 = con.prepareStatement("update student set student_state=? where "
			    		+ "student_name=?");
				stmtUpdate111111111.setString(1, student_state); 
				stmtUpdate111111111.setString(2, name); 
				System.out.println(stmtUpdate111111111.executeUpdate() + " No of Student Details Updated");
			
					break ;
				case 9: System.out.println("update country");
					String student_country=buff.readLine();
			    PreparedStatement stmtUpdate1111111111 = con.prepareStatement("update student set  student_country=? where "
			    		+ "student_name=?");
				stmtUpdate1111111111.setString(1, student_country); 
				stmtUpdate1111111111.setString(2, name); 
				System.out.println(stmtUpdate1111111111.executeUpdate() + " No of Student Details Updated");
			
					break ;
				case 10: System.out.println("update contactno");
					int student_contactno=buff.read();
			    PreparedStatement stmtUpdate11111111111 = con.prepareStatement("update student set student_contactno=? "
			    		+ "where student_name=?");
				stmtUpdate11111111111.setInt(1, student_contactno); 
				stmtUpdate11111111111.setString(2, name); 
				System.out.println(stmtUpdate11111111111.executeUpdate() + " No of Student Details Updated");
			
					break ;
					
				}
				
				}
			

			public void dueefees(BufferedReader buff) throws Exception {
				// TODO Auto-generated method stub
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb","root", "Lavanya@1998");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select student_name,student_due from student where student_due!=0");
				while(rs.next())
					System.out.println(rs.getString(1) + " " +rs.getString(6));
				con.close();
				
				
			}

			public void logout(BufferedReader buff) throws Exception {
				// TODO Auto-generated method stub
				String continueChoice;
				boolean transaction=true;
				System.out.println("Do you Want to logout\nlogout \nNo");
				continueChoice =buff.readLine();
				if(continueChoice.equalsIgnoreCase("logout"))
					transaction=false;
					

		
	}
	
}
