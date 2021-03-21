package com.ivoronline.springboot_junit.entities;

import com.ivoronline.springboot_junit.controllers.MyController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

  @Test
  void hello() {

    //PERFORM ACTION
    MyController myController = new MyController();
    String       result       = myController.hello();

    //TEST RESULT
    assertEquals("Hello from Controller", result);

  }

}
