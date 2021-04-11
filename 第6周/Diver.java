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
		    default:System.out.println("��Ч������");
			}
			choice=menu();
		}
	}
	public static int menu(){
	    int choice =0;
	    System.out.println("��ӭʹ������ϵͳ");
	    System.out.println("1.����create");
	    System.out.println("2.���save");
	    System.out.println("3.ȡ��withdraw");
	    System.out.println("4.����comsume");
	    System.out.println("5.����repay");
	    System.out.println("6.���н���settle");
	    System.out.println("7.��ѯ���balance");
	    System.out.println("8.�Ƴ�exit");
	    System.out.println("����ѡ��");
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
			default:System.out.println("��Ч����");
			}
			choice=submenu();
		}
	}
	public static int submenu(){
		int choice=0;
		System.out.println("1.���ÿ�checkingAccount");
		System.out.println("2.���saveingAccount");
		System.out.println("3.�Ƴ�exit");
		System.out.println("����ѡ��");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		return choice;
	}
	public static void createCheckingAccount(){
		Scanner scan=new Scanner(System.in);
		System.out.println("���������֤�ţ�");
		String ssn1=scan.next();
		System.out.println("������������");
		String name1=scan.next();
		System.out.println("�����뿪�����ţ�");
		String accountNum1=scan.next();
		System.out.println("��������ѣ�");
		float fee1=scan.nextFloat();
		CheckingAccount check=new CheckingAccount(accountNum1,5000,fee1);
		customer=new Customer(ssn1,name1,check,null);
	}
	public static void createSavingAccount(){
		Scanner scan=new Scanner(System.in);
		System.out.println("���������֤�ţ�");
		String ssn2=scan.next();
		System.out.println("������������");
		String name2=scan.next();
		System.out.println("�����뿪�����ţ�");
		String accountNum2=scan.next();
		System.out.println("���������ʣ�");
		float fee2=scan.nextFloat();
		SavingAccount save=new SavingAccount(accountNum2,0,fee2);
		customer=new Customer(ssn2,name2,null,save);
	}
	public static void save() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������");
		double sa=scan.nextDouble();
		customer.getSavingsAccount().savecun(sa);
		System.out.println("���ɹ���");
	}
	public static void withdraw() {
		Scanner scan=new Scanner(System.in);
		System.out.println("����ȡ���");
	    double qu=scan.nextDouble();
	    if(qu>customer.getSavingsAccount().getBalance()) {
	    	System.out.println("���㣡");
	    }
	    else {
	    	customer.getSavingsAccount().savequ(qu);;
	    	System.out.println("ȡ��ɹ���");
	    }	
	}
	public static void comsume() {
		Scanner scan=new Scanner(System.in);
		System.out.println("��������ˢ����");
		double xiaofee=scan.nextDouble();
		customer.getCheckingAccount().checkxiaofei(xiaofee);
		System.out.println("���ѳɹ���");
	}
	public static void repay() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���뻹���");
		double huanfee=scan.nextDouble();
		System.out.println("ʣ�໹�");
		customer.getCheckingAccount().huankuan(huanfee);
		System.out.println(customer.getCheckingAccount().getBalance());
		System.out.println("����ɹ���");
	}
	public static void settle() {
		if(customer.getCheckingAccount()==null) {
			System.out.println("�洢�����ʽ��㣺");
			customer.getSavingsAccount().savejiesuan();
			System.out.println(customer.getSavingsAccount().getBalance());
		}
		else if(customer.getSavingsAccount()==null) {
			System.out.println("���ÿ�����ѽ��㣺");
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