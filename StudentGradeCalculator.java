import java.util.*;
public class StudentGradeCalculator {
   public static void main(String[] args)
   {
      HashMap<String,Double> results = new HashMap<>();
      Scanner sc = new Scanner(System.in);      
      System.out.println("Welcome to the Student Grade Calculator.");      
      System.out.println("Please enter the subject name then enter the mark afterwards separated by a comma.");
      System.out.println("e.g. Life Orientation,70");
      System.out.println("Enter 'done' when you're done");
      String input = "";
      String subject;
      double mark=0.0;
      int numSubjects = 4;
      results.put("Economic Management Sciences",50.0);
      results.put("Physical Sciences",50.0);
      results.put("Life Sciences",50.0);
      results.put("Afr",50.0);
      while (!input.equalsIgnoreCase("done")){
         input = sc.nextLine();
         if (!input.equalsIgnoreCase("done")){
            boolean insert = false;
            try {
               subject = input.substring(0,input.indexOf(","));
               mark = Integer.parseInt(input.substring(input.indexOf(",")+1));  
               results.put(subject, mark);
               System.out.println(mark +" added successfully.");
               numSubjects++;
            } catch (Exception e) {
               System.out.println("Error encountered!! Please try again and follow the specified format.");
            }
         }

      } 
      
      sc.close();
      System.out.println("--------------------------------------");
      System.out.printf("|%-30s |%4s|","Subject Name","Mark");
      System.out.println();
      System.out.println("--------------------------------------");
      double average = 0;
      for (String key: results.keySet()){
         System.out.printf("|%-30s |%-4.0f|",key,results.get(key));
         System.out.println();
         average+= results.get(key);
      }
      average = average/ numSubjects;
      System.out.println("--------------------------------------");  
      System.out.printf("|%-30s |%-4.0f|","Average Percentage Achieved",average);
      System.out.println();
      System.out.println("--------------------------------------");
      String grade;
      if ((average>=0) && (average<29)){
         grade = "F";
      }        
      else if ((average>=30) && (average<39)){
         grade = "E";
      }
      else if ((average>=40) && (average<49)){
         grade = "D";
      }      
      else if ((average>=50) && (average<59)){
         grade = "D";
      }      
      else if ((average>=60) && (average<69)){
         grade = "C";
      }      
      else if ((average>=70) && (average<79)){
         grade = "B";
      }      
      else if ((average>=80) && (average<89)){
         grade = "A";
      }      
      else {
         grade = "A+";
      }      
      System.out.printf("|%-30s |%-4s|","Grade",grade);
      System.out.println();
      System.out.println("--------------------------------------");      
   }
}