package Week6;

public class SavingAccount extends BankAccount{
	private double interestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountNum, double balance,double interestRate) {
		super(accountNum,balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + ", toString()=" + super.toString() + "]";
	}
	
	public void savecun(double a){
		super.setBalance(this.getBalance()+a);
	}
	public void savequ(double b) {
		super.setBalance(this.getBalance()-b);
	}
	public void savejiesuan() {
		super.setBalance(this.getBalance()*interestRate);
	}

}
