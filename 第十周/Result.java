package week11.vo;

public class Result {
	private String id;
	private String name;
	private String sex;
	private String avgscore;
	public Result(String id, String name, String sex, String avgscore) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.avgscore = avgscore;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAvgscore() {
		return avgscore;
	}
	public void setAvgscore(String avgscore) {
		this.avgscore = avgscore;
	}
	@Override
	public String toString() {
		String info="";
		info=id + "\t" + name +" \t"+ sex +" \t" + avgscore ;
		return info;
	}
}
