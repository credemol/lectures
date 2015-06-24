package javaadv.collections;

import java.util.Date;

public class User implements Comparable<User>{
	private int id;
	private String userId;
	private String name;
	private Date registerDate;
	public User() {
		super();
	}
	public User(int id, String userId, String name, Date registerDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.registerDate = registerDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", name=" + name + ", registerDate=" + registerDate + "]";
	}
	@Override
	public int compareTo(User o) {
		return this.getRegisterDate().compareTo(o.getRegisterDate());
		//return 0;
	}
	
	
}
