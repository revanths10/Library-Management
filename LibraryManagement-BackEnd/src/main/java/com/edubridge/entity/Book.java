package com.edubridge.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="book_table")
public class Book 
{
	@Id
	@SequenceGenerator(name = "book_seq", sequenceName = "book_seq", allocationSize = 1, initialValue = 3000)
	@GeneratedValue(generator = "book_seq")
	@Column(name="bookId")
	private long id;
	@Column(name="btitle")
	private String btitle;
	@Column(name="bcatag")
	private String bcatag;
	@Column(name="bauthor")
	private String bauthor;
	@Column(name="bcopies")
	private int bcopies;
	@Column(name="bpub")
	private String bpub;
	@Column(name="pubname")
	private String pubname;
	@Column(name="bisbn")
	private String bisbn;
	@Column(name="byear")
	private String byear;
	@Column(name="bdate")
	private String bdate;
	@Column(name="bstatus")
	private String bstatus;
	
	public Book() 
	{
		super();
	}

	public Book(long id, String btitle, String bcatag, String bauthor, int bcopies, String bpub, String pubname,
			String bisbn, String byear, String bdate, String bstatus) {
		super();
		this.id = id;
		this.btitle = btitle;
		this.bcatag = bcatag;
		this.bauthor = bauthor;
		this.bcopies = bcopies;
		this.bpub = bpub;
		this.pubname = pubname;
		this.bisbn = bisbn;
		this.byear = byear;
		this.bdate = bdate;
		this.bstatus = bstatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcatag() {
		return bcatag;
	}

	public void setBcatag(String bcatag) {
		this.bcatag = bcatag;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public int getBcopies() {
		return bcopies;
	}

	public void setBcopies(int bcopies) {
		this.bcopies = bcopies;
	}

	public String getBpub() {
		return bpub;
	}

	public void setBpub(String bpub) {
		this.bpub = bpub;
	}

	public String getPubname() {
		return pubname;
	}

	public void setPubname(String pubname) {
		this.pubname = pubname;
	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	public String getByear() {
		return byear;
	}

	public void setByear(String byear) {
		this.byear = byear;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getBstatus() {
		return bstatus;
	}

	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}

}
