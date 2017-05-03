package com.abelhzo.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ACCESSUSERS database table.
 * 
 */
@Embeddable
public class AccessuserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long iduser;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date dateaccess;

	public AccessuserPK() {
	}
	public long getIduser() {
		return this.iduser;
	}
	public void setIduser(long iduser) {
		this.iduser = iduser;
	}
	public java.util.Date getDateaccess() {
		return this.dateaccess;
	}
	public void setDateaccess(java.util.Date dateaccess) {
		this.dateaccess = dateaccess;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccessuserPK)) {
			return false;
		}
		AccessuserPK castOther = (AccessuserPK)other;
		return 
			(this.iduser == castOther.iduser)
			&& this.dateaccess.equals(castOther.dateaccess);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.iduser ^ (this.iduser >>> 32)));
		hash = hash * prime + this.dateaccess.hashCode();
		
		return hash;
	}
}