package com.company.logfolio.service;

import com.company.logfolio.dao.entity.Profile;
import com.company.logfolio.dao.repository.ProfileRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

   private ProfileRepostiory profileRepostiory;

   @Autowired
   public AuthenticationService(ProfileRepostiory profileRepostiory) {
      this.profileRepostiory = profileRepostiory;
   }

   public boolean login(String email, String password) {
      Profile profile = profileRepostiory.findByEmailAndPassword(email, password);
      return profile != null;
   }
}
