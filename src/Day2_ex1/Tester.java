package Day2_ex1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamzalaroussi
 */
public class Tester
{
    public static void main(String[] args) throws InterruptedException
    {
        Threadclass thread1 = new Threadclass("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        Threadclass thread2 = new Threadclass("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        Threadclass thread3 = new Threadclass("https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png");
        
        long start1 = System.nanoTime();
        thread1.start();
        thread2.start();
        thread3.start();
        long end1 = System.nanoTime();
        
        thread1.join();
        thread2.join();
        thread3.join();
        
        
        System.out.println("total = " + (thread1.calculatesum() + thread2.calculatesum() + thread3.calculatesum()));
        
        System.out.println("Time Sequental for .start(): "+(end1-start1));

        
        
        
        System.out.println("Avilable Processors: " + Runtime.getRuntime().availableProcessors());
        
        long start = System.nanoTime();
        thread1.run();
        thread2.run();
        thread3.run();
        long end = System.nanoTime();
        
        thread1.join();
        thread2.join();
        thread3.join();
        
        System.out.println("total = " + (thread1.calculatesum() + thread2.calculatesum() + thread3.calculatesum()));
        
        
        System.out.println("Time Sequental for .run(): "+(end-start));
        
        
    }
}
