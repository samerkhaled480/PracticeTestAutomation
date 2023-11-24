package data;

public class LoginData {

	private String TcId;
	private String summary;
	private String name;
	private String email;
	private String password;
	private String expectedResults;
	private String LinkedTcID;
	
	
	public String getTcId() {
		return TcId;
	}
	public void setTcId(String tcId) {
		this.TcId = tcId;
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
	public String getLinkedTcID() {
		return LinkedTcID;
	}
	public void setexpectedResults(String LinkedTcID) {
		this.LinkedTcID = LinkedTcID;
	}
	public String getexpectedResults() {
		return LinkedTcID;
	}
	public void setLinkedTcID(String expectedResults) {
		this.LinkedTcID = expectedResults;
	}
	
	@Override
	public String toString() {
		return "LoginData [tcId=" + TcId + ", summary=" + summary + ", name=" + name + ", email=" + email
				+ ", password=" + password + ", expectedResults=" + expectedResults + ", LinkedTcID=" + LinkedTcID
				+ "]";
	}
	
	
	
	
	
}
