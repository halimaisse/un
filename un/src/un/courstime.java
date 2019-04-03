/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package un;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author BASEL ISSA
 */
public class courstime implements Serializable{
     private static final long serialVersionUID = 1L;
    String day;
     String hores;

    public courstime(String day, String hores) {
        this.day = day;
        this.hores = hores;
    }
    
  public courstime() {}
  
    public String getDay() {
        return day;
    }

    public String getHores() {
        return hores;
    }
      public courstime add1()
    {
         
             String [] a = {"set","sun","mon","tue","wen","thu","fri"};
             String [] b = {"8-9","9-10","10-11","11-12","12-1","1-2","2-3"};
             String day ="" , tim="";
             System.out.println("plase enter the day chois...\n"
                     + "\n1:set"
                     + "\n2:sun"
                     + "\n3:mon"
                     + "\n4:tue"
                     + "\n5:wen"
                     + "\n6:thu"
                     + "7:fri");
              Scanner f=new   Scanner(System.in);
              int s=f.nextInt();
              for(int i=0 ; i<a.length;i++)
              {
                  if(i == s-1)
                  {
                     day = a[i]; 
                  }
              }
             System.out.println("plase enter the hours chois...\n"
                     + "\n1:8-9"
                     + "\n2:9-10"
                     + "\n3:10-11"
                     + "\n4:11-12"
                     + "\n5:12-1"
                     + "\n6:1-2"
                     + "\n7:2-3:");
             int e=f.nextInt();
             
             for(int i=0 ; i<b.length;i++)
              {
                  if(i == e-1)
                  {
                     tim = b[i]; 
                  }
              }
               courstime time = new courstime(day,tim);
               return time;
         }
    } 
    

