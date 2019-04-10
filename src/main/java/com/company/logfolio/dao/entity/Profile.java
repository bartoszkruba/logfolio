package com.company.logfolio.dao.entity;

import javax.persistence.*;

@Entity
public class Profile {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;
   private String contactEmail;
   private String linkedin;
   private String github;

   @Column(columnDefinition = "BLOB")
   private String profilePicture;

   @Column(columnDefinition = "TEXT")
   private String profileDescription;
   private String email;
   private String password;

   public Profile() {

   }

   public void setId(Long id) {
      this.id = id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setContactEmail(String contactEmail) {
      this.contactEmail = contactEmail;
   }

   public void setLinkedin(String linkedin) {
      this.linkedin = linkedin;
   }

   public void setGithub(String github) {
      this.github = github;
   }

   public void setProfilePicture(String profilePicture) {
      this.profilePicture = profilePicture;
   }

   public void setProfileDescription(String profileDescription) {
      this.profileDescription = profileDescription;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getContactEmail() {
      return contactEmail;
   }

   public String getLinkedin() {
      return linkedin;
   }

   public String getGithub() {
      return github;
   }

   public String getProfilePicture() {
      return profilePicture;
   }

   public String getProfileDescription() {
      return profileDescription;
   }
}
