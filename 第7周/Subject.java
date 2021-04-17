package week7;

public class Subject {
	private String subjectid;
	private String subjectname;
	private int max;

	public Subject(String subjectid, String subjectname, int max) {
		super();
		this.subjectid = subjectid;
		this.subjectname = subjectname;
		this.max = max;
	}
	public String getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	@Override
	public String toString() {
		return "Subject �γ�id=" + subjectid + ", �γ�����=" + subjectname + ", �������max=" + max + "";
	}

}
