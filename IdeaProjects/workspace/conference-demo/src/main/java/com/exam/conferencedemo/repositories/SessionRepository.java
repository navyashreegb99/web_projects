package com.exam.conferencedemo.repositories;

import com.exam.conferencedemo.modules.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
