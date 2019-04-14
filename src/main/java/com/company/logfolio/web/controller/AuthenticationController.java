package com.company.logfolio.web.controller;

import com.company.logfolio.web.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthenticationController {

   private AuthenticationService authenticationService;

   @Autowired
   public AuthenticationController(AuthenticationService authenticationService) {
      this.authenticationService = authenticationService;
   }

   @GetMapping("login")
   public boolean login(@RequestParam String email, @RequestParam String password) {
      return authenticationService.login(email, password);
   }
}
