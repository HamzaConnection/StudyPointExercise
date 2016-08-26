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
public class Thread3 extends Thread
{

    public void run()
    {
        long startTime = System.currentTimeMillis(); //fetch starting time
        int i = 10;
        while (System.currentTimeMillis() - startTime < 10000)
        
        {
            System.out.println("task3 = " + i);
            try
            {
                Thread.sleep(3000);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
            }
            i++;

        }

    }
}
