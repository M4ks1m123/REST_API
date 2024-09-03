package com.example.rest_api;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private final ProfileService profileService;

    public Controller(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("api/test/{resourceId}")
    public String getString(@PathVariable String resourceId){
        return("Sample String and id" + resourceId);
    }

    @PostMapping("/api/setProfile")
    public void receiveData(@RequestBody Profile profile){
        profileService.processProfile(profile);
    }
}



