package com.company.logfolio.web.service;

import com.company.logfolio.data.entity.Project;
import com.company.logfolio.data.repository.ProjectPagingRepository;
import com.company.logfolio.data.repository.ProjectRepostiory;
import com.company.logfolio.web.jsonObjects.JsonProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

   private ProjectRepostiory projectRepostiory;
   private ProjectPagingRepository projectPagingRepository;

   @Autowired
   public ProjectService(ProjectRepostiory projectRepostiory,
                         ProjectPagingRepository projectPagingRepository) {
      this.projectRepostiory = projectRepostiory;
      this.projectPagingRepository = projectPagingRepository;
   }

   public List<JsonProject> getAllProjects(int page) {
      List<JsonProject> projects = new ArrayList<>();
      Page<Project> generatedPage = projectPagingRepository.findAll(PageRequest.of(page, 5));
      generatedPage.forEach(project -> projects.add(new JsonProject(project)));
      return projects;
   }

   public JsonProject getProjectById(Long id) {
      Optional<Project> optionalProject = projectPagingRepository.findById(id);
      return optionalProject.isPresent() ? new JsonProject(optionalProject.get()) : null;
   }
}
