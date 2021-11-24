package com.conference.mgmt.rest.api.repository;

import com.conference.mgmt.rest.api.model.Talk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TalkRepository extends CrudRepository<Talk, Long> {
    List<Talk> findByTalkId(long talkId);
}
