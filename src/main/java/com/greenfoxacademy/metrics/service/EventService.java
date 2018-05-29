package com.greenfoxacademy.metrics.service;

import org.springframework.stereotype.Service;

@Service
public interface EventService {

  public boolean dbIsRunning();
}
