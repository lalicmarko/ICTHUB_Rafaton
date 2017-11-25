package rafaton_com.example.rafaton.service.impl;

import rafaton_com.example.rafaton.domain.Event;
import rafaton_com.example.rafaton.domain.EventDto;
import rafaton_com.example.rafaton.domain.EventUser;
import rafaton_com.example.rafaton.domain.User;

public interface UserService {
    public Iterable<User> findAll();
    public EventUser saveEvent(EventUser eventUser);
    public Iterable<Event> loadUserEvents(Long userId);
    public User findById(Long id);
    public User checkEmailAndPassword(String email, String password);
    public User checkUsernameAndPassword(String username, String password);
}
