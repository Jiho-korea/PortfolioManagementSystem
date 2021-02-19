package entity;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name="member")
@Setter
public class Member {
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	@Id
	private String id;
	@Column
	private String password;
	@Column
	private String name;
	
	
}
