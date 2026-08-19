package com.unthinkable.meeting_summarizer.repository;

import com.unthinkable.meeting_summarizer.entity.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepository extends JpaRepository<Meeting, Long> {
}