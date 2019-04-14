package com.company.logfolio.web.controller;

import com.company.logfolio.web.jsonObjects.JsonProject;
import com.company.logfolio.web.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

   private ProjectService projectService;

   @Autowired
   public ProjectController(ProjectService projectService) {
      this.projectService = projectService;
   }

   @GetMapping({"", "/"})
   public List<JsonProject> getAllProjects(@RequestParam int page) {
      return projectService.getAllProjects(page);
   }

   @GetMapping("/{id}")
   public JsonProject getProject(@PathVariable Long id) {
      return projectService.getProjectById(id);
   }
}
