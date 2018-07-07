package hyhjava.hibernate.dao;

public class User {

	private String passwprd;
	private Integer cardnumber;
	private String realname;
	private String virtualname;
	private Integer role;
	private String username;

	public void setPassword(String password) {
		this.passwprd=password;
	}

	public void setCardnumber(Integer cardnumber) {
        this.cardnumber=cardnumber;
		
	}

	public void setRealname(String realname) {
		this.realname=realname;
		
	}

	public void setVirtualname(String virtualname) {
		this.virtualname=virtualname;
		
	}

	public void setRole(Integer role) {
       this.role=role;
		
	}

	public void setUsername(String username) {
	this.username=username;
		
	}

}
