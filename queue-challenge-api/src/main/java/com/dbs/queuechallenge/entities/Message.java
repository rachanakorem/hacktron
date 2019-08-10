package com.dbs.queuechallenge.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_message_11")
public class Message implements Serializable {

	private static final long serialVersionUID = 6082885979551501188L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int msg_id;
	
	private String message;

	private String status;

	public int getMsg_id() {
		return msg_id;
	}

	public void setMsg_id(int msg_id) {
		this.msg_id = msg_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Message [msg_id=" + msg_id + ", message=" + message + ", status=" + status + "]";
	}
}
