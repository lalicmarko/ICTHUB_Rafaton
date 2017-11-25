package rafaton_com.example.rafaton.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaton_com.example.rafaton.dao.EventDao;
import rafaton_com.example.rafaton.dao.UserDao;
import rafaton_com.example.rafaton.domain.Event;
import rafaton_com.example.rafaton.domain.EventDto;
import rafaton_com.example.rafaton.domain.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private EventDao eventDao;

    @Override
    public Iterable<User> findAll(){
        return userDao.findAll();
    }
    @Override
    public User findById(Long id){

        return userDao.findById(id);
    }

    @Override
    public Event saveEvent(EventDto eventDto) {
        Event event = new Event();
        event.setDate(eventDto.getDate());
        event.setInfo(eventDto.getInfo());
        event.setLocale(eventDto.getLocale());
        event.setName(eventDto.getName());
        event.setType(eventDto.getType());
        event.setUrl(eventDto.getUrl());
        event.setImages(eventDto.getImages());
        event.setUserId(eventDto.getUserId());
        eventDao.insert(event);
        return event;
    }

    @Override
    public Iterable<Event> loadUserEvents(Long userId) {
        return eventDao.findByUserId(userId);
    }

    public User checkEmailAndPassword(String email, String password) {
        return userDao.findByPasswordAndEmail(password, email);
    }

    @Override
    public User checkUsernameAndPassword(String username, String password) {
        return userDao.findByUsernameAndPassword(username, password);
    }
}
