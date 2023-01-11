package entityClass;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ClientInfo
 *
 */
@Entity
@Table(name="client_info")
public class ClientInfo implements Serializable {

	@Id
	private int user_id;
	private String username;
	private String password;
	private int sms_credits;
	private String organizer;
	private String user_type;
	private int user_mobile;
	private String user_email;
	private static final long serialVersionUID = 1L;

	public ClientInfo() {
		super();
	}   
	public int getUser_id() {
		return this.user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public int getSms_credits() {
		return this.sms_credits;
	}

	public void setSms_credits(Integer sms_credits) {
		this.sms_credits = sms_credits;
	}   
	public String getOrganizer() {
		return this.organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}   
	public String getUser_type() {
		return this.user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}   
	public int getUser_mobile() {
		return this.user_mobile;
	}

	public void setUser_mobile(Integer user_mobile) {
		this.user_mobile = user_mobile;
	}   
	public String getUser_email() {
		return this.user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
   
}
