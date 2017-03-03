/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
public class Student {

   String name;
   String major;
   String ID;
   
   // constructor of the class student
   public Student(String name) {
      this.name = name;
   }
   // Assign the major of the student  to the variable major.
   public void stdmajor (String stdmajor){
       major= stdmajor;
   }
   // Assign the id of the student  to the variable student.
   public void stdID (String stdID){
       ID = stdID;
   }
   
   /* Print the result */
   public void printStudent() {
      System.out.println("Name:"+ name );
      System.out.println("Major:" + major );
      System.out.println("ID:"+ ID);
      
   }
}