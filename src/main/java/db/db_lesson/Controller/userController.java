package db.db_lesson.Controller;

import db.db_lesson.UserDTO;
import db.db_lesson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    UserService userService;
    //CRUD
    //C->POST
    //R->GET
    //U->PUT
    //D->DELETE

    @PostMapping("")
    public UserDTO insertUser(@RequestBody UserDTO user){
        return userService.insertUser(user);
    }
    @GetMapping("")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{usersId}")
    public UserDTO getUserByUserId(@PathVariable String userId){ //userId가 파라미터로 매핑된다
        return userService.getUserByUserId(userId);
    }
    @PutMapping("/{userId}")
    public void updateUserPw(@PathVariable String userId, @RequestBody UserDTO user){
        userService.updateUserPw(userId, user);
    }
    @DeleteMapping("/{userId}")
    public void deleteUser(String userId){
        userService.deleteUser(userId);
    }
}
