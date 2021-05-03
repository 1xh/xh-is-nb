package week11.dao;

import java.util.ArrayList;
import java.util.Scanner;
import week11.vo.Result2;
import week11.vo.Result;
import week11.vo.Student;
import week11.vo.Score;

public class Scoredao {
	public static ArrayList<Student> read1(){
		ArrayList<Student> list=new ArrayList<Student>();
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入学生基本信息：（每个学生一行，输入格式为“学号，姓名，性别”)");
		String stuary="";
		while(!(stuary=scan.nextLine()).equals("end")){
			String array[]=stuary.split(",|，");
			Student student=new Student(array[0],array[1],array[2]);
			list.add(student);
		}
		return list;
	}
	public static ArrayList<Score> read2(){
		ArrayList<Score> list2=new ArrayList<Score>();
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入学生成绩：（每个成绩一行，输入格式为“学号，课程名称，成绩”)");
		String stuary="";
		while(!(stuary=scan.nextLine()).equals("end")){
			String array1[]=stuary.split(",|，");
			Score score=new Score(array1[0],array1[1],array1[2]);
			list2.add(score);
		}
		return list2;
	}
	public static int CountByid(ArrayList<Score> list2,String id){
		int count=0;
		for (Score score : list2) {
			String i=score.getIds();
			if(i.equals(id)) {
				count++;
			}
		}
		return count;
	}
	public static int CountBycourse(ArrayList<Score> list2,String course){
		int count=0;
		for (Score score : list2) {
			String scourse=score.getCourse();
			if(scourse.equals(course)) {
				count++;
			}
		}
		return count;
	}
	public static int avgscore(ArrayList<Score> list2,String id) {
		int num=0;
		for (Score score : list2) {
			String s=score.getIds();
			if(s.equals(id)) {
				int a=Integer.parseInt(score.getScore());
				num+=a;
			}
		}
		int b=CountByid(list2,id);
		return num/b;
	}
	
	public static int avgbycoure(ArrayList<Score> list2,String course) {
		int num=0;
		for (Score score : list2) {
			String s=score.getCourse();
			if(s.equals(course)) {
				int a=Integer.parseInt(score.getScore());
				num+=a;
			}
		}
		int b=CountBycourse(list2,course);
		return num/b;
	}
	public static ArrayList<Result> countbyscore(ArrayList<Student> list,ArrayList<Score> list2){
		ArrayList<Result> resultlist1=new ArrayList<Result>();
		for (int i = 0; i < list.size(); i++) {
			Student stu=list.get(i);
			String id=stu.getId();
			String name=stu.getName();
			String sex=stu.getSex();
			int avg=avgscore(list2,id);
			Result result=new Result(id,name,sex,String.valueOf(avg));
			resultlist1.add(result);
		}
		return resultlist1;
	}
	public static ArrayList<Result2> countbyscore2(ArrayList<Student> list,ArrayList<Score> list2){
		ArrayList<Result2> resultlist2=new ArrayList<Result2>();
		for(int j=0;j<list2.size();j++) {
			Score sco=list2.get(j);
			String coure=sco.getCourse();
			int avg=avgbycoure(list2,coure);
			Result2 result2=new Result2(coure,String.valueOf(avg));
			resultlist2.add(result2);
		}
		return resultlist2;
	}
	public static void dispaly(ArrayList<Student> list,ArrayList<Result> resultlist1,ArrayList<Result2> resultlist2){
		System.out.println("按学生统计：");
		System.out.println("学号"+"\t"+"姓名"+"\t"+"性别"+"\t"+"平均分");
		for (Result result : resultlist1) {
			System.out.println(result.toString());
		}
		System.out.println("按课程统计：");
		System.out.println("课程"+"\t"+"平均分");
		for (Result2 result2 : resultlist2) {
			System.out.println(result2.toString());
		}
	}
}
