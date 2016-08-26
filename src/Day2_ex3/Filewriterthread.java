/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2_ex3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author hamzalaroussi
 */
public class Filewriterthread extends Thread
{

    private void filewriter() throws InterruptedException
    {
        FileWriter writer;
        try
        {
            Thread.sleep(15000);
            String userDir = new JFileChooser().getFileSystemView().getDefaultDirectory().toString();
            writer = new FileWriter(userDir + "/Documents/backup.txt", false);
            PrintWriter out = new PrintWriter(writer);

            String loppedarray = "";
            
            for (int i = 0; i < TextWriterForm.lines.size(); i++)
            {
                
                 out.println(TextWriterForm.lines.get(i));
            }
            
            out.close();

        } catch (IOException ex)
        {
            System.out.println("File not found");
            Logger.getLogger(Filewriterthread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                filewriter();
            }
        } catch (InterruptedException ex)
        {
            System.out.println("File not found");
            Logger.getLogger(Filewriterthread.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}
