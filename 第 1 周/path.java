import java.util.Scanner;

public class path {
	public static void main(String args[]) {
		float Meiyuan;
		
		float yibaimeifenNumber;
		float wushimeifenNumber;
		float ershimeifenNumber;
		float shimeifenNumber;
		float wumeifennumber;
		
		int yibaimeifen;
		int wushimeifen;
		int ershimeifen;
		int shimeifen;
		int wumeifen;
		
		yibaimeifen=100;
		wushimeifen=50;
		ershimeifen=20;
	    shimeifen=10;
	    wumeifen=5;
		
		Scanner scan= new Scanner(System.in);
	    System.out.println("��������������Ԫ��");
	    Meiyuan=scan.nextFloat();
	    yibaimeifenNumber=(int)Meiyuan*100/yibaimeifen;
	    wushimeifenNumber=(int)(Meiyuan*100%yibaimeifen)/wushimeifen;
	    ershimeifenNumber=(int)(Meiyuan*100%yibaimeifen%wushimeifen)/ershimeifen;
	    shimeifenNumber=(int)(Meiyuan*100%yibaimeifen%wushimeifen%ershimeifen)/shimeifen;
	    wumeifennumber=(int)(Meiyuan*100%yibaimeifen%wushimeifen%ershimeifen%shimeifen)/wumeifen;
	    
	    System.out.println("1��Ԫ�У�"+yibaimeifenNumber);
	    System.out.println("50�����У�"+wushimeifenNumber);
	    System.out.println("20�����У�"+ershimeifenNumber);
        System.out.println("10�����У�"+shimeifenNumber);
        System.out.println("5�����У�"+wumeifennumber);


	    
	    
	    
	    
		
	}
}
