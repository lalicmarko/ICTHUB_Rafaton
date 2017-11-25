package rafaton_com.example.rafaton.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaton_com.example.rafaton.dao.EventDao;
import rafaton_com.example.rafaton.dao.UserDao;
import rafaton_com.example.rafaton.domain.Event;
import rafaton_com.example.rafaton.domain.EventDto;
import rafaton_com.example.rafaton.domain.EventUser;
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
    public EventUser saveEvent(EventUser eventUser) {
        Event event = new Event();
        Event eventFrom = eventUser.getEvent();
        event.setId(eventFrom.getId());
        event.setDate(eventFrom.getDate());
        event.setInfo(eventFrom.getInfo());
        event.setLocale(eventFrom.getLocale());
        event.setName(eventFrom.getName());
        event.setType(eventFrom.getType());
        event.setUrl(eventFrom.getUrl());
        event.setImages(eventFrom.getImages());
        event.setUserId(eventUser.getUserId());
        eventDao.insert(event);
        return eventUser;
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
