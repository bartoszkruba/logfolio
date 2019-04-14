package com.company.logfolio.web.jsonObjects;

import com.company.logfolio.data.entity.Profile;

public class JsonProfile {
   private Long id;

   private String profileName;
   private String contactEmail;
   private String linkedin;
   private String github;
   private String phoneNumber;
   private String profilePicture;
   private String profileDescription;

   public JsonProfile(Profile profile) {
      populateObject(profile);
   }

   private void populateObject(Profile profile) {
      this.id = profile.getId();
      this.profileName = profile.getProfileName();
      this.contactEmail = profile.getContactEmail();
      this.linkedin = profile.getLinkedin();
      this.github = profile.getGithub();
      this.phoneNumber = profile.getPhoneNumber();
      this.profilePicture = profile.getProfilePicture();
      this.profileDescription = profile.getProfileDescription();
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getProfileName() {
      return profileName;
   }

   public void setProfileName(String profileName) {
      this.profileName = profileName;
   }

   public String getContactEmail() {
      return contactEmail;
   }

   public void setContactEmail(String contactEmail) {
      this.contactEmail = contactEmail;
   }

   public String getLinkedin() {
      return linkedin;
   }

   public void setLinkedin(String linkedin) {
      this.linkedin = linkedin;
   }

   public String getGithub() {
      return github;
   }

   public void setGithub(String github) {
      this.github = github;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getProfilePicture() {
      return profilePicture;
   }

   public void setProfilePicture(String profilePicture) {
      this.profilePicture = profilePicture;
   }

   public String getProfileDescription() {
      return profileDescription;
   }

   public void setProfileDescription(String profileDescription) {
      this.profileDescription = profileDescription;
   }
}
