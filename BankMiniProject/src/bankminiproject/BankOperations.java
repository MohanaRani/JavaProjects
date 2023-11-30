package bankminiproject;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class BankOperations {
      Scanner sc = new Scanner(System.in);
     // ArrayList<CustomerDetails>customerList=new ArrayList<CustomerDetails>();
      static HashMap<Integer,CustomerDetails>allCustomerDetails=new HashMap<Integer,CustomerDetails>();
      BankMain bankMain = new BankMain();
      
public void openBankAccount() {
    CustomerDetails custdetails=new CustomerDetails();
    System.out.println("Enter Customer Details Below");
    System.out.println("====================================================================");
    System.out.println("Enter password");
    String customerPassword=sc.next();
    System.out.println("====================================================================");
	System.out.println("Enter Your Name");
	String customerName =sc.next();
	System.out.println("Enter Your Address");
	String customerAddress=sc.next();
	System.out.println("Enter Account Type");
	String customerAccountType=sc.next();
	System.out.println("Enter Your Email");
	String customerEmail=sc.next();
	System.out.println("Enter Gender");
	String customerGender=sc.next();
	System.out.println("Enter Contact Number");
	
	long customerContact=sc.nextLong();
	
	custdetails.setCustomerId(generatorId());
	custdetails.setCustomerPassword(customerPassword);
	custdetails.setCustomerName(customerName);
	custdetails.setCustomerAddress(customerAddress);
	custdetails.setCustomerEmail(customerEmail);
	custdetails.setCustomerGender(customerGender);
	custdetails.setAccountType(customerAccountType);//Savings Or Current
	custdetails.setCustomerContact(customerContact);
	custdetails.setCustomerAccountNumber(generatorCustomerAccount());
    System.out.println(custdetails);
  //  customerList.add(custdetails);
    allCustomerDetails.put(custdetails.getCustomerId(),custdetails);
    
    
    System.out.println("Do you want to go to Main method Yes or No :");
    
    String option = sc.next();
    System.out.println(option);
    if(option.equalsIgnoreCase("Yes"))
    BankMain.main(null);
}


public int generatorId() {
    Random r = new Random( System.currentTimeMillis() );
    return ((1 + r.nextInt(2)) * 500 + r.nextInt(450));
}

public long generatorCustomerAccount() {
    Random r = new Random( System.currentTimeMillis() );
    return ((4 + r.nextLong(9)) * 1000000980 + r.nextLong(1000064546));
}

public void viewCustomerDetails() {
   System.out.println("Please enter Customer Id");
   int custId=sc.nextInt();
   System.out.println("Please enter your password");
   String password=sc.next();
   
   if(allCustomerDetails.get(custId) != null) 
   {
	  CustomerDetails custObject=new CustomerDetails();
	  custObject=allCustomerDetails.get(custId);
	  if (custObject !=null && custObject.getCustomerPassword().equals(password)) {
		  System.out.println("User successfully logged-in..");
		  System.out.println("====================================================================");
		  System.out.println("Customer Id : " + custObject.getCustomerId()+ "\r\n"
			        + "Name : " + custObject.getCustomerName() + "\r\n" 
					+ "Address : " + custObject.getCustomerAddress() +"\r\n" 
			  		+ "AccountNumber : " + custObject.getCustomerAccountNumber() + "\r\n" 
					+ "Contact : " + custObject.getCustomerContact() + "\r\n"
					+ "AccountType : " + custObject.getAccountType() + "\r\n" 
					+ "Email : " + custObject.getCustomerEmail() + "\r\n"
					+ "Gender : " + custObject.getCustomerGender() + "\r\n"
					+ "Balance : " + custObject.getBalance() + "\r\n");
      } else {
          System.out.println("Invalid Password");
      }
   }
   else
   {
	 System.out.println("Customer not Found");  
   }
   System.out.println("Do you want to go to Main method Yes or No :");
   String option = sc.next();
   System.out.println(option);
   if(option.equalsIgnoreCase("Yes"))
   BankMain.main(null);
}

public void withdrawAmount() {
	System.out.println("Please enter customer Id");
	int custId=sc.nextInt();
	 System.out.println("Please enter your password");
	   String password=sc.next();
	if(allCustomerDetails.get(custId)!=null) {
		CustomerDetails cust=new CustomerDetails();
		cust=allCustomerDetails.get(custId);
		  if (cust !=null && cust.getCustomerPassword().equals(password)) {
			System.out.println("Enter the amount you want to withdraw:");
			long withdrawAmount=sc.nextLong();
			if(withdrawAmount>99) {
				cust=allCustomerDetails.get(custId);
				if(withdrawAmount<=cust.getBalance()) {
				cust.setBalance(cust.getBalance()-withdrawAmount);
				System.out.println("Your Balance is : "+cust.getBalance());
			}
				else 
				{
					System.out.println("Your balance is low to withdraw");
				}
			}
			else {
			System.out.println("Withdraw should be 100 and above");	
			}
			}
			else {
				System.out.println("Invalid Password");
			}	
	}
	System.out.println("Do you want to go to Main method Yes or No :");
	String option=sc.next();
	System.out.println(option);
	if(option.equalsIgnoreCase("Yes"))
		BankMain.main(null);
     }

public void depositAmount() {
	System.out.println("Please enter customer Id");
	int custId=sc.nextInt();
	System.out.println("Please enter your password");
	   String password=sc.next();
	if(allCustomerDetails.get(custId)!=null) {
		CustomerDetails cust=new CustomerDetails();
		cust=allCustomerDetails.get(custId);
		if(cust !=null && cust.getCustomerPassword().equals(password)){
			System.out.println("Enter the amount you want to deposit:");
			long depositAmount=sc.nextLong();
			if(depositAmount>0) {
				cust=allCustomerDetails.get(custId);
				cust.setBalance(cust.getBalance()+depositAmount);
				System.out.println("Your Balance is : "+cust.getBalance());
			}
		}
		else {
			System.out.println("Invalid Password");

		}
	
     }
	System.out.println("Do you want to go to Main method Yes or No :");
	String option=sc.next();
	System.out.println(option);
	if(option.equalsIgnoreCase("Yes"))
		BankMain.main(null);
	}

public void checkBalance() {
	System.out.println("Please enter Customer Id");
	int balance=sc.nextInt();
	System.out.println("Please enter your password");
	   String password=sc.next();
	if(allCustomerDetails.get(balance) !=null) {
    CustomerDetails custBal=new CustomerDetails();
    custBal=allCustomerDetails.get(balance);
	if(custBal !=null && custBal.getCustomerPassword().equals(password)){
	    System.out.println("Your Balance is : " + custBal.getBalance());
	    }
	else {
		System.out.println("Invalid Password");
	}
	}
	System.out.println("Do you want to go to Main method Yes or No :");
	String option=sc.next();
	System.out.println(option);
	if(option.equalsIgnoreCase("Yes"))
		BankMain.main(null);
}
public void deletecustomeraccount() {
	System.out.println("Please enter Customer Id");
	int deleteaccount=sc.nextInt();
	System.out.println("Please enter your password before deleting account");
	   String password=sc.next();
	if(allCustomerDetails.get(deleteaccount)!=null && allCustomerDetails.get(deleteaccount).getCustomerPassword().equals(password))
	{
	allCustomerDetails.remove(deleteaccount);
	
	System.out.println("Deleted Sucessfully");
	}
	System.out.println("Do you want to go to Main method Yes or No :");
	String option=sc.next();
	System.out.println(option);
	if(option.equalsIgnoreCase("Yes"))
		BankMain.main(null);
}
}
