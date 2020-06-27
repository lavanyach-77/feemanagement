package fee;


import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Admin 
{
	public void login(BufferedReader buff) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enter the USERNAME");
		String user_name=buff.readLine();
		System.out.println("enter your PASSWORD");
		String password=buff.readLine();
		System.out.println("admin login successful\n");
	}
  public void addAccountant(BufferedReader buff) throws Exception
{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/accountantdb?serverTimezone=UTC", "root", "Lavanya@1998");
	
	PreparedStatement stmtInsert = con.prepareStatement("insert into accountant values(?,?,?,?)");
	System.out.println("enter the name");
	stmtInsert.setString(1, buff.readLine());
	System.out.println("enter the password");
	stmtInsert.setString(2, buff.readLine());
	System.out.println("enter the email");
	stmtInsert.setString(3, buff.readLine());
	System.out.println("enter the contact_number");
	stmtInsert.setString(4, buff.readLine());

	System.out.println(stmtInsert.executeUpdate() + " No of Records Inserted");

}
public void viewAccountant(BufferedReader buff) throws Exception
{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root","Lavanya@1998");
	Statement stmt=con.createStatement();
	ResultSet rst=stmt.executeQuery("Select * from accountant");
	while(rst.next())
		System.out.println(rst.getString(1)+rst.getString(2)+rst.getString(3)+rst.getString(4));
	con.close();
}
public void logout(BufferedReader buff) throws Exception
{
	String continueChoice;
	boolean transaction=true;
	System.out.println("Do you Want to logout\nlogout \nNo");
	continueChoice =buff.readLine();
	if(continueChoice.equalsIgnoreCase("logout"))
		transaction=false;
}


}
