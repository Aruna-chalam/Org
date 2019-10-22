package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo {
	

@RequestMapping("/demo")

   public String f1(){

      System.out.println("Hello Controller");

      return "display";

     

}

	

}
