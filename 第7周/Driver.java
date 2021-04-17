package week7;
import java.util.Scanner;
public class Driver {
	public static StudentSubjectList list;
	public static void main(String []args){
		int choice=menu();
		while(choice!=6){
			switch(choice){
			case 1:createSubject();break;
			case 2:add();break;
			case 3:tostring();break;
			case 4:tuixuan();break;
			case 5:break;
			default:break;
			}
			choice=menu();
		}
	}
	public static int menu(){
		int choice=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("1.创建新主题");
		System.out.println("2.添加学生");
		System.out.println("3.打印主题");
		System.out.println("4.退选");
		System.out.println("5.退出");
		System.out.println("输入你的选择：");
		choice=scan.nextInt();
		return choice;
	}
	public static void createSubject(){
	    Subject sb=new Subject("001","java",10);
	    list=new StudentSubjectList(20,sb);
	    System.out.println("创建成功！");
	}
	public static void add(){
		if(list==null){
			System.out.println("主题未创建，不能添加新学生");
		}
		else{
			Scanner scan=new Scanner (System.in);
			System.out.println("输入学生的id和姓名：");
			String id=scan.next();
			String name=scan.next();
			Student s=new Student(id,name);
			list.Add(s);
			System.out.println("添加成功！");
		}
		if(list.size()>=10){
			System.out.println("，学生数组已满，停止添加学生");
		}
	}
	public static void tostring(){
	    System.out.println(list.toString());
	}
	public static void tuixuan(){
		Scanner scan=new Scanner (System.in);
		System.out.println("输入推选学生的id");
		String id=scan.next();
		if(list.indexof(id)==-1){
			System.out.println("该学生未选此课！");
		}
		else{
			int i=list.indexof(id);
			list.Remove(i);
			System.out.println("推选成功！");
		}
	}
}
