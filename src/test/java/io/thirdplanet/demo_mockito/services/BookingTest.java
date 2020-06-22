package io.thirdplanet.demo_mockito.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
public class BookingTest {
    @Test
    public void create_booking(){
        String RESOURCE_URI = "http://192.186.0.9:8088/app/bookings" ;

        HttpHeaders responseHeaders = new HttpHeaders() ;
        responseHeaders.setContentType(MediaType.APPLICATION_ATOM_XML);

        RestTemplate restTemplate = new RestTemplate() ;
        MockRestServiceServer mockServer = MockRestServiceServer.createServer(restTemplate);


 
        assert(true);
    }


}