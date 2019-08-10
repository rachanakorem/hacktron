package com.dbs.queuechallenge.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
public class QueueController {
	
	@RequestMapping("/test")
	public String testApp() {
		return "you are in controller";
	}
	
	
	@GetMapping("/getAll")
	@ResponseBody
	public List<String> getAllQueues(){
		return new ArrayList<String>();
	}
	
	@PostMapping("/add")
	@ResponseBody
	public boolean addQueue(@RequestBody String queue) {
		return true;
		
	}
	
	@PostMapping("/delete")
	@ResponseBody
	public boolean deleteQueue(@RequestBody String queue) {
		return true;
	}
}
