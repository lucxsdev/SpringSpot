package com.stream.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Favorite implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer favoritable_id;
	private String  favoritable_type;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Favorite() {
		
	}

	public Favorite(Integer id, Integer favoritable_id, String favoritable_type, User user) {
		super();
		this.id = id;
		this.favoritable_id = favoritable_id;
		this.favoritable_type = favoritable_type;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFavoritable_id() {
		return favoritable_id;
	}

	public void setFavoritable_id(Integer favoritable_id) {
		this.favoritable_id = favoritable_id;
	}

	public String getFavoritable_type() {
		return favoritable_type;
	}

	public void setFavoritable_type(String favoritable_type) {
		this.favoritable_type = favoritable_type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Favorite other = (Favorite) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
