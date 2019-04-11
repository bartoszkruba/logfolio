package com.company.logfolio.controller;

import com.company.logfolio.dao.entity.Profile;
import com.company.logfolio.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

   private ProfileService profileService;

   public ProfileController() {
   }

   @Autowired
   public ProfileController(ProfileService profileService) {
      this.profileService = profileService;
   }

   @GetMapping({"", "/"})
   public List<Profile> getAllProfiles() {
      return profileService.getAllProfiles();
   }

   @GetMapping("/{id}")
   public Profile getProfileById(@PathVariable Long id) {
      System.out.println(id);
      return profileService.findProfileById(id);
   }

   @PostMapping({"", "/"})
   public Profile postProfile(@RequestBody Profile profile) {
      System.out.println(profile);
      return profileService.saveProfile(profile);
   }
}
