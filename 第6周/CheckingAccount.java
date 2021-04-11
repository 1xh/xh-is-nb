package Week6;

public class CheckingAccount extends BankAccount{
	private double serviceCharge;

	public CheckingAccount() {
		super();	
	}
	
	public CheckingAccount(String accountNum, double balance,double serviceCharge) {
		super(accountNum, balance);
		this.serviceCharge = serviceCharge;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	@Override
	public String toString() {
		return "CheckingAccount [serviceCharge=" + serviceCharge + ", toString()=" + super.toString() + "]";
	}
	public void checkxiaofei(double c) {
		super.setBalance(this.getBalance()-c);
	}
	public void huankuan(double d) {
		super.setBalance(this.getBalance()-d);
	}
	
	public void checkjiesuan() {
		super.setBalance(this.getBalance()-serviceCharge);
	}
}