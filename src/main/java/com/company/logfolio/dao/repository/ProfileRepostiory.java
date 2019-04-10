package com.company.logfolio.dao.repository;

import com.company.logfolio.dao.entity.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepostiory extends CrudRepository<Profile, Long> {
}
