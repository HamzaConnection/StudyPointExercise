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
public class Thread1 extends Thread
{
    public void run()
    {
        int i = 1;
        int sum = 0;
        while (i <= 100)
        {
            sum = sum + i;
            ++i;
            System.out.println("Sum = " + sum);
        }

    }
}
