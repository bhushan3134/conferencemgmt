package com.conference.mgmt.rest.api.resources;

import com.conference.mgmt.rest.api.model.Attendee;
import com.conference.mgmt.rest.api.model.Talk;
import com.conference.mgmt.rest.api.repository.AttendeeRepository;
import com.conference.mgmt.rest.api.repository.TalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/conference")
public class ConferenceResource {

    @Autowired
    private TalkRepository talkRepository;

    @Autowired
    private AttendeeRepository attendeeRepository;

    @PostConstruct
    public void init() {
        Talk talk = new Talk("Java8", "Lambda", 10);
        talkRepository.save(talk);

        Attendee attendee = new Attendee("Bhushan Mandlik", "Oracle", "bhushan@oracle.com");
        attendeeRepository.save(attendee);
    }

    @GetMapping("/talk/{id}")
    public Talk getTalk(@PathVariable(name="id") Long talkId) {
        List<Talk> talks =  talkRepository.findByTalkId(talkId);
        return talks.get(0);
    }

    @GetMapping("/attendee/{id}")
    public Attendee getAttendee(@PathVariable(name="id") Long attendeeId) {
        List<Attendee> attendees = attendeeRepository.findByAttendeeId(attendeeId);
        return attendees.get(0);
    }

    @PostMapping("/talk")
    public Talk addTalk(@RequestBody Talk talk) {
        return talkRepository.save(talk);
    }

    @PostMapping("/attendee")
    public Attendee addAttendee(@RequestBody Attendee attendee) {
        return attendeeRepository.save(attendee);
    }

    @PostMapping("/talk/{talkId}/attendee/{attendeeId}")
    public Attendee addAttendeeInTalk(@PathVariable Long talkId, @PathVariable Long attendeeId) {
        Talk talk = talkRepository.findByTalkId(talkId).get(0);
        Attendee attendee = attendeeRepository.findByAttendeeId(attendeeId).get(0);
        Set attendees = talk.getAttendees();
        if(attendees != null) attendees.add(attendee);
        else new HashSet<Attendee>().add(attendee);
        return attendeeRepository.save(attendee);
    }
}
