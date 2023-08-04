package com.edubridge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="member_table")
public class Member 
{
	@Id
	@SequenceGenerator(name = "member_seq", sequenceName = "member_seq", allocationSize = 1, initialValue = 2000)
	@GeneratedValue(generator = "member_seq")
	@Column(name="id")
	private long id;
	@Column(name="uname")
	private String uname;
	@Column(name="uadmid")
	private long uadmid;
	@Column(name="umail")
	@Email(message="Email is not valid!")
	private String umail;
	@Column(name="udep")
	private String udep;
	@Column(name="upassword")
	@NotEmpty
	@Size(min=8,message="Password must contain atleast 8 characters")
	@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
	private String upassword;
	@Column(name="ustatus")
	private int ustatus;
	@Column(name="urecstatus")
	private int urecstatus;
	@Column(name="ureqj")
	private String ureqj;
	@Column(name="urecj")
	private String urecj;
	
	
	public Member() 
	{
		super();
	}


	public Member(long id, String uname, long uadmid, String umail,
			String udep,String upassword,
			int ustatus, int urecstatus, String ureqj, String urecj) {
		super();
		this.id = id;
		this.uname = uname;
		this.uadmid = uadmid;
		this.umail = umail;
		this.udep = udep;
		this.upassword = upassword;
		this.ustatus = ustatus;
		this.urecstatus = urecstatus;
		this.ureqj = ureqj;
		this.urecj = urecj;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public long getUadmid() {
		return uadmid;
	}


	public void setUadmid(long uadmid) {
		this.uadmid = uadmid;
	}


	public String getUmail() {
		return umail;
	}


	public void setUmail(String umail) {
		this.umail = umail;
	}


	public String getUdep() {
		return udep;
	}


	public void setUdep(String udep) {
		this.udep = udep;
	}


	public String getUpassword() {
		return upassword;
	}


	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}


	public int getUstatus() {
		return ustatus;
	}


	public void setUstatus(int ustatus) {
		this.ustatus = ustatus;
	}


	public int getUrecstatus() {
		return urecstatus;
	}


	public void setUrecstatus(int urecstatus) {
		this.urecstatus = urecstatus;
	}


	public String getUreqj() {
		return ureqj;
	}


	public void setUreqj(String ureqj) {
		this.ureqj = ureqj;
	}


	public String getUrecj() {
		return urecj;
	}


	public void setUrecj(String urecj) {
		this.urecj = urecj;
	}

	
	
}