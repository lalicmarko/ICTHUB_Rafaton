package rafaton_com.example.rafaton.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import rafaton_com.example.rafaton.domain.Event;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventDao extends MongoRepository<Event, String>{

    public List<Event> findByUserId(Long userId);


}
