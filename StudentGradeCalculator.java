import java.util.*;
public class StudentGradeCalculator {
   public static void main(String[] args)
   {
      int numSubjects = 0;
      String subject = "";
      double mark = 0;
      HashMap<String,Double> results = new HashMap<>();
      Scanner sc = new Scanner(System.in);      
      System.out.println("Welcome to the Student Grade Calculator.");      
      System.out.print("How many subjects would you like to enter? ");  
      numSubjects = sc.nextInt();
      System.out.println("Please enter the subject name then enter the mark afterwards.");
      for (int i=0;i<numSubjects;i++){
         System.out.print("Enter subject name: ");
         subject = sc.next();
         System.out.print("Enter the mark for the above subject: ");
         mark = sc.nextDouble();  
         results.put(subject, mark);
      }

      System.out.println(results);

   }
}