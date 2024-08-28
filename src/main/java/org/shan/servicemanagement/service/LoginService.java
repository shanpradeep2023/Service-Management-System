package org.shan.servicemanagement.service;

import org.shan.servicemanagement.dto.LoginDto;
import org.shan.servicemanagement.response.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public LoginResponse login(LoginDto loginDto) {
        if(loginDto.getUsername()!=null && loginDto.getPassword()!=null){
            if(loginDto.getUsername().equals("admin") && loginDto.getPassword().equals("admin"))
                return new LoginResponse("Login Success",true);

            else
                return new LoginResponse("Login Failed",false);
        }
        else
            return new LoginResponse("No Details Entered",false);

    }
}
