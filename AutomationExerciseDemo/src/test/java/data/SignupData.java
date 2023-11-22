package data;

public class SignupData {

	private String tcId;
	private String summary;
	private String name;
	private String email;
	private String password;
	private String title;
	private String days;
	private String months;
	private String years;
	private String firstname;
	private String lastname;
	private String address;
	private String country;
	private String state;
	private String city;
	private String zipcode;
	private String mobilenumber;
	private String expectedResults;
	private String LinkedTcID;
	
	
	public String getTcId() {
		return tcId;
	}
	public void setTcId(String tcId) {
		this.tcId = tcId;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getMonths() {
		return months;
	}
	public void setMonths(String months) {
		this.months = months;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getLinkedTcID() {
		return LinkedTcID;
	}
	public void setexpectedResults(String expectedResults) {
		LinkedTcID = expectedResults;
	}
	public String getexpectedResults() {
		return LinkedTcID;
	}
	public void setLinkedTcID(String expectedResults) {
		LinkedTcID = expectedResults;
	}
	
	
	@Override
	public String toString() {
		return "SignupData [tcId=" + tcId + ", summary=" + summary + ", name=" + name + ", email=" + email
				+ ", password=" + password + ", title=" + title + ", days=" + days + ", months=" + months + ", years="
				+ years + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", country="
				+ country + ", state=" + state + ", city=" + city + ", zipcode=" + zipcode + ", mobilenumber="
				+ mobilenumber + ", expectedResults=" + expectedResults + ", LinkedTcID=" + LinkedTcID + "]";
	}
	
	
	
	
}
