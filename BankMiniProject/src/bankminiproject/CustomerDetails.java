package bankminiproject;

public class CustomerDetails {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private String accountType;
	private String customerEmail;
	private String customerGender;
	private long customerAccountNumber;
	private long customerContact;
	private double Balance;
	private String customerPassword;
	public CustomerDetails() {
     super();
     }

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public long getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	public void setCustomerAccountNumber(long customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	
	
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	
	
	

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	

	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", accountType=" + accountType + ", customerEmail=" + customerEmail
				+ ", customerGender=" + customerGender + ", customerAccountNumber=" + customerAccountNumber
				+ ", customerContact=" + customerContact + ", Balance=" + Balance + ", customerPassword=" + customerPassword + "]";
	}
	
}
