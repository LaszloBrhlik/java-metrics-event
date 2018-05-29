package com.greenfoxacademy.metrics.controllers;

import com.greenfoxacademy.metrics.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  private EventService eventService;

  @Autowired
  public MainRestController(EventService eventService) {
    this.eventService = eventService;
  }

  @GetMapping("/heartbeat")
  public ResponseEntity heartbeat() {
    if (eventService.dbIsRunning()) {
      return new ResponseEntity(HttpStatus.OK);
    }
    return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
