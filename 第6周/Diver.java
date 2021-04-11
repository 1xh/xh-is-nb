package Week6;

import java.util.Scanner;

public class Diver {
	public static Customer customer;
	public static void main(String[]a){
		int choice=menu();
		while(choice!=8){
			switch(choice){
			case 1:create();break;
			case 2:save();break;
			case 3:withdraw();break;
			case 4:comsume();break;
			case 5:repay();break;
			case 6:settle();break;
			case 7:balance();break;
		    default:System.out.println("无效操作！");
			}
			choice=menu();
		}
	}
	public static int menu(){
	    int choice =0;
	    System.out.println("欢迎使用银行系统");
	    System.out.println("1.开户create");
	    System.out.println("2.存款save");
	    System.out.println("3.取款withdraw");
	    System.out.println("4.消费comsume");
	    System.out.println("5.还款repay");
	    System.out.println("6.银行结算settle");
	    System.out.println("7.查询余额balance");
	    System.out.println("8.推出exit");
	    System.out.println("输入选择：");
	    Scanner scan=new Scanner(System.in);
	    choice=scan.nextInt();
	    return choice;
	}
	public static void create(){
		int choice=submenu();
		while(choice!=3){
			switch(choice){
			case 1:createCheckingAccount();break;
			case 2:createSavingAccount();break;
			default:System.out.println("无效操作");
			}
			choice=submenu();
		}
	}
	public static int submenu(){
		int choice=0;
		System.out.println("1.信用卡checkingAccount");
		System.out.println("2.储蓄卡saveingAccount");
		System.out.println("3.推出exit");
		System.out.println("输入选择：");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		return choice;
	}
	public static void createCheckingAccount(){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入身份证号：");
		String ssn1=scan.next();
		System.out.println("请输入姓名：");
		String name1=scan.next();
		System.out.println("请输入开卡卡号：");
		String accountNum1=scan.next();
		System.out.println("请输入年费：");
		float fee1=scan.nextFloat();
		CheckingAccount check=new CheckingAccount(accountNum1,5000,fee1);
		customer=new Customer(ssn1,name1,check,null);
	}
	public static void createSavingAccount(){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入身份证号：");
		String ssn2=scan.next();
		System.out.println("请输入姓名：");
		String name2=scan.next();
		System.out.println("请输入开卡卡号：");
		String accountNum2=scan.next();
		System.out.println("请输入利率：");
		float fee2=scan.nextFloat();
		SavingAccount save=new SavingAccount(accountNum2,0,fee2);
		customer=new Customer(ssn2,name2,null,save);
	}
	public static void save() {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入存款金额：");
		double sa=scan.nextDouble();
		customer.getSavingsAccount().savecun(sa);
		System.out.println("存款成功！");
	}
	public static void withdraw() {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入取款金额：");
	    double qu=scan.nextDouble();
	    if(qu>customer.getSavingsAccount().getBalance()) {
	    	System.out.println("余额不足！");
	    }
	    else {
	    	customer.getSavingsAccount().savequ(qu);;
	    	System.out.println("取款成功！");
	    }	
	}
	public static void comsume() {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入消费刷卡金额：");
		double xiaofee=scan.nextDouble();
		customer.getCheckingAccount().checkxiaofei(xiaofee);
		System.out.println("消费成功！");
	}
	public static void repay() {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入还款金额：");
		double huanfee=scan.nextDouble();
		System.out.println("剩余还款：");
		customer.getCheckingAccount().huankuan(huanfee);
		System.out.println(customer.getCheckingAccount().getBalance());
		System.out.println("还款成功！");
	}
	public static void settle() {
		if(customer.getCheckingAccount()==null) {
			System.out.println("存储卡利率结算：");
			customer.getSavingsAccount().savejiesuan();
			System.out.println(customer.getSavingsAccount().getBalance());
		}
		else if(customer.getSavingsAccount()==null) {
			System.out.println("信用卡服务费结算：");
		customer.getCheckingAccount().checkjiesuan();
			System.out.println(customer.getCheckingAccount().getBalance());
		}
	}
	public static void balance() {
		if(customer.getSavingsAccount()==null) {
		    System.out.println(customer.getCheckingAccount().getBalance());
		}
		if(customer.getCheckingAccount()==null) {
		    System.out.println(customer.getSavingsAccount().getBalance());
		}
	}
}