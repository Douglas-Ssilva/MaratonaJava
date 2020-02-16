package maratonajava.thread;
 
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite{
    private Map<String, String> map= new LinkedHashMap<>();
    
    public void put(String key, String value){
        this.map.put(key, value);
    }
    
    public Object[] getKeys(){
        return this.map.keySet().toArray();
    }
}

public class ClassReentrantReadWriteLock {
    private final static MapReadWrite mapReadWrite= new MapReadWrite();
    private final static ReentrantReadWriteLock rrw= new ReentrantReadWriteLock();
    
    public static void main(String... args) {
        Thread a= new Thread(new Write());
        Thread a1=new Thread(new ReadA()) ;
        Thread a2= new Thread(new ReadB()) ;
        a.start();
        a1.start();
        a2.start();
    }
    
    static class Write implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                rrw.writeLock().lock();
                try{
                    mapReadWrite.put(String.valueOf(i), String.valueOf(i));
                }finally{
                rrw.writeLock().unlock();
                    
                }
            }
        }
    }
    static class ReadA implements Runnable{
        @Override
        public void run() {
             for (int i = 0; i < 10; i++) {
                rrw.writeLock().lock();
                try{
                    System.out.println(Thread.currentThread().getName() +" "+ Arrays.toString(mapReadWrite.getKeys()) );
                }finally{
                rrw.writeLock().unlock();
                    
                }
            }
        }
        
    }
    static class ReadB implements Runnable{
        @Override
        public void run() {
             for (int i = 0; i < 10; i++) {
                rrw.writeLock().lock();
                try{
                    System.out.println(Thread.currentThread().getName() +" "+ Arrays.toString(mapReadWrite.getKeys()) );
                }finally{
                rrw.writeLock().unlock();
                    
                }
            }
        }
        
    }
    
}
