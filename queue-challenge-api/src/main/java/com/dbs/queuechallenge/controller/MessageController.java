package com.dbs.queuechallenge.controller;

import java.util.List;

import javax.sound.sampled.AudioFormat.Encoding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.queuechallenge.entities.Message;
import com.dbs.queuechallenge.service.MessageService;

@RestController
@RequestMapping("message")
public class MessageController {

	@Autowired
	private MessageService messageService;

	@RequestMapping("/get/{qid}")
	@ResponseBody
	public List<Message> getMessagesByQueue(@PathVariable(name = "qid") int queueId) {
		return messageService.getMessage(queueId);

	}

	@RequestMapping("/add")
	@PostMapping(consumes = "application/json")
	@ResponseBody
	public String addMessage(@RequestBody Message message) {
		return messageService.addMessage(message.getMessage());
	}

	@RequestMapping("/delete/{qid}")
	@PostMapping
	@ResponseBody
	public String deleteMessage(@PathVariable(name = "qid") int queueId) {
		return messageService.deleteMessage(queueId);
	}

}
