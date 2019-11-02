package com.hyyercode.spring.appointmenthero.repo;

import com.hyyercode.spring.appointmenthero.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Integer> {

}