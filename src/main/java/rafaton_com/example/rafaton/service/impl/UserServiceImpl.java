package rafaton_com.example.rafaton.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafaton_com.example.rafaton.dao.UserDao;
import rafaton_com.example.rafaton.domain.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public Iterable<User> findAll(){
        return userDao.findAll();
    }
    public Iterable<User> findById(Long id){
        return userDao.findById(id);
    }
}
