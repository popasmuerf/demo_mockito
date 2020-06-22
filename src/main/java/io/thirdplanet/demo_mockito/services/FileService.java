package io.thirdplanet.demo_mockito.services;

import java.io.IOException;
import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
@Service
public class FileService {
    final Logger logger = LoggerFactory.getLogger(getClass());

   
     ResourceLoader resourceLoader;



    public byte[] getBytes() throws IOException {
        //Resource resource = new ClassPathResource("classpath:pet.store.gif");
        //InputStream inputStream = resource.getInputStream() ;

        Resource resource = resourceLoader.getResource("https://i.imgur.com/iipgZmh.gif");
        InputStream inputStream = resource.getInputStream();
       
        byte[] data = FileCopyUtils.copyToByteArray(inputStream);
        return  data ;

        //return null ;
    }





}