package com.dbs.queuechallenge.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.queuechallenge.entities.QueueInfo;

@RestController
@RequestMapping("/queue")
public class QueueController {
	
	@RequestMapping("/test")
	public String testApp() {
		return "you are in controller";
	}
	
	
	@GetMapping("/getAll")
	@ResponseBody
	public List<QueueInfo> getAllQueues(){
		QueueInfo info = new QueueInfo(26, "Queue5", 5 );
		List<QueueInfo> list = new ArrayList<QueueInfo>();
		list.add(info);
		return list;
	}
	
	
	
	@PostMapping("/add")
	@ResponseBody
	public boolean addQueue(@RequestBody QueueInfo queue) {
		return true;
		
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public boolean deleteQueue(@RequestBody QueueInfo queue) {
		return true;
	}
}
