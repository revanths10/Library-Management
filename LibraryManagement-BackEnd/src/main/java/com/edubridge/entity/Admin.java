package com.edubridge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="admin_table")
public class Admin {
	
	@Id
	@SequenceGenerator(name = "admin_seq", sequenceName = "admin_seq", allocationSize = 1, initialValue = 1000)
	@GeneratedValue(generator = "admin_seq")
	@Column(name="id")
	private long id;
	@Column(name="aname")
	@NotBlank
	@Size(min = 5,message="Name must contain atleast 5 characters")
	private String aname;
	@Column(name="amail")
	@NotBlank
	@Email(message="amail is not valid!")
	private String amail;
	@Column(name="apassword")
	@NotBlank
	@Size(min=8,message="Password must contain atleast 8 characters")
	@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
	private String apassword;
	
	public Admin() 
	{
		super();
	}

	public Admin(long id,String amail,String aname,String apassword) 
	{
		super();
		this.id = id;
		this.amail = amail;
		this.aname = aname;
		this.apassword = apassword;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAmail() {
		return amail;
	}

	public void setAmail(String amail) {
		this.amail = amail;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApassword() {
		return apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	
	
}