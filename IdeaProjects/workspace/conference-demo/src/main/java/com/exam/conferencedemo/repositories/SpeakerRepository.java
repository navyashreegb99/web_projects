package com.exam.conferencedemo.repositories;

import com.exam.conferencedemo.modules.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
