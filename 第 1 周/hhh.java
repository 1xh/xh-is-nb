import java.util.Scanner;


public class hhh {
	public static void main(String args[]) {
		float length,width;
		String Leixing;
		String colour;
		int number;
		double price=0.0;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("请输入长度：");
		length=scan.nextFloat();
		System.out.println("请输入宽度：");
		width=scan.nextFloat();
		System.out.println("请选择画框类型：");
        Leixing=scan.next();
		System.out.println("请选择颜色：");
		colour=scan.next();
		System.out.println("皇冠的数量：");
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
		
		System.out.println("成本为："+price);
	}
	
	

}
