package com.abelhzo.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ACCESSUSERS database table.
 * 
 */
@Entity
@Table(name="ACCESSUSERS")
@NamedQuery(name="Accessuser.findAll", query="SELECT a FROM Accessuser a")
public class Accessuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AccessuserPK id;

	private String ip;

	private BigDecimal sessionactive;

	public Accessuser() {
	}

	public AccessuserPK getId() {
		return this.id;
	}

	public void setId(AccessuserPK id) {
		this.id = id;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public BigDecimal getSessionactive() {
		return this.sessionactive;
	}

	public void setSessionactive(BigDecimal sessionactive) {
		this.sessionactive = sessionactive;
	}

}