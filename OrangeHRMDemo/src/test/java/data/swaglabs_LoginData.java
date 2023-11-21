package data;

public class swaglabs_LoginData {
	private String TcID;
	private String username;
	private String password;
	
	public String getTcID() {
		return TcID;
	}
	public void setTcID(String tcID) {
		TcID = tcID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "swaglabs_LoginData [TcID=" +TcID+ ", username=" +username+", password" +password+ "]";
	}
}
