package com.hyyercode.spring.demoapp.controller;

import java.util.List;
import com.hyyercode.spring.demoapp.model.AppUser;
import com.hyyercode.spring.demoapp.model.AppUserLogin;
import com.hyyercode.spring.demoapp.model.Appointment;
import com.hyyercode.spring.demoapp.repo.AppUserLoginRepo;
import com.hyyercode.spring.demoapp.repo.AppUserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:8080")
@CrossOrigin
@RestController
public class AppUserController {

    @Autowired
    AppUserRepo repo;

    //@Autowired
    //AppUserLoginRepo loginRepo;

    @GetMapping(value="/users")
    public List<AppUser> getAppUsers() {
        return repo.findAll();
    }

    @GetMapping(value="/user/{userid}")
    public AppUser getAppUser(@PathVariable(name="userid") int userId) {
        return repo.findById(userId).orElse(null);
    }

    @GetMapping(value="/user/{userid}/appointments")
    public List<Appointment> getAppUseAppointments(@PathVariable(name="userid") int userId) {
        return repo.getOne(userId).getAppointments();
    }

    @PostMapping(value="appointment")

    @GetMapping(value="/user/email/{firstname}")
    public List<AppUser> findAppUserByEmailAddress(@PathVariable(name="firstname") String firstname) {
        System.out.println(firstname);
        AppUser newUser = new AppUser();
        //newUser.setId(null);
        //newUser.setEmail(email); 
        newUser.setFirstName(firstname);
        return repo.findAll(Example.of(newUser));
    }

    @PostMapping(value="/user")
    public AppUser addAppUser(@RequestParam(name="firstname") String firstname, 
                                @RequestParam(name="lastname") String lastname,
                                @RequestParam(name="email") String email,
                                @RequestParam(name="username") String username,
                                @RequestParam(name="password") String password) {

        AppUser newUser = new AppUser();
        newUser.setFirstName(firstname);
        newUser.setLastName(lastname);
        newUser.setEmail(email);
        
        //Example<AppUser> appUserExample = Example.of(newUser);

        //if(repo.exists(Example.of(newUser))) {
           // return null;
        //} 

        return repo.saveAndFlush(newUser);
    }

    @PostMapping(value="/login")
    public AppUserLogin appLogin(@RequestParam(name="username") String username,@RequestParam(name="password") String password) {
       // return loginRepo.findByUsernameAndPassword(username, password);

        return null;
    }
    
}