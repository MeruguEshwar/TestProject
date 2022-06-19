package jsp.app.com.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
public class UserDetails implements Serializable {

	   
	@Id
	private String email;
	private String name;
	private String password;
	private static final long serialVersionUID = 1L;

	public UserDetails() {
		super();
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDetails [email=" + email + ", name=" + name + ", password=" + password + "]";
	}
	
   
}