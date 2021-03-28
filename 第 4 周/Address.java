
public class Address {
	private String country;
	private String province;
	private String city;
	private String street;
	private String postcode;
	
	public Address() {
		country="δ֪";
		province="δ֪";
		city="δ֪";
		street="δ֪";
		postcode="δ֪";
		
	}
	public Address(String country,String province,String city,String street,String postcode) {
		this.country=country;
		this.province=province;
		this.city=city;
		this.street=street;
		this.postcode=postcode;
	}
	public void Setcountry(String country) {
		this.country=country;
	}
	public String Getcountry(){
        return this.country;
	}
	public void Setprovince(String province) {
		this.province=province;
	}
	public String Getprovince() {
		return this.province;
	}
	public void Setcity(String city) {
		this.city=city;
	}
	public String Getcity() {
		return this.city;
	}
	public void Setstreet(String street) {
		this.street=street;
	}
	public String Getstreet() {
		return this.street;
	}
	public void Setpostcode(String postcode) {
		this.postcode=postcode;
	}
	public String Getpostcode() {
		return this.postcode;
	}
	public void DisplayAddress() {
		String add;
		add="contry:"+this.country;
		add+="province:"+this.province;
		add+="city:"+this.city;
		add+="street:"+this.street;
		add+="postcode:"+this.postcode;
		System.out.println(add);
	}
		
}	
