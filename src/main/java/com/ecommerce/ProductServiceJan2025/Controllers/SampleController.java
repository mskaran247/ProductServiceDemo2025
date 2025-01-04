package com.ecommerce.ProductServiceJan2025.Controllers;

import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")

public class SampleController {

    // localhost:8080/say/hello/Name/5

    @GetMapping("/hello/{name}/{limit}")
    public String SayHello(@PathVariable("name") String name,
                           @PathVariable("limit") int limit){
        StringBuilder output = new StringBuilder();
        for(int i = 0; i<limit; i++){
            output.append(" ");
            output.append("Hello "+ name);
        }
        return output.toString();
        //return "Hello " + name;
    }

    // localhost:8080/say/bye/Name/5

    @GetMapping("/bye/{name}/{limits}")
    public String SayBye(@PathVariable("name") String name,
                         @PathVariable("limits") int limits){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<limits; i++){
            ans.append(" ");
            ans.append("Bye ").append(name);
        }
        return ans.toString();
        //return "Bye ";
    }

    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome to my Rest API ";
    }
}
