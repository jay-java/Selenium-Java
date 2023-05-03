package core;
class CustomerException extends Exception{
	String msg="insufficient balance";
	CustomerException(String msg){
		this.msg=msg;
	}
	int accno;
	double balance;
	double amount;
	public void setBalance(int accno,double balance) {
		this.accno=accno;
		this.balance=balance;
	}
	public double withdraw(double amount) throws CustomerException {
		if(balance>amount) {
			this.balance = this.balance-amount;
			return balance;
		}
		else {
			amount = amount-balance;
			System.out.println("Sorry, insufficient balance, you need more "+amount+" Rs.");
			throw new CustomerException(msg);
		}
	}
}
public class Custom {
	public static void main(String[] args) {
		
	}
}