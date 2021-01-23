
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Gerardo Miguel Quechol Zarate        201768662
 * @version final 2
 * 
 */
public class XYComp {
    private MiX x;
    private MiY y;    
    
    private Lock mutex;
    
    private Semaphore sem;
    
    private Lock mutexVC;
    Condition cond;
    
    XYComp (){
        sem = new Semaphore(1);
        mutex = new ReentrantLock();
        mutexVC = new ReentrantLock();
        cond = mutexVC.newCondition();
    }
    public MiX getX() {
        return x;
    }
    public void setX(MiX x) {
        this.x = x;
    }
    public MiY getY() {
        return y;
    }
    public void setY(MiY y) {
        this.y = y;
    }
    //IPC's
    public void semAcquire(){
        try{
            sem.acquire();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void semRelease(){
        sem.release();
    }

    public void mutexLock(){
        mutex.lock();
    }
    
    public void mutexUnlock(){
        mutex.unlock();
    }
    
    public void vcLock(){
        mutexVC.lock();
    }
    public void vcUnlock(){
        mutexVC.unlock();
    }
    public void vcSignal(){
        try{
            cond.signal();
            //System.out.println("Hola");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void vcAwait(){
        try{
            cond.await();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
