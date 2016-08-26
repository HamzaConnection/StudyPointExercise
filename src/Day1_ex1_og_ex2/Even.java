package Day1_ex1_og_ex2;


public class Even extends Thread
{

    private int n = 0;

    
    

    public synchronized int next()
    {
        n++;
        n++;
        return n;
    }
}
