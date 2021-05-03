package week8;

import java.util.Scanner;

public class Yunsuan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入表达式：");
		String express=scan.next();
		
		int pos1=express.indexOf('(');
		int pos2,pos3;
		String codenum1,codenum2;
		int num1,num2=0;
		String opcode=express.substring(0, pos1);
		if(opcode.equals("doubleMe")){
			pos2=express.indexOf(')');
			codenum1=express.substring(pos1+1, pos2);
			num1=Integer.parseInt(codenum1);
		}
		else{
			pos2=express.indexOf(',');
			pos3=express.indexOf(')');
			codenum1=express.substring(pos1+1, pos2);
			codenum2=express.substring(pos2+1, pos3);
			num1=Integer.parseInt(codenum1);
			num2=Integer.parseInt(codenum2);
		}
		int result=0;
		switch(opcode){
		case "add":result=num1+num2;break;
		case "sub":result=num1-num2;break;
		case "max":result=num1>num2?num1:num2;break;
		case "min":result=num1<num2?num1:num2;break;
		case "doubleMe":result=num1*2;break;
		default:System.out.println("wu");break;
		}
		String info;
		info=express+"="+String.valueOf(result);
		System.out.println(info);
	}

}
