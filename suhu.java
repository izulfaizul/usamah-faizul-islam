/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;
import static java.awt.PageAttributes.MediaType.C;
import java.util.Scanner;

/**
 *
 * @author Hewlett-Packard
 */
public class suhu {
    Scanner scan = new Scanner(System.in); //membuat scanner baru dengan nama scan
    float c;
   
    
    /**
     *
     * @param c
     
     */
    public suhu(float c)
        {
            this.c = c;
          
        }
   
    double kelvin(){
       return((273.15 + c));   
    } 
    double fahrenheit()
    {
        return((c*1.8+32));
    }
    double reamur()
    {
       return ((c*0.8));
    }
    
   public String air()
            {
                
           if(c<=0)
        {
            return "beku";
        }
           else if(c>=100)
           {
               return "mendidih";
           }
           else
           {
               return "normal";
           }
            }

  
   
}

