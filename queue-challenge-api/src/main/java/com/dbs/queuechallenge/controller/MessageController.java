package com.dbs.queuechallenge.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {
	
//	@Autowired
//	private MessageService messageService;
	
	@RequestMapping("/getAll")
	@GetMapping
	@ResponseBody
	public ResponseEntity<Object> getMessagesByQueue() {
		return ResponseEntity.ok(new String("hello"));
		
		
	}
	
	
	@RequestMapping("/add")
	@PostMapping
	@ResponseBody
	public ArrayList addMessage( @RequestBody ArrayList<String> body){
		return body;
	}
	
	
	
	@RequestMapping("/delete")
	@PostMapping
	@ResponseBody
	public ArrayList deleteMessage( @RequestBody ArrayList<String> body){
		return body;
	}
	
	

}
