package rafaton_com.example.rafaton.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import rafaton_com.example.rafaton.domain.Event;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventDao extends MongoRepository<Event, String>{


}
