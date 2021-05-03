package week12;

import java.util.ArrayList;

import week11.vo.Result;
import week11.vo.Result2;
import week11.vo.Score;
import week11.vo.Student;
import week11.dao.Scoredao;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> list=Scoredao.read1();
		ArrayList<Score> list2=Scoredao.read2();
		ArrayList<Result> resultlist1=Scoredao.countbyscore(list, list2);
		ArrayList<Result2> resultlist2=Scoredao.countbyscore2(list, list2);
		Scoredao.dispaly(list, resultlist1,resultlist2);
	}
}
