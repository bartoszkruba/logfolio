package com.company.logfolio.data.repository;

import com.company.logfolio.data.entity.Project;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectPagingRepository extends PagingAndSortingRepository<Project, Long> {

}
