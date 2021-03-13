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
	    System.out.println("请输入数量的美元：");
	    Meiyuan=scan.nextFloat();
	    yibaimeifenNumber=(int)Meiyuan*100/yibaimeifen;
	    wushimeifenNumber=(int)(Meiyuan*100%yibaimeifen)/wushimeifen;
	    ershimeifenNumber=(int)(Meiyuan*100%yibaimeifen%wushimeifen)/ershimeifen;
	    shimeifenNumber=(int)(Meiyuan*100%yibaimeifen%wushimeifen%ershimeifen)/shimeifen;
	    wumeifennumber=(int)(Meiyuan*100%yibaimeifen%wushimeifen%ershimeifen%shimeifen)/wumeifen;
	    
	    System.out.println("1美元有："+yibaimeifenNumber);
	    System.out.println("50美分有："+wushimeifenNumber);
	    System.out.println("20美分有："+ershimeifenNumber);
        System.out.println("10美分有："+shimeifenNumber);
        System.out.println("5美分有："+wumeifennumber);


	    
	    
	    
	    
		
	}
}
