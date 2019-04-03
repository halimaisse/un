package un;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Un {
   
     
       public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
       
        student s=new student();
        cours c=new cours();
       // student s1=new student();
        Scanner b=new Scanner(System.in);
       /*  A.add(s);
         for(student a:A)
     {
         System.out.println(a.toString());
     }*/
       while(true)
       {   System.out.println("1: Add new student.."
               + "\n2: search the students.."
               + "\n3: Add new cours.."
               + "\n4:Add cours to student. ");
       int B=b.nextInt();
       
       switch(B)
       {
           case 1:
               s.addnewstudent();
         
               
               break;
           case 2:
            Scanner t=new Scanner(System.in);
            System.out.println("ples enter the name..");
            String f=t.next();
            
            for(int i=0 ; i < s.A.size() ; i++)
            {
                 if(( s.A.get(i).getName()).endsWith(f)== true)
                 {
                     System.out.println( "Result Saerch : \n" + s.A.get(i).toString());
                 
            
                 
                 }
            }
               break;    
               case 3:
               
                c.addcours();
               break;
           case 4:
                System.out.println("Enter the id student ");
               int id = b.nextInt();
              s.Add_student_coures(id, c, s);
               break;
       }
     } 
}
    
}

