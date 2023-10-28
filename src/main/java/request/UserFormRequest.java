package request;

import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;
import jakarta.persistence.Lob;

public class UserFormRequest {
	
    private int id;
	
	private String email;
	
	private String date;
	
	
	private List<String> hobbies;
	
	private String address;
	
	private String gender;
	
	
	private String state;
	
	
	private byte[] file;


	public UserFormRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserFormRequest(int id, String email, String date, List<String> hobbies, String address, String gender,
			String state, byte[] file) {
		super();
		this.id = id;
		this.email = email;
		this.date = date;
		this.hobbies = hobbies;
		this.address = address;
		this.gender = gender;
		this.state = state;
		this.file = file;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public byte[] getFile() {
		return file;
	}


	public void setFile(byte[] file) {
		this.file = file;
	}
	
	

}
