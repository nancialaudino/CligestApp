package pt.iade.CliGest.models;


public class Login {
	private int pass;
	private String username;
	
	public Login(int pass, String username) {
		super();
		this.pass = pass;
		this.username = username;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String toString() {
		return  getUsername();
	}

}
