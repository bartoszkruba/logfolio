package com.company.logfolio.web.service;

import com.company.logfolio.data.entity.Profile;
import com.company.logfolio.data.repository.ProfileRepostiory;
import com.company.logfolio.web.jsonObjects.JsonProfile;
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

   public JsonProfile findProfileById(Long id) {
      var result = profileRepostiory.findById(id);
      return result.isPresent() ? new JsonProfile(result.get()) : null;
   }

   public Profile saveProfile(Profile profile) {
      return profileRepostiory.save(profile);
   }
}
