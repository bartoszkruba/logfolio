package com.company.logfolio.web.service;

import com.company.logfolio.data.entity.Profile;
import com.company.logfolio.data.repository.ProfileRepostiory;
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
