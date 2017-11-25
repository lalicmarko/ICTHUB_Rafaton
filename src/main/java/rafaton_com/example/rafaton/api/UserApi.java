package rafaton_com.example.rafaton.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rafaton_com.example.rafaton.domain.Event;
import rafaton_com.example.rafaton.domain.EventDto;
import rafaton_com.example.rafaton.domain.User;
import rafaton_com.example.rafaton.service.impl.UserServiceImpl;

@RestController
public class UserApi {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value="/user/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Iterable<User> findAll(){
        return userService.findAll();
    }
//comit
    @RequestMapping(value="/event/saveEvent", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Event saveEvent(@RequestBody EventDto eventDto) {
        return userService.saveEvent(eventDto);
    }

    @RequestMapping(value="/user/loadUserEvents", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Event> loadUserEvents(Long userId){
        return userService.loadUserEvents(userId);
    }
    @RequestMapping(value="/user/findById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody User findById(Long id){
        return userService.findById(id);
    }
    @RequestMapping(value="/user/login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
        public  @ResponseBody User login(String username, String email, String password){
            if (username == null){
                return userService.checkEmailAndPassword(email, password);
            }
            else if (email == null){
                return userService.checkUsernameAndPassword(username, password);
            }
            else{
                return null;
            }
    }

}
