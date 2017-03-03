import java.io.*;
import java.util.Scanner;
public class StudentTest {

   public static void main(String args[]) {
      String name;
      String major;
      String ID;
     
      /* Create first objects */
      Student stOne = new Student("james");
      // Invoking methods for each object created
      stOne.stdmajor("economy");
      stOne.stdID("b10409020");
      stOne.printStudent();

      Scanner sc_one = new Scanner(System.in) ;
      System.out.print("Enter name: ");
      name = sc_one.nextLine();
      
      Scanner sc_two = new Scanner(System.in) ;
      System.out.print("Enter major: ");
      major = sc_two.nextLine();
      
      Scanner sc_three = new Scanner(System.in) ;
      System.out.print("Enter ID: ");
      ID = sc_three.nextLine();
      
      Student stTwo = new Student(name);
      // Invoking methods for each object created
      stTwo.stdID(ID);
      stTwo.stdmajor(major);
      stTwo.printStudent();
   }
}