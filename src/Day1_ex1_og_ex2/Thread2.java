package Day1_ex1_og_ex2;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamzalaroussi
 */
public class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("number =" + 1);
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("number =" + 2);
       
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("number =" + 3);
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("number =" + 4);
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("number =" + 5);
    }
}
