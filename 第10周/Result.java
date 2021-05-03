package week10.vo;

public class Result {
	private String prvoince;
	private int count;
	private String names;
	public Result(String prvoince, int count, String names) {
		super();
		this.prvoince = prvoince;
		this.count = count;
		this.names = names;
	}
	public String getPrvoince() {
		return prvoince;
	}
	public void setPrvoince(String prvoince) {
		this.prvoince = prvoince;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	@Override
	public String toString() {
		return "Result [prvoince=" + prvoince + ", count=" + count + ", names=" + names + "]";
	}
	
}
