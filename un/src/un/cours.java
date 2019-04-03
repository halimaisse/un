package un;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class cours implements Serializable {
 private static final long serialVersionUID = 1L;
    int num;
    int hours;
    String name1;
    String mager1;
    courstime[] ct;
   public ArrayList<cours> B = new  ArrayList<>();

    cours() {
    }
    public int getNum() {
        return num;
    }

    public int getHours() {
        return hours;
    }

    public String getName1() {
        return name1;
    }

    public String getMager1() {
        return mager1;
    }

    public cours(int num, String name1, int hours, String mager1,courstime[] ct) {
        this.num = num;
        this.hours = hours;
        this.name1 = name1;
        this.mager1 = mager1;
         this.ct = ct;
    }

    public courstime[] getCt() {
        return ct;
    }
    int j=0;
    
  public void addcours()
  {
        Scanner r=new Scanner(System.in);
        j++;
        System.out.println("\n the id to cours.."+j);
        System.out.println(" \n plaes enter the name..");
        String n1=r.next(); 
        System.out.println(" \n the id to horse..");
        int h=r.nextInt();
        System.out.println(" \n plaes enter the mager..");
        String m1=r.next();
        courstime v = new courstime() ;
        courstime[] ct = new courstime[h];
        
        for(int i=0 ;i<h;i++)
        {
            v.add1();
            ct[i] = v;
        }
        cours sd = new cours(j, n1, h, m1, ct);
        
        B.add(sd);
        B.forEach((_item) -> {
            System.out.println(sd.getName1());
        });
          try {
			FileOutputStream f = new FileOutputStream(new File("C:\\Users\\BASEL ISSA\\Desktop\\f1.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(sd);
			

			o.close();
			f.close();
			
        } catch (IOException ex) {
           System.out.println(ex);
        } 
        
  }
  
  public ArrayList<cours> saerch(String std,ArrayList<cours> co)
  {
      ArrayList<cours> cour = new ArrayList<>();
      for(int i=0; i<co.size();i++ )
      {
          if((co.get(i).getMager1()).equals(std))
          {
             cour.add(co.get(i));
          } 
      }
      return cour;
  }
 
  }


    

