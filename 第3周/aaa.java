import java.util.Scanner;

public class aaa {
	public static void main(String args[]){
		float score[]=null;
		float avg,max,min;
		int choose=menu();
		while(choose!=5){
			switch(choose){
			case 1:input(score);
			       break;
			case 2:if(score==null){
				      System.out.println("�޳ɼ�����������ѧ���ɼ�");break;
			       }
				   avg=getAvg(score);
			       System.out.println("avg="+avg);break;
			case 3:if(score==null){
				      System.out.println("�޳ɼ�����������ѧ���ɼ�");
				      break;
			       }
				   max=getMax(score);System.out.println("max="+max);break;
			case 4:if(score==null){
				      System.out.println("�޳ɼ�����������ѧ���ɼ�");
				      break;
			       }
				   min=getMin(score);System.out.println("min="+min);break;
			default:System.out.println("��Ч����");
			}
			choose=menu();
		}
		System.out.println("bye!");
		
	}
	
	public static int menu(){
		int choose=0;
		System.out.println("Main menu");
		System.out.println("1.Enter Student Results");
		System.out.println("2.Class Average");
		System.out.println("3.Highest Grade");
		System.out.println("4.Lowest Grade");
		System.out.println("Exit");
		System.out.println("������(1-5):");
		
		Scanner scan=new Scanner(System.in);
		choose=scan.nextInt();
		
		return choose;
		
	}
	public static float input(float score[]){
		score=new float[5];
		for(int i=0;i<score.length;i++){
			System.out.println("����ɼ���");
			Scanner scan=new Scanner(System.in);
			score[i]=scan.nextFloat();
			if(score[i]<0||score[i]>100){
				System.out.println("�óɼ���Ч�����������룺");
				score[i]=scan.nextFloat();
			}
			
		}
		return 0;
	}
	public static float getAvg(float score[]){
		float avge;
		float sum=0f;
		score=new float[5];
		for(int i=0;i<score.length;i++){
			sum=sum+score[i];
			
		}
		avge=sum/score.length;
		return avge;
	}
	public static float getMax(float score[]){
		score=new float[5];
		float Max=score[0];
		for(int i=1;i<score.length;i++){
			if(Max<score[i]){
				Max=score[i];
			}
		}
		return Max;
	}
	public static float getMin(float score[]){
		score=new float[5];
		float Min=score[0];
		for(int i=1;i<score.length;i++){
			if(Min>score[i]){
				Min=score[i];
			}
		}
		return Min;
	}
	
}