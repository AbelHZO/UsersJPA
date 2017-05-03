package com.abelhzo.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the USERSROLES database table.
 * 
 */
@Embeddable
public class UsersrolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private long iduser;

	@Column(insertable=false, updatable=false)
	private long idrol;

	public UsersrolePK() {
	}
	public long getIduser() {
		return this.iduser;
	}
	public void setIduser(long iduser) {
		this.iduser = iduser;
	}
	public long getIdrol() {
		return this.idrol;
	}
	public void setIdrol(long idrol) {
		this.idrol = idrol;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsersrolePK)) {
			return false;
		}
		UsersrolePK castOther = (UsersrolePK)other;
		return 
			(this.iduser == castOther.iduser)
			&& (this.idrol == castOther.idrol);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.iduser ^ (this.iduser >>> 32)));
		hash = hash * prime + ((int) (this.idrol ^ (this.idrol >>> 32)));
		
		return hash;
	}
}