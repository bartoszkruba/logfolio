package com.company.logfolio.data.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Profile {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String profileName;
   private String contactEmail;
   private String linkedin;
   private String github;
   private String phoneNumber;

   @Column(columnDefinition = "BLOB")
   private String profilePicture;

   @Column(columnDefinition = "TEXT")
   private String profileDescription;
   private String email;
   private String password;

   @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL,
           fetch = FetchType.LAZY)
   @JsonBackReference
   private List<Project> projects = new ArrayList<>();

   public Profile() {

   }

   public void setId(Long id) {
      this.id = id;
   }

   public void setProfileName(String profileName) {
      this.profileName = profileName;
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

   public String getProfileName() {
      return profileName;
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

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public List<Project> getProjects() {
      return projects;
   }

   public void setProjects(List<Project> projects) {
      this.projects = projects;
   }
}
