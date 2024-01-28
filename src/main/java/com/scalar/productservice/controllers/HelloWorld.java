package com.scalar.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/hello")
public class HelloWorld {

@GetMapping( "/say/{name}/{times}")
    public String SayHello(@PathVariable("name") String name, @PathVariable("times") int times)
    {
      String ans="";
      for(int i=1;i<times;i++)
      {
          ans+="I hate you "+name;
          ans+="<br>";
      }
      return ans;
    }
}
