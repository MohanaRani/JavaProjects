package bankminiproject;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		System.out.println("====================================================================");
		System.out.println("============= Bank Customer Details =============================");
		System.out.println("====================================================================");
     BankOperations bankOperations=new BankOperations(); 
    	 System.out.println("\t\t 1.Open Bank Account \r\n"
                           +"\t\t 2.View Customer Details \r\n"
    			           +"\t\t 3.Withdraw Amount \r\n"
                           +"\t\t 4.Deposit Amount \r\n"
    			           +"\t\t 5.Check Balance \r\n"
                           +"\t\t 6.Delete Customer Account \r\n");
    	 System.out.println("====================================================================");
			System.out.println("Enter your choice:");
		     Scanner sc =new Scanner(System.in);
			int choice=sc.nextInt();
			switch (choice) {
			case 1:bankOperations.openBankAccount();
			break;
			case 2:bankOperations.viewCustomerDetails();
			break;
			case 3:bankOperations.withdrawAmount();
			break;
			case 4:bankOperations.depositAmount();
			break;
			case 5:bankOperations.checkBalance();
			break;
			case 6:bankOperations.deletecustomeraccount();
			break;
		    default:System.out.println("Wrong choice!!"); 		   
			}
			sc.close();
     }
     
	}
