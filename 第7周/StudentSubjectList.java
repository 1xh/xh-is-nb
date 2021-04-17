package week7;

import java.util.Arrays;

public class StudentSubjectList {
	Student list[];
	Subject subject;
	int ncount;
	
	public StudentSubjectList(int max,Subject subject){
		list=new Student[max];
		this.subject=subject;
		ncount=0;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public boolean Add(Student student){
		if(student==null){
			return false;
		}
		if(list.length<=ncount){
			return false;
		}
		list[ncount]=student;
		ncount++;
		return true;
	}
	public boolean Remove(int index){
		if(index>=list.length||index<0){
			return false;
		}
		list[index]=list[index+1];
		list[index+1]=null;
		return true;
	}
	
	public int indexof(String id){
		for(int i=0;i<list.length&&list[i]!=null;i++){
			if(list[i].getId().equals(id)){
				return i;
			}
		}
		return -1;
	}
	public Student get(int index){
		return list[index];
	}
	public int size(){
		return ncount;
	}
	public String toString() {
		String msg="";
		msg=msg+subject.toString()+"\n"+"选课人数:"+ncount+"\n";
		msg=msg+"学号"+" "+"姓名"+"\n";
		for(int i=0;i<list.length&&list[i]!=null;i++){
			msg=msg+list[i].toString()+"\n";
		}
		return msg;
	}
}
