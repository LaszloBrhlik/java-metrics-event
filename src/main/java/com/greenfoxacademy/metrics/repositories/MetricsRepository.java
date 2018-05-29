package com.greenfoxacademy.metrics.repositories;

import com.greenfoxacademy.metrics.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface MetricsRepository extends CrudRepository<Event, Long> {
}
