package db.db_lesson.service;

import db.db_lesson.UserDTO;
import db.db_lesson.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    //spring life cycle 공부하기

    public UserDTO insertUser(UserDTO user){
        return userRepository.insertUser(user);
    }
    //read
    public List<UserDTO> getAllUsers(){
        return userRepository.getAllUsers();
    }
    public UserDTO getUserByUserId(String userId){
        return userRepository.getUserByUserId(userId);
    }

    //update
    public void updateUserPw(String userId, UserDTO user){
        userRepository.updateUserPw(userId,user);
    }
    public void deleteUser(String userId){
        userRepository.deleteUser(userId);
    }

}
