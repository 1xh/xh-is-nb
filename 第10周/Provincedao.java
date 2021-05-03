package week10.dao;

import java.util.ArrayList;
import java.util.Scanner;

import week10.vo.Result;
import week10.vo.Student;

public class Provincedao {
	public static ArrayList<Student> read(){
		ArrayList<Student> list=new ArrayList<Student>();
		Scanner scan=new Scanner(System.in);
		String stuary="";
		while(!(stuary=scan.nextLine()).equals("end")){
			String array[]=stuary.split(",|，");
			Student student=new Student(array[0],array[1],array[2],array[3]);
			list.add(student);
		}
		return list;
	}
	public static int CountBygender(ArrayList<Student> list,String gender){
		int count=0;
		for (Student student : list) {
			String stuGender=student.getGender();
			if(stuGender.equals(gender)){
				count++;
			}
		}
		return count;
	}

	public static ArrayList<Result> countByprovince(ArrayList<Student> list){
		ArrayList<Result> resultlist=new ArrayList<Result>();
		for (int i = 0; i < list.size(); i++) {
			Student stu=list.get(i);
			String province=stu.getPrvoince();
			String name=stu.getName();
			int index=isprovinceexit(resultlist,province);
			if(index>-1){
				Result result1=resultlist.get(index);
				result1.setCount(result1.getCount()+1);
				result1.setNames(result1.getNames()+","+name);
				resultlist.set(index, result1);
			}
			else{
				Result result=new Result(province,1,name);
				resultlist.add(result);
			}
		}
		return  resultlist;
	}
	public static int isprovinceexit(ArrayList<Result> resultlist,String province){
		int index=-1;
		for(int i=0;i<resultlist.size();i++){
			Result result=resultlist.get(i);
			if(result.getPrvoince().equals(province)){
				return i;
			}
		}
		return index;
	}
	public static void dispaly(ArrayList<Student> list,ArrayList<Result> resultlist){
		int ncount=list.size();
		int mancount=CountBygender(list,"男");
		int womancount=CountBygender(list,"女");
		System.out.println("总人数："+ncount+"人");
		System.out.println("男人数："+mancount+"人，"+mancount*100.0f/ncount+"%，女人数："+womancount+"人，"+womancount*100.0f/ncount+"%");
		for (Result result : resultlist) {
			System.out.println(result.toString());
		}
	}

}