/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utsuktakhatri
 */
class MyThread extends Thread {
    String mname;
    
    MyThread(String m){
        mname=m;
        
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println( mname + i);

            try {
                // Introducing a 500 milliseconds delay between iterations
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String args[]) {
        MyThread thread1 = new MyThread("t1");
        MyThread thread2 = new MyThread("t2");
        
        thread2.setPriority(10);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

