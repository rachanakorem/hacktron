package com.dbs.queuechallenge.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tab_queue_11")
public class QueueInfo implements Serializable {

	private static final long serialVersionUID = 1841795632977528725L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "queue_name")
	private String name;

	@Column(name = "queue_size")
	private int size;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "queue_ids")
	private List<Message> messages;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public QueueInfo(int id, String name, int size) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
	}

}