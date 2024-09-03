package com.example.rest_api;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    public void processProfile(Profile profile){
        System.out.println("Processing the profile: " + profile);
    }
}
