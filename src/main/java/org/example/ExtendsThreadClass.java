package org.example;

class MyfirstThread extends Thread{
    @Override
    public void run() {
        System.out.println("hi fucker");
    }
}

public class ExtendsThreadClass {
    public static void main(String[] args) {
        MyfirstThread myfirstThread = new MyfirstThread();
        myfirstThread.start();
    }
}