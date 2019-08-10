package com.dbs.queuechallenge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

	
	public List<String> addMessages(List<String> messages) {
		List<String> l = new ArrayList<String>() {{add("from add message");}};
		return l;
	}
	
	
	public List<String> deleteMessages(List<String> messages) {
		List<String> l = new ArrayList<String>() {{add("from delete message");}};
		return l;
	}
	
	public List<String> getMessages() {
		List<String> l = new ArrayList<String>() {{add("from get message");}};
		return l;
	}
	
	
	
	
}
