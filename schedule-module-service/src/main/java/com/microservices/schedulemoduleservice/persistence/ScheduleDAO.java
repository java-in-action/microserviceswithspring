package com.microservices.schedulemoduleservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.schedulemoduleservice.beans.Port;

@Repository
public interface ScheduleDAO extends JpaRepository<Port, Integer>{

}
