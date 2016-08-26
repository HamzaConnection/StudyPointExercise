package Day1_ex1_og_ex2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamzalaroussi
 */
public class TaskEven extends Thread
{
  static Even even1 = new Even();
  
    public void  run()
    {
       
       
        while(0==0)
        {
          int i = even1.next();
        if (i%2==1)
        {
            System.out.println("not even number: " + i);
        }  
        
       }
        

    }  
}
