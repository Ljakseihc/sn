package by.my.sn.controller;

import by.my.sn.dao.UserDao;
import by.my.sn.entities.Role;
import by.my.sn.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;

//@RestController
//@RequestMapping("users")
public class HomeController {

//    private UserDao userDao;
//
//    @Autowired
//    public HomeController(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    @GetMapping("/list")
//    public ResponseEntity listUsers(){
//        List<User> users = userDao.findAll();
//        return ResponseEntity.ok(users);
//    }
//
//    @GetMapping("/add")
//    public ResponseEntity addUser(){
//        User user = userDao.save(new User("first", new HashSet<Role>()));
//        return ResponseEntity.ok(user);
//    }
}
