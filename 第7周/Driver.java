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
		System.out.println("1.����������");
		System.out.println("2.���ѧ��");
		System.out.println("3.��ӡ����");
		System.out.println("4.��ѡ");
		System.out.println("5.�˳�");
		System.out.println("�������ѡ��");
		choice=scan.nextInt();
		return choice;
	}
	public static void createSubject(){
	    Subject sb=new Subject("001","java",10);
	    list=new StudentSubjectList(20,sb);
	    System.out.println("�����ɹ���");
	}
	public static void add(){
		if(list==null){
			System.out.println("����δ���������������ѧ��");
		}
		else{
			Scanner scan=new Scanner (System.in);
			System.out.println("����ѧ����id��������");
			String id=scan.next();
			String name=scan.next();
			Student s=new Student(id,name);
			list.Add(s);
			System.out.println("��ӳɹ���");
		}
		if(list.size()>=10){
			System.out.println("��ѧ������������ֹͣ���ѧ��");
		}
	}
	public static void tostring(){
	    System.out.println(list.toString());
	}
	public static void tuixuan(){
		Scanner scan=new Scanner (System.in);
		System.out.println("������ѡѧ����id");
		String id=scan.next();
		if(list.indexof(id)==-1){
			System.out.println("��ѧ��δѡ�˿Σ�");
		}
		else{
			int i=list.indexof(id);
			list.Remove(i);
			System.out.println("��ѡ�ɹ���");
		}
	}
}
