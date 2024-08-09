package org.example;
class MyFirstRunnable implements Runnable{
    @Override
    public void run() {
        System.out.print("hi sister");
    }
}
public class ExtendThreadRunnableClass {
    public static void main(String args[]){
        MyFirstRunnable myFirstRunnable = new MyFirstRunnable();
        Thread thread = new Thread(myFirstRunnable);
        thread.start();
    }

}
