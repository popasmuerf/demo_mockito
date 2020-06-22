package io.thirdplanet.demo_mockito.services;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.ExpectedCount.once;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.support.RestGatewaySupport;


import org.junit.Before;
import org.junit.After ;
import org.junit.Test;
import io.thirdplanet.demo_mockito.services.UniversityAPIService; 

@RunWith(SpringRunner.class)
@SpringBootTest
public class UniversityAPIServiceTest {
    //https://upcdatabase.org/api


    private String URL = "http://universities.hipolabs.com/search?name=middle&country=turkey";
    private String RESPONSE = "[{\"web_pages\": [\"http://www.metu.edu.tr/\"], \"state-province\": null, \"country\": \"Turkey\", \"domains\": [\"metu.edu.tr\"], \"name\": \"Middle East Technical University\", \"alpha_two_code\": \"TR\"}]";
    //@MockBean
    //RestTemplate restTemplate ;

    // the service to test
    @Autowired 
    UniversityAPIService univesityAPIService ;
   
    // note that this RestTemplate should be the one
    // used by UniversityAPI service
    @Autowired
    private RestTemplate restTemplate ;


    private MockRestServiceServer mockServer ;


    //@Autowired
    //private ObjectMapper objectMapper;



    //private RestGatewaySupport gateway ;

    @Before
    public void setUp(){
       // restTemplate = new RestTemplate();
       // server = MockRestServiceServer.bindTo(restTemplate).build();
       this.mockServer = MockRestServiceServer.createServer(this.restTemplate);
    }

    @After
    public void tearDown(){
        
    }

    @Test 
    public void testUniversityAPIService(){
        String serviceResponseBody = RESPONSE ;
        String url = URL ;

        this.mockServer.expect(requestTo(url))
        .andExpect(method(HttpMethod.GET))
        .andRespond(withSuccess(serviceResponseBody,MediaType.APPLICATION_JSON));

        String rsp = this.univesityAPIService.getRootResource();    
        System.out.println(rsp); 
        //assert(true);
    }
    

}