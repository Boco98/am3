package org.unibl.etf.pisio.am3;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Am3Application {

    public static void main(String[] args) {
        SpringApplication.run(Am3Application.class, args);
    }
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setAmbiguityIgnored(true);//korisno kad imamo dosta stranih kljuceva
        return mapper;
    }


}
