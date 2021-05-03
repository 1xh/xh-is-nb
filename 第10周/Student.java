package week10.vo;

public class Student {
	private String id;
	private String name;
	private String gender;
	private String prvoince;
	public Student(String id, String name, String gender, String prvoince) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.prvoince = prvoince;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPrvoince() {
		return prvoince;
	}
	public void setPrvoince(String prvoince) {
		this.prvoince = prvoince;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", prvoince=" + prvoince + "]";
	}
	
	

}
