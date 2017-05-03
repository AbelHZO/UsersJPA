package com.abelhzo.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USERSROLES database table.
 * 
 */
@Entity
@Table(name="USERSROLES")
@NamedQuery(name="Usersrole.findAll", query="SELECT u FROM Usersrole u")
public class Usersrole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsersrolePK id;

	public Usersrole() {
	}

	public UsersrolePK getId() {
		return this.id;
	}

	public void setId(UsersrolePK id) {
		this.id = id;
	}

}