package org.unibl.etf.pisio.am3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World from spring boot Bojaneee!";
    }
}
//mvn clean package