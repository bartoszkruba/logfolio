package com.company.logfolio.bootstrap;

import com.company.logfolio.dao.entity.Profile;
import com.company.logfolio.dao.repository.ProfileRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertData implements CommandLineRunner {

   private ProfileRepostiory profileRepostiory;

   public InsertData() {
   }

   @Autowired
   public InsertData(ProfileRepostiory profileRepostiory) {
      this.profileRepostiory = profileRepostiory;
   }

   @Override
   public void run(String... args) throws Exception {
      Profile profile = new Profile();
      profile.setContactEmail("bartosz.kruba@gmail.com");
      profile.setEmail("bartosz.kruba@gmail.com");
      profile.setGithub("https://github.com/bartoszkruba");
      profile.setLinkedin("https://www.linkedin.com/in/bartosz-kruba-044ba6171/");
      profile.setName("Bartosz Kruba");
      profile.setProfilePicture("http://indol.se/wp-content/uploads/2017/04/profile-placeholder.png");
      profile.setPassword("password");
      profile.setProfileDescription("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?");

      profileRepostiory.save(profile);
   }
}
