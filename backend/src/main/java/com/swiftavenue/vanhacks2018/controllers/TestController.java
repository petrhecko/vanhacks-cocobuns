package com.swiftavenue.vanhacks2018.controllers;

import java.util.List;
import com.swiftavenue.vanhacks2018.domain.Message;
import com.swiftavenue.vanhacks2018.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  private MessageService messageService;

  @RequestMapping(value = "/messages", method = RequestMethod.GET)
  public ResponseEntity<String> getMessages() {
    List<Message> messages = messageService.getMessages();
    return new ResponseEntity(messages, HttpStatus.ACCEPTED);
  }

  @RequestMapping(value = "/messages", method = RequestMethod.POST)
  public ResponseEntity<String> postMessage(@RequestBody Message message) {
    messageService.processMessage(message);
    return new ResponseEntity(HttpStatus.ACCEPTED);
  }


  // TODO: File upload
}
