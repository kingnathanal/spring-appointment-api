package com.hyyercode.spring.demoapp.repo;

import com.hyyercode.spring.demoapp.model.AppUserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserLoginRepo extends JpaRepository<AppUserLogin, Integer> {

    AppUserLogin findByUsernameAndPassword(String username, String password);
}