package Day1_ex4;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;



public class TurnstileCounter 
 {
  private AtomicInteger counter = new AtomicInteger(0);
     private final ReentrantLock lock = new ReentrantLock();

  
  static final long DELAY_VAL = 10000;
  long count = 0;

  public long getValue() {
    
      return count;
  }

  public  void  incr() {

/* you can also syn by writing syncynized before void in a method
the other way is to create an AtomicInteger like this private AtomicInteger counter = new AtomicInteger(0);
and then you can return the value of the counter like this counter.get(); to increment write counter.getAndIncrement();
To use  java.util.concurrent.locks.ReentrantLock you simply create private final ReentrantLock lock = new ReentrantLock();
      and then you can call lock.lock() so you lock everything until you call the lock.unlock. Make sure you make a try & finally like this
      lock.lock();
      try
      {
         count++; 
      } finally {
       lock.unlock();
     }

      */

lock.lock();
      try
      {
         count++; 
      } finally {
       lock.unlock();
     }

 

//counter.getAndIncrement();
  }
}
