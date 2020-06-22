package io.thirdplanet.demo_mockito.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceTest {
    @Mock
    DataService dataServiceMock ;


    @InjectMocks
    BusinessService businessImpl ;

    @Test
    public void testFindTheGreatestFromAllData(){
        when(dataServiceMock.retrieveAllData())
        .thenReturn(new int[]{24,15,3});

        assertEquals(24, businessImpl.findTheGreatestFromAllData());
    }

    /*
    @Test
    public void testFindTheGreatestFromAllData_ForOneValue(){
        when(dataServiceMock.retrieveAllData())
        .thenReturn(new int[] {15});
    }


    @Test
    public void testFindTheGreatestFromAllData_NoValues(){
        when(dataServiceMock.retrieveAllData())
        .thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData()) ;
    }
    */
}

