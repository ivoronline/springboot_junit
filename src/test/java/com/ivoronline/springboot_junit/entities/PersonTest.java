package com.ivoronline.springboot_junit.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

  @Test
  void setName() {

    //PERFORM ACTION
    Person person = new Person();
           person.setName("john");

    //TEST RESULT
    assertEquals("JOHN", person.name);

  }

}
