package week4;

public class EmployeeTest {
	public static void main(String []args) {
		Employee e1=new Employee();
		Employee e2=new Employee("002","xh",2000f,0.135f);
		float s1=e1.GetbaseSalary();
		System.out.println("Ա��һ��нǰ����:"+s1);
		float s2=e2.GetbaseSalary();
		System.out.println("Ա������нǰ���ʣ�"+s2);
		float i1=e1.GetsalaryIncrease();
		System.out.println("Ա��һ��нˮ�����"+i1);
		float i2=e2.GetsalaryIncrease();
		System.out.println("Ա������нˮ�����"+i2);
		e1.updataSalary();
		e2.updataSalary();
		s1=e1.GetbaseSalary();
		System.out.println("Ա��һ��н���ʣ�"+s1);
		s2=e2.GetbaseSalary();
		System.out.println("Ա������н���ʣ�"+s2);
		e1.DisplayEmployee();
		e2.DisplayEmployee();
	}

}
