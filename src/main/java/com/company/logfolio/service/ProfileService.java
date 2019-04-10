package com.company.logfolio.service;

import com.company.logfolio.dao.entity.Profile;
import com.company.logfolio.dao.repository.ProfileRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

   private ProfileRepostiory profileRepostiory;

   @Autowired
   public ProfileService(ProfileRepostiory profileRepostiory) {
      this.profileRepostiory = profileRepostiory;
   }

   public ProfileService() {
   }

   public List<Profile> getAllProfiles() {
      return (List<Profile>) profileRepostiory.findAll();
   }

   public Profile findProfileById(Long id) {
      var result = profileRepostiory.findById(id);
      return result.isPresent() ? result.get() : null;
   }
}
