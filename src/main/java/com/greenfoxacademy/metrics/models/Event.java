package com.greenfoxacademy.metrics.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private LocalDateTime time;
  private String level;
  private String ServiceName;

  public Event() {
  }

  public Event(String level, String serviceName) {
    this.time = LocalDateTime.now();
    this.level = level;
    ServiceName = serviceName;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getServiceName() {
    return ServiceName;
  }

  public void setServiceName(String serviceName) {
    ServiceName = serviceName;
  }
}
