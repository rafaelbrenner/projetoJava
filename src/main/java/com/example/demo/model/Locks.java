package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_locks", schema = "core")
public class Locks implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cd_lock", nullable = false)
	private String cdLock;

	public String getCdLock() {
		return cdLock;
	}

	public void setCdLock(String cdLock) {
		this.cdLock = cdLock;
	}
}
