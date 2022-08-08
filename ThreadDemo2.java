import java.util.*;
import java.io.*;
import java.lang.*;

class ThreadDemo2 implements Runnable{
    public void run(){
        System.out.println("The name of the current thread is: "+Thread.currentThread().getName());
    }
    public static void main(String[] args){
        Thread t2=new Thread(new ThreadDemo2());
        t2.start();
    }
}
