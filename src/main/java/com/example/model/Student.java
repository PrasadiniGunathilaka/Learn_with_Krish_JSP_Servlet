package com.example.model;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class Student {

  public List<String> getStudent(){

      List<String> students=new ArrayList<>();
      students.add("Maneesha");
      students.add("Kavee");
      students.add("Nisitha");

      return students;
  }



}
