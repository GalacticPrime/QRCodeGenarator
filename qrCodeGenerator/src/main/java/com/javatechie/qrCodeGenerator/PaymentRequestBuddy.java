package com.javatechie.qrCodeGenerator;

public class PaymentRequestBuddy {

	private String userName;
	private String mobileNumber;
	private String accountType;
	private String accountNo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public PaymentRequestBuddy(String userName, String mobileNumber, String accountType, String accountNo) {
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.accountType = accountType;
		this.accountNo = accountNo;
	}
	public PaymentRequestBuddy() {
		
	}
	
	
}
