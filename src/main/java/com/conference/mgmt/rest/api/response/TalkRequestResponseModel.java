package com.conference.mgmt.rest.api.response;

import java.util.List;

public class TalkRequestResponseModel {
    private Long talkId;
    private String title;
    private String topic;
    private int roomNo;
    private List<AttendeeRequestResponseModel> attendees;

    public TalkRequestResponseModel(Long talkId, String title, String topic, int roomNo) {
        this.talkId = talkId;
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

    public List<AttendeeRequestResponseModel> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<AttendeeRequestResponseModel> attendees) {
        this.attendees = attendees;
    }
}
