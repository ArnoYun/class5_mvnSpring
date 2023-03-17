package example.class5_controller.Controller;

import example.class5_controller.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class Controller{
    @GetMapping(value="/getuser{id}")
    public User getUser(@PathVariable int id){
        return new User("username", id);
    }
    @PostMapping(value="/signup")
    public ResponseEntity<String> signUp(@RequestBody User user){
        String userName = user.getUsername();
        return ResponseEntity.ok("User "+userName+" signed up successfully");
    }
}
