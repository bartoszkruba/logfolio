package com.company.logfolio.web.jsonObjects;

import com.company.logfolio.data.entity.Project;

public class JsonProject {

   private Long id;

   private String title;

   private String description;

   private String projectImage;

   private String githubPage;

   private Long profileId;

   public JsonProject(Project project) {
      populateObject(project);
   }

   private void populateObject(Project project) {
      this.id = project.getId();
      this.title = project.getTitle();
      this.description = project.getDescription();
      this.profileId = project.getProfile().getId();
      this.githubPage = project.getGithubPage();
      this.projectImage = project.getProjectImage();
   }

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

   public Long getProfileId() {
      return profileId;
   }

   public void setProfileId(Long profileId) {
      this.profileId = profileId;
   }
}
