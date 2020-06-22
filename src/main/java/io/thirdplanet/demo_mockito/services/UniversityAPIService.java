package io.thirdplanet.demo_mockito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class UniversityAPIService {
    String URI = "http://universities.hipolabs.com/search?name=middle&country=turkey";
    
    //@Autowired 
    private RestTemplate restTemplate ;


    public UniversityAPIService(){
        restTemplate = new RestTemplate() ;
    }

    public String getRootResource(){
        String result = restTemplate.getForObject(URI,String.class) ;
        System.out.println("getRootResource: " + result);
        return result ;
    }

    public String addComment(String comment) {
        String result = null;
        try {
            result = restTemplate.postForObject("http://localhost/add-comment", comment, String.class);
            System.out.println("addComment: " + result);
        } catch (HttpClientErrorException e) {
            result = e.getMessage();
        }
         
        return result;
    }

}