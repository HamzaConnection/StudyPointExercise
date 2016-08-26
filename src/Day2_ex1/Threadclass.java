package Day2_ex1;



import java.io.IOException;
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
public class Threadclass extends Thread
{
String url;
private byte bytearray[];

public Threadclass(String url)
    {
        this.url = url;
    }

    

@Override
    public void run()
    {
        try
        {
            bytearray = bytecounter.getBytesFromUrl(url);
            
        } catch (IOException ex)
        {
            Logger.getLogger(Threadclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public int calculatesum()
    {
        int sum = 0; 
        for (int i = 0; i < bytearray.length; i++)
        {
            sum=sum + bytearray[i];
        }
        return sum;
    }
}

