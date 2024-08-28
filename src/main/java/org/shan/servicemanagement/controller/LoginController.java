package org.shan.servicemanagement.controller;

import org.shan.servicemanagement.dto.LoginDto;
import org.shan.servicemanagement.dto.TaskDto;
import org.shan.servicemanagement.entity.PendingTask;
import org.shan.servicemanagement.response.LoginResponse;
import org.shan.servicemanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/")
    public String greeting(){
        return "WELCOME";
    }

    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto){
        LoginResponse lm = loginService.login(loginDto);
        return ResponseEntity.ok(lm);
    }


}
