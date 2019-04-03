package un;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class student  implements Serializable  {
    private static final long serialVersionUID = 1L;
   
    ArrayList<cours> D = new ArrayList<>();
    public  ArrayList<student> A=new  ArrayList<>();

 
    student() {}
      
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMager() {
        return mager;
    }

    public ArrayList<cours> getD() {
        return D;
    }

   

    public student(int id, String name, String mager) {
        this.id = id;
        this.name = name;
        this.mager = mager;
    }
    @Override
	public String toString() {
		return "Name:" + name + "\nId: " + id + "\nMager: " + mager;
        }
        int i=0;
    
     public void comber()
             { int j=0;
                 if(j<=0||j>=100000)
                     System.out.println("pleas enter the name agen..");
             }
     public void addnewstudent() throws ClassNotFoundException
    {
    
        Scanner a=new Scanner(System.in);
        i++;
        System.out.println("the id to student..\n"+i);
        System.out.println("plaes enter the name..");
        //comber();
        String n=a.next(); 
        System.out.println("plaes enter the mager..");
        String m=a.next();
        student stu = new student(i,n,m);
        // student s=new student();
        A.add(stu);
         A.forEach((_item) -> {
             System.out.println(stu.toString());
        });
          try {
			FileOutputStream f = new FileOutputStream(new File("C:\\Users\\BASEL ISSA\\Desktop\\f.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(o);
			
                        o.flush();
			o.close();
                        f.flush();
			f.close();
                        
                       FileInputStream f1 = new FileInputStream("C:\\Users\\BASEL ISSA\\Desktop\\f.txt");
			ObjectInputStream oi = new ObjectInputStream(f1);

			// Read objects
                        student s = (student) oi.readObject();
			System.out.println(s.toString());
			
                        
			oi.close();
			f1.close();
			
        } catch (IOException ex) {
           System.out.println(ex);
        } 
        
       /// return stu;
    }
    
     
    //  student s=new  student();
     //1 student s1=new  student();
      
       
      /* public void write() throws ClassNotFoundException
       {
       student s = addnewstudent();
     try {
			FileOutputStream f = new FileOutputStream(new File("C:\\Users\\BASEL ISSA\\Desktop\\f.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(s);

			o.close();
			f.close();
			
        } catch (IOException ex) {
           System.out.println(ex);
        }
    

       }*/
     
     
        public static void show() throws FileNotFoundException, ClassNotFoundException
     {
         try{
			FileInputStream f1 = new FileInputStream("C:\\Users\\BASEL ISSA\\Desktop\\f.txt");
			ObjectInputStream oi = new ObjectInputStream(f1);

			// Read objects
                        student s = (student) oi.readObject();
			System.out.println(s.toString());
			
                        
			oi.close();
			f1.close();
			
        }
        catch(IOException ex)
        {
           System.out.println(ex);
        }
         
     }
        public void delet()
        {
            Scanner e=new Scanner(System.in);
           
        }
        
        public student saerchstudent(int id ,ArrayList<student> stu)
        {
            student stu1 = new student();
            for(int i=0;i<stu.size();i++)
            {
                if(stu.get(i).getId() == id)
                {
                    stu1=stu.get(i);
                }
            }
            
            return stu1;
        }
        
        public void Add_student_coures( int id ,cours cou , student stu)
        {
            student stu1 = stu.saerchstudent(id, stu.A);
            ArrayList<cours> cou1 = cou.saerch(stu1.getMager(), cou.B);
            int x=1;
            for(int i=0 ; i<cou1.size();i++)
            {
                System.out.println(x++ +")[ Name coures : "+cou1.get(i).getName1()+"]  [" +cou1.get(i).getHours()+" : Hours ]");          }
        
            Scanner a=new Scanner(System.in);
            System.out.println(" Enter the number coures ");
            int s = a.nextInt();
            
             for(int i=0 ; i<cou1.size();i++)
             {
                 if( s-1 == i)
                 {
                     D.add(cou1.get(i));
                 }
             }
             
             
          for(int i=0 ; i<D.size();i++)
          {
              System.out.println(D.get(i).getName1());
          }
        
        
        }
        
        
        
           

        
            
}






























