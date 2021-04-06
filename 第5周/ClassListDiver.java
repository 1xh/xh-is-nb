package Week5;

import java.util.Scanner;

public class ClassListDiver {
	static public Scanner cin = new Scanner(System.in);
	static private ClassList L1 = null;
	public static void main(String a[]){
		chooseMenu();
		System.out.println("���������Ĳ���ѡ��");
		int choice = cin.nextInt();
		while(choice!=3){
			switch(choice){
			case 1: createList(); break;
			case 2: printList(); break;
			default: System.out.println("��Ч����"); 
			}
			System.out.println("�ٴ�����ѡ��");
			choice = cin.nextInt();
		}
		System.out.println("bye��");
	}
	
	static public void chooseMenu(){
		System.out.println("==========Holmesglen's computer system==========");
		System.out.println("1.create list");
		System.out.println("2.print list");
		System.out.println("3.exit");
		System.out.println("================================================");
	}
	
	static public void createList(){
		if(L1 != null) {
			System.out.println("�б��Ѵ�����ȷ������������(yes/no):");
			String temp = cin.next();
			if(temp.equals("no")){
				return;  //�˳�����
			}
		}
		
		System.out.println("����ѧ�꣺");
		int year = cin.nextInt();
		System.out.println("����ѧ��(1/2)��");
		int semester = cin.nextInt();
		
		System.out.println("����γ̺ţ�");
		String subId = cin.next();
		System.out.println("����γ�����");
		String subName = cin.next();
		Subject subj = new Subject(subId, subName);
		
		System.out.println("����ѧ��1��ѧ�ţ�");
		String stuId1 = cin.next();
		System.out.println("����ѧ��1��������");
		String stuName1 = cin.next();
		Student s1 = new Student(stuId1, stuName1);
		
		System.out.println("����ѧ��2��ѧ�ţ�");
		String stuId2 = cin.next();
		System.out.println("����ѧ��2��������");
		String stuName2 = cin.next();
		Student s2 = new Student(stuId2, stuName2);
		
		L1 = new ClassList(year, semester, subj, s1, s2);	
	}
	
	static public void printList(){
		if(L1 == null) {
			System.out.println("���ȴ����б�!");
			return;
		}
		System.out.println(L1.toString());
	}
}
