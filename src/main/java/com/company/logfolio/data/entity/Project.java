package com.company.logfolio.data.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Project {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String title;

   @Column(columnDefinition = "TEXT")
   private String description;

   private String projectImage;

   private String githubPage;

   @ManyToOne
   @JsonManagedReference
   private Profile profile;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getProjectImage() {
      return projectImage;
   }

   public void setProjectImage(String projectImage) {
      this.projectImage = projectImage;
   }

   public String getGithubPage() {
      return githubPage;
   }

   public void setGithubPage(String githubPage) {
      this.githubPage = githubPage;
   }

   public Profile getProfile() {
      return profile;
   }

   public void setProfile(Profile profile) {
      this.profile = profile;
   }
}
