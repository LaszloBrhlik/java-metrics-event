package com.greenfoxacademy.metrics.service;

import com.greenfoxacademy.metrics.repositories.MetricsRepository;
import org.hibernate.JDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

  private MetricsRepository metricsRepository;

  @Autowired
  public EventServiceImpl(MetricsRepository metricsRepository) {
    this.metricsRepository = metricsRepository;
  }

  @Override
  public boolean dbIsRunning() {
    try {
      metricsRepository.findAll();
      return true;
    } catch (JDBCException e) {
      return false;
    }
  }
}
