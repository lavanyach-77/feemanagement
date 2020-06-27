package fee;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Userclass<T>
{
	T obj;
	void create(T obj)
	{
		this.obj=obj;
	}
	T getInstance()
	{
		return obj;
	}
}


public class Fees_management 
{
	InputStreamReader isr=null;
	BufferedReader buff=null;
	Accountant maccountant=null;
	Admin madmin=null;
	 String userchoice;
     String clientchoice;
	public static void main(String[] args) throws Exception {
   Fees_management mObject=new Fees_management();
   mObject.isr=new InputStreamReader(System.in);
   mObject.buff=new BufferedReader(mObject.isr);
   String continueChoice;
   boolean transaction=true;
   boolean repeat=true;
	
   do
   {
	 
	  System.out.println("Welcome to fees management system\n");
	  System.out.println("Select the user type\n1 Admin\n2. Accountant\n3. Student");
	  String mUserChoice=mObject.buff.readLine();
	  
   
	  switch (Integer.parseInt(mUserChoice)) {
		case 1:
			Userclass<Admin> obj = new Userclass<Admin>();
			obj.create(new Admin());
			mObject.madmin = obj.getInstance();
			
			System.out.println(" Admin login PAGE\n");
			do{
				mObject.madmin.login(mObject.buff);
			System.out.println("ADMIN SECTION\n");
			System.out.println("select your section\n 1.ADD ACCOUNTANT \n 2.VIEW ACCOUNTANT \n 3.LOGOUT");
			String clientchoice=mObject.buff.readLine();
			
			switch(Integer.parseInt(clientchoice)) {
			case 1: mObject.madmin.addAccountant(mObject.buff);
			break;
			case 2: mObject.madmin.viewAccountant(mObject.buff);
			break;
			case 3: mObject.madmin.logout(mObject.buff);
			break;
			default:
				System.out.println("task is not performed");
			
			}System.out.println("Do you Want to Continue\nYes\nNo");
			continueChoice = mObject.buff.readLine();
			if (continueChoice.equalsIgnoreCase("No"))
				transaction = false;
			}while(transaction);
			break;
		case 2:
			Userclass<Accountant> obj1=new Userclass<Accountant>();
			obj1.create(new Accountant());
			mObject.maccountant=obj1.getInstance();
			do {
			System.out.println("select your choice\n 1.ADD STUDENT \n 2.VIEW STUDENT \n 3.EDIT STUDENT \n 4.DUE FESS \n 5.LOGOUT");
			String clientchoice1=mObject.buff.readLine();
			
			switch(Integer.parseInt(clientchoice1)) {
				case 1: mObject.maccountant.addStudent(mObject.buff);
				break;
				case 2: mObject.maccountant.viewStudent(mObject.buff);
				break;
				case 3: mObject.maccountant.editStudent(mObject.buff);
				break;
				case 4: mObject.maccountant.dueefees(mObject.buff);
				break;
				case 5: mObject.maccountant.logout(mObject.buff);
				break;
				default: System.out.println("task not completed");
			}System.out.println("Do you Want to Continue\nYes\nNo");
			continueChoice = mObject.buff.readLine();
			if (continueChoice.equalsIgnoreCase("No"))
				transaction = false;
				
			}while(transaction);
			break;
			default: System.out.println("select atleast one task\n");
		}System.out.println("Do you Want to End feemanagement\nYes\nNo");
		 mObject.userchoice = mObject.buff.readLine();
		if (mObject.userchoice.equalsIgnoreCase("yes"))
			repeat = false;
		}while(repeat);
		
		System.out.println("*************THANK YOU FOR USING THIS APPLICATION*************");


   
   
   }
	

}
