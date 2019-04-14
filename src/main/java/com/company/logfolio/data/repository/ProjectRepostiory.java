package com.company.logfolio.data.repository;

import com.company.logfolio.data.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepostiory extends CrudRepository<Project, Long> {

}
