package week4;

public class Employee {
	private String id;
	private String name;
	private float salaryIncrease;
	private float baseSalary;
	
	public Employee(){
		id="001";
		name="δ֪";
		baseSalary=1000f;
		salaryIncrease=0.035f;
	}
	public Employee(String id,String name,float baseSalary,float salaryIncrease ) {
		this.id=id;
		this.name=name;
		this.salaryIncrease=salaryIncrease;
		this.baseSalary=baseSalary;
	}
	public void Setid(String id) {
		this.id=id;
	}
	public String Getid() {
		return this.id;
	}
	public void Setname(String name) {
		this.name=name;
	}
	public String Getname() {
		return this.name;
	}
	public void SetsalaryIncrease(float salaryIncrease) {
		this.salaryIncrease=salaryIncrease;
	}
	public float GetsalaryIncrease() {
		return this.salaryIncrease;
	}
	public void SetbaseSalary(float baseSalary) {
		this.baseSalary=baseSalary;
	}
	public float GetbaseSalary() {
		return this.baseSalary;
	}
	public void updataSalary() {
		this.baseSalary=this.baseSalary*(1+this.salaryIncrease);
	}
	public void DisplayEmployee() {
		String s;
		s="id:"+this.id;
		s+="name:"+this.name;
		s+="baseSalary:"+this.baseSalary;
		s+="salaryIncrease:"+this.salaryIncrease;
		System.out.println(s);
	}

}
