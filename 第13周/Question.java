package week121;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question {
	public static void main(String[] args) {
		try {
			File myfile = new File("G:/question.txt");
			FileReader f = new FileReader(myfile);
			BufferedReader bf = new BufferedReader(f);
			String str="";
			File myfile1 = new File("G:/jieguo.txt");
			FileWriter f1 = new FileWriter(myfile1);
			PrintWriter b = new PrintWriter(f1);
			
			while((str = bf.readLine()) != null) {
				String regex ="((add)|(sub)|(muit)|(div)|(doubleMe))\\(\\d{1,}(,\\d{1,})?\\)";
				Pattern p=Pattern.compile(regex);
				Matcher m=p.matcher(str);
				while(m.find()) {
	
				b.println(str+"="+cal(str));
				}
			}
			
				bf.close();
				f.close();
				b.close();
				f1.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
}
	public static String cal(String st) {
		String result="";
		String code=st.substring(0,st.indexOf("("));
		int iresult=0;
		if(code.equals("doubleMe")){
			String sFirst=st.substring(st.indexOf("(")+1,st.indexOf(")"));
			int first=Integer.parseInt(sFirst);
			iresult=first*2;
			result=String.valueOf(iresult);
		}
		else{
			String sFirst=st.substring(st.indexOf("(")+1,st.indexOf(","));
			String ssecond=st.substring(st.indexOf(",")+1,st.indexOf(")"));
			int a=Integer.parseInt(sFirst);
			int b=Integer.parseInt(ssecond);
			switch(code){
			case "add":iresult=a+b;result=String.valueOf(iresult);break;
			case "sub":iresult=a-b;result=String.valueOf(iresult);break;
			case "muit":iresult=a*b;result=String.valueOf(iresult);break;
			case "div":iresult=a/b;result=String.valueOf(iresult);break;
			}
		}
		return result;
	}
}
