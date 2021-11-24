package com.conference.mgmt.rest.api.response;

import java.util.Date;

public class AttendeeRequestResponseModel {
    private Long attendeeId;
    private String name;
    private String company;
    private String email;
    private Date registrationDate;

    public AttendeeRequestResponseModel(Long attendeeId, String name, String company, String email) {
        this.attendeeId = attendeeId;
        this.name = name;
        this.company = company;
        this.email = email;
    }

    public Long getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(Long attendeeId) {
        this.attendeeId = attendeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
