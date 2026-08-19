package com.unthinkable.meeting_summarizer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/meetings")
public class MeetingController {

    @GetMapping("/test")
    public String test() {
        return "Meeting Summarizer backend is running!";
    }
}