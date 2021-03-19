package com.ivoronline.springboot_junit.controllers;

import com.ivoronline.springboot_junit.entities.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {

    //CREATE PERSON
    Person person = new Person();
           person.setName("john");

    //GREET PERSON
    return "Hello " + person.name;

  }

}
