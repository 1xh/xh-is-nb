package week9;

public class Shangping {
	private String mingceng;
	private int shuxiang;
	private int dangjia;
	private String sno;
	public Shangping( String sno,String mingceng, int shuxiang, int dangjia) {
		super();
		this.mingceng = mingceng;
		this.shuxiang = shuxiang;
		this.dangjia = dangjia;
		this.sno = sno;
	}
	public String getMingceng() {
		return mingceng;
	}
	public void setMingceng(String mingceng) {
		this.mingceng = mingceng;
	}
	public int getShuxiang() {
		return shuxiang;
	}
	public void setShuxiang(int shuxiang) {
		this.shuxiang = shuxiang;
	}
	public int getDangjia() {
		return dangjia;
	}
	public void setDangjia(int dangjia) {
		this.dangjia = dangjia;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public int num(){
		return shuxiang*dangjia;
	}
	@Override
	public String toString() {
		String info="";
		info=sno+"\t"+mingceng+"\t"+shuxiang+"\t"+dangjia+"\t"+shuxiang*dangjia;
		return info;
	}
	
}
