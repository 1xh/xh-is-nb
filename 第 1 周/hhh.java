import java.util.Scanner;


public class hhh {
	public static void main(String args[]) {
		float length,width;
		String Leixing;
		String colour;
		int number;
		double price=0.0;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("�����볤�ȣ�");
		length=scan.nextFloat();
		System.out.println("�������ȣ�");
		width=scan.nextFloat();
		System.out.println("��ѡ�񻭿����ͣ�");
        Leixing=scan.next();
		System.out.println("��ѡ����ɫ��");
		colour=scan.next();
		System.out.println("�ʹڵ�������");
		number=scan.nextInt();
		if(colour.compareTo("white")==0) {
			if(Leixing.compareTo("regular")==0) {
				price=((length+2)*2+width*2)*0.15+(0.02+0.07)*length*width+0.35*number;
			}
			if(Leixing.compareTo("fancy")==0) {
				price=((length+2)*2+width*2)*0.25+(0.02+0.07)*length*width+0.35*number;
			}	
		}
		
		if(colour.compareTo("white")!=0) {
		
            if(Leixing.compareTo("regular")==0) {
			    price=((length+2)*2+width*2)*(0.1+0.15)+(0.02+0.07)*length*width+0.35*number;
		    }
		    if(Leixing.compareTo("fancy")==0) {
			    price=((length+2)*2+width*2)*(0.1+0.25)+(0.02+0.07)*length*width+0.35*number;
		    }
		}
		
		System.out.println("�ɱ�Ϊ��"+price);
	}
	
	

}
