package week11.vo;

public class Result2 {
	private String course;
	private String avgscore;
	public Result2(String course, String avgscore) {
		super();
		this.course = course;
		this.avgscore = avgscore;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAvgscore() {
		return avgscore;
	}
	public void setAvgscore(String avgscore) {
		this.avgscore = avgscore;
	}
	@Override
	public String toString() {
		String so="";
		so=course+"\t"+avgscore;
		return so;
	}
}
