package week10;

import java.util.ArrayList;
import week10.dao.Provincedao;
import week10.vo.Result;
import week10.vo.Student;

public class Drivier {
	public static void main(String []args){
		ArrayList<Student> list=Provincedao.read();
		ArrayList<Result> resultlist=Provincedao.countByprovince(list);
		Provincedao.dispaly(list, resultlist);
	}

}
