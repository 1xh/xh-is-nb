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
		System.out.println("输入你的密码：");
		String password=scan.next();
		int len=password.length();
		if(len<6||len>10){
			System.out.println("密码无效，长度不符合！");
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
			System.out.println("密码有效");
		}
		else{
			System.out.println("无效");
		}
	}

}
