package com.company.logfolio.bootstrap;

import com.company.logfolio.data.entity.Profile;
import com.company.logfolio.data.entity.Project;
import com.company.logfolio.data.repository.ProfileRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

;

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
      profile.setPhoneNumber("11122233344");
      profile.setProfileName("Bartosz Kruba");
      profile.setProfilePicture("http://indol.se/wp-content/uploads/2017/04/profile-placeholder.png");
      profile.setPassword("password");
      profile.setProfileDescription("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?");

      Project project1 = new Project();
      project1.setProfile(profile);
      project1.setTitle("Four in Row");
      project1.setDescription("Connect Four web app/game programmed in javascript");
      project1.setProjectImage("https://www.logistec.com/wp-content/uploads/2017/12/placeholder.png");
      project1.setGithubPage("https://github.com/Tacofromhell/4InARow");

      profile.getProjects().add(project1);

      Project project2 = new Project();
      project2.setProfile(profile);
      project2.setTitle("Filmvisarna");
      project2.setDescription("Cinema Website. Shows info about upcomming movies and allow you to reserve tickets. Programmed with Vue.js on frontend and Node.js on backend with MongoDB database");
      project2.setProjectImage("https://www.logistec.com/wp-content/uploads/2017/12/placeholder.png");
      project2.setGithubPage("https://github.com/bartoszkruba/Filmvisarna");

      profile.getProjects().add(project2);

      Project project3 = new Project();
      project3.setProfile(profile);
      project3.setTitle("ChatMate");
      project3.setDescription("Online chat application created with web sockets and JavaFX");
      project3.setProjectImage("https://www.logistec.com/wp-content/uploads/2017/12/placeholder.png");
      project3.setGithubPage("https://github.com/doedmannen/ChatMate");

      profile.getProjects().add(project3);

      Project project4 = new Project();
      project4.setProfile(profile);
      project4.setTitle("SwedenBank");
      project4.setDescription("Banking application demo created with JDBC, MySQL and JavaFX. Implemented with my own ORM code");
      project4.setProjectImage("https://www.logistec.com/wp-content/uploads/2017/12/placeholder.png");
      project4.setGithubPage("https://github.com/bartoszkruba/SwedenBank");

      profile.getProjects().add(project4);

      profileRepostiory.save(profile);
   }
}
