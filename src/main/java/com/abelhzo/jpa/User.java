package com.abelhzo.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the USERS database table.
 * 
 */
@Entity
@Table(name="USERS")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long iduser;

	private BigDecimal active;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private String celphone;

	private String email;

	private String firstlastname;

	private String genre;

	private String name;

	private String password;

	private Timestamp registerdate;

	private String secondlastname;

	private BigDecimal updatecount;

	private Timestamp updatedate;

	private String username;

	public User() {
	}

	public long getIduser() {
		return this.iduser;
	}

	public void setIduser(long iduser) {
		this.iduser = iduser;
	}

	public BigDecimal getActive() {
		return this.active;
	}

	public void setActive(BigDecimal active) {
		this.active = active;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCelphone() {
		return this.celphone;
	}

	public void setCelphone(String celphone) {
		this.celphone = celphone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstlastname() {
		return this.firstlastname;
	}

	public void setFirstlastname(String firstlastname) {
		this.firstlastname = firstlastname;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
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

	public Timestamp getRegisterdate() {
		return this.registerdate;
	}

	public void setRegisterdate(Timestamp registerdate) {
		this.registerdate = registerdate;
	}

	public String getSecondlastname() {
		return this.secondlastname;
	}

	public void setSecondlastname(String secondlastname) {
		this.secondlastname = secondlastname;
	}

	public BigDecimal getUpdatecount() {
		return this.updatecount;
	}

	public void setUpdatecount(BigDecimal updatecount) {
		this.updatecount = updatecount;
	}

	public Timestamp getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}