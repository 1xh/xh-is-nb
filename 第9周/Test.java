package week9;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������Ʒ����,��Ʒ����,��Ʒ������");
		String outinfo="";
		String a=scan.next();
		int sq=0;
		int Sum=0;
		while(!a.equals("0000")){
		String array[]=a.split(",|��");
		String m=array[0];
		String n=array[1];
		String d=array[2];
		int num=Integer.parseInt(n);                                                                               
		int dan=Integer.parseInt(d);                                                              
		String sno=GregorianCalendar(String.valueOf(sq));
		Shangping s=new Shangping(sno,m,num,dan);
		outinfo=outinfo+s.toString()+'\n';
		a=scan.next();
		sq++;
		Sum+=num;
		}
		System.out.println("��ˮ��\t\t��Ʒ����\t����\t��Ʒ����\t�ܼ�");
		outinfo+="�ܼƣ� �����ܼƣ�"+sq+"����������"+Sum+"���۽�";
		System.out.println(outinfo);
	}
	public static String GregorianCalendar(String beforesno){
		String sno="";
		SimpleDateFormat df=new SimpleDateFormat("yyyMMdd");
		String p=df.format(new Date());
		String newsno=String.valueOf(Integer.parseInt(beforesno)+1);
		String zero="";
		int zerocount=4-newsno.length();
		for(int i=0;i<zerocount;i++){
			zero="0"+zero;
		}
		sno=p+zero+newsno;
		return sno;
	}

}
