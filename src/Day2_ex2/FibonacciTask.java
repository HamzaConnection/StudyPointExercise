package Day2_ex2;


import java.util.ArrayList;
import java.util.List;

public class FibonacciTask extends Thread{
    private long tal;
    List<FibonacciObserver> observers = new ArrayList();
    
    public void registerFibonacciObserver(FibonacciObserver o){
      observers.add(o);
    }
    
    public FibonacciTask(long n) {
        this.tal = n;
    }
    @Override
    public void run() {
        long result = FibonacciFrame.fib(tal);
        
        for(FibonacciObserver observer : observers){
          observer.dataReady(result);
        }
    }
}
