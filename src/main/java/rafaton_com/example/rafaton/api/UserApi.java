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

    @RequestMapping(value="/event/saveEvent", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Event saveEvent(@RequestBody EventDto eventDto, Long customerId){
        return userService.saveEvent(eventDto, customerId);
    }








}
