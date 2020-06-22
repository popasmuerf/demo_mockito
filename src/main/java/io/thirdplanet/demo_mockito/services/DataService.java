package io.thirdplanet.demo_mockito.services;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {
    public int[] retrieveAllData(){
        return new int[] {1,2,3,4,5};
    }
}