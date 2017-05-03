package com.abelhzo.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "ROLES" database table.
 * 
 */
@Entity
@Table(name="\"ROLES\"")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idrol;

	private Timestamp registerdate;

	private String rol;

	private Timestamp updatedate;

	public Role() {
	}

	public long getIdrol() {
		return this.idrol;
	}

	public void setIdrol(long idrol) {
		this.idrol = idrol;
	}

	public Timestamp getRegisterdate() {
		return this.registerdate;
	}

	public void setRegisterdate(Timestamp registerdate) {
		this.registerdate = registerdate;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Timestamp getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}

}