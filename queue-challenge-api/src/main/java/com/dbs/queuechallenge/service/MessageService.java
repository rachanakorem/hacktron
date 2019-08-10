package com.dbs.queuechallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Service;

import com.dbs.queuechallenge.entities.Message;
import com.dbs.queuechallenge.entities.QueueInfo;

@Service
public class MessageService {

	
	/*
	 * public List<Message> addMessages(List<Message> messages) { List<Message>
	 * message = new ArrayList<>(); return message; }
	 * 
	 * 
	 * public List<Message> deleteMessages(List<Message> messages) { List<Message>
	 * message = new ArrayList<>(); return message; }
	 * 
	 * public List<Message> getMessages() { List<Message> message = new
	 * ArrayList<>(); return message; }
	 * 
	 * 
	 * 
	 * 
	 */	@Autowired
	HibernateTransactionManager hibernateTransactionManager;

	public String addMessage(String message) {
		// TODO Auto-generated method stub
		if (message != null) {
			Message messageBean = new Message();
			messageBean.setMessage(message);
			messageBean.setStatus("initial");
			hibernateTransactionManager.getSessionFactory().getCurrentSession().saveOrUpdate(messageBean);
			return "Added Successfully";
		}
		return "";
	}

	public void updateMessage(int message_id, String message) {
		if (message != null) {
			Message messageBean = hibernateTransactionManager.getSessionFactory().getCurrentSession().get(Message.class,
					message_id);
			messageBean.setMessage(message);
			messageBean.setStatus("processing");
			hibernateTransactionManager.getSessionFactory().getCurrentSession().saveOrUpdate(messageBean);
		}

	}

	public String deleteMessage(int message_id) {
		String result = "FAILURE";
		Message messageBean = hibernateTransactionManager.getSessionFactory().getCurrentSession().get(Message.class,
				message_id);
		if (messageBean != null) {
			hibernateTransactionManager.getSessionFactory().getCurrentSession().delete(messageBean);
			result = "SUCCESS";
		}
		return result;
	}

	public List<Message> getMessage(int queue_id) {
		QueueInfo queue = hibernateTransactionManager.getSessionFactory().getCurrentSession().get(QueueInfo.class,
				queue_id);
		if (queue != null) {
			return queue.getMessages();
		}
		return null;
	}
	
}
