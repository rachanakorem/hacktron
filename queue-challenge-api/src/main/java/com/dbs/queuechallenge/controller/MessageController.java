package com.dbs.queuechallenge.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.queuechallenge.service.MessageService;

@RestController
@RequestMapping("message")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/getAll")
	@GetMapping
	@ResponseBody
	public List<String> getMessagesByQueue() {
		return messageService.getMessages();
		
		
	}
	
	
	@RequestMapping("/add")
	@PostMapping
	@ResponseBody
	public List<String> addMessage( @RequestBody ArrayList<String> body){
		return messageService.addMessages(body);
	}
	
	
	
	@RequestMapping("/delete")
	@PostMapping
	@ResponseBody
	public List<String> deleteMessage( @RequestBody ArrayList<String> body){
		return messageService.deleteMessages(body);
	}
	
	

}