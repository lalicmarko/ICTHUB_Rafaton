package rafaton_com.example.rafaton.service.impl;

import rafaton_com.example.rafaton.domain.Event;
import rafaton_com.example.rafaton.domain.EventDto;
import rafaton_com.example.rafaton.domain.User;

public interface UserService {
    public Iterable<User> findAll();
    public Event saveEvent(EventDto eventDto, Long userId);
    public User findById(Long id);
    public User checkEmailAndPassword(String email, String password);
    public User checkUsernameAndPassword(String username, String password);
}
