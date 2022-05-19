package org.unibl.etf.pisio.am3;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    public String helloWorld(){
        return "Hello World from spring boot!";
    }
}
