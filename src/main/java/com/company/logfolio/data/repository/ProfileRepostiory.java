package com.company.logfolio.data.repository;

import com.company.logfolio.data.entity.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepostiory extends CrudRepository<Profile, Long> {
   Profile findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
