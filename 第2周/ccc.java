import java.util.Scanner;

public class ccc {
	public static void main(String[] a) {
		Scanner scan = new Scanner(System.in);
		String choose;
		do {
			int myNum, yourNum;
			myNum = 1 + (int) (Math.random() * 1000);
			// System.out.println(myNum);
			// Math.random()�����������0~1֮���С��

			System.out.println("�Ҹ���һ�����������Χ��0~1000֮��;");
			System.out.println("�������Ϸ������5�λ��ᣬ���������:");

			for (int i = 1; i <= 5; i++) {
				yourNum = scan.nextInt();

				if (yourNum == myNum) {
					System.out.println("��ϲ����¶���!");
					break;
				} else {
					if (yourNum < myNum)
						System.out.println("��µ���!");
					else
						System.out.println("��¸���!");
				}
				System.out.println("ʣ��²����Ϊ��" + (5 - i));
			}

			System.out.println("�Ƿ�����һ�Σ�(yes / no)");
			choose = scan.next();

		} while (choose.equals("yes"));
		System.out.println("��Ϸ����!");
	}
}
