package com.conference.mgmt.rest.api.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Attendee {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "attendee_Sequence")
    @SequenceGenerator(name = "attendee_Sequence", sequenceName = "ATTENDEE_SEQ")
    private Long attendeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "company")
    private String company;

    @Column(name = "email")
    private String email;

    public Attendee() {
    }

    public Attendee(String name, String company, String email) {
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
}
