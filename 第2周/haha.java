import java.util.Scanner;

public class haha {
	public static void main(String args[]) {
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入水仙花的位数:");
		int n = scan.nextInt();
		for (int number = (int) Math.pow(10, n - 1); number < Math.pow(10, n); number++) {
			int d = number;
			int sum = 0;
			while (d != 0) {
				i = d % 10;
				sum = (int) (sum + Math.pow(i, 3));
				d = d / 10;
			}
			if (sum == number) {
				System.out.println(number);
			}
			
		}
	}

}
