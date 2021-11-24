package com.conference.mgmt.rest.api.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Talk {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "talk_Sequence")
    @SequenceGenerator(name = "talk_Sequence", sequenceName = "TALK_SEQ")
    private Long talkId;

    @Column(name = "title")
    private String title;

    @Column(name = "topic")
    private String topic;

    @Column(name = "roomNo")
    private int roomNo;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Talk_Attendee",
            joinColumns = { @JoinColumn(name = "talk_id") },
            inverseJoinColumns = { @JoinColumn(name = "attendee_id") }
    )
    private Set<Attendee> attendees;

    public Talk() {
    }

    public Talk(String title, String topic, int roomNo) {
        this.title = title;
        this.topic = topic;
        this.roomNo = roomNo;
    }

    public Long getTalkId() {
        return talkId;
    }

    public void setTalkId(Long talkId) {
        this.talkId = talkId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public Set<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(Set<Attendee> attendees) {
        this.attendees = attendees;
    }
}
