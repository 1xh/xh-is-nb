package week11.vo;

public class Score {
	private String ids;
	private String course;
	private String score;
	public Score(String ids, String course,String score) {
		super();
		this.ids = ids;
		this.course = course;
		this.score = score;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [ids=" + ids + ", course=" + course + ", score=" + score + "]";
	}
}
