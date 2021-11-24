package com.conference.mgmt.rest.api.repository;

import com.conference.mgmt.rest.api.model.Attendee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendeeRepository  extends CrudRepository<Attendee, Long> {
    List<Attendee> findByAttendeeId(Long attendeeId);
}
