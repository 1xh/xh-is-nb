package week8;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String []args) {
		boolean hasspace=false;
		boolean hasuppear=false;
		boolean haslower=false;
		boolean hasdigitl=false;
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
        Scanner scan=new Scanner(System.in);
		System.out.println("����������룺");
		String password=scan.next();
		int len=password.length();
		if(len<6||len>10){
			System.out.println("������Ч�����Ȳ����ϣ�");
			return;
		}
		for(int i=0;i<len;i++){
			char ch=password.charAt(i);
			if(ch==' '){
				hasspace=true;
			}
			if(ch>'A'&&ch<'Z'){
				hasuppear=true;
			}
			if(ch>'a'&&ch<'z'){
				haslower=true;
			}
			if(ch>'0'&&ch<'9'){
				hasdigitl=true;
			}
		}
		if(!hasspace&&hasuppear&&haslower){
			System.out.println("������Ч");
		}
		else{
			System.out.println("��Ч");
		}
	}

}
