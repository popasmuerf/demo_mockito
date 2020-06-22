package io.thirdplanet.demo_mockito.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.thirdplanet.demo_mockito.services.FileService;
import io.thirdplanet.demo_mockito.services.UniversityAPIService;
import io.thirdplanet.demo_mockito.services.FileService;

@RestController
public class DemoController {
    @Autowired
    private FileService fileService;

    @GetMapping(value = "/gif")
    public byte[] getGif() throws IOException {
        return fileService.getBytes() ;
    }


    
}