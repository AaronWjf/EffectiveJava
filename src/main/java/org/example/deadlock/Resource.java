package org.example.deadlock;


public class Resource {

    public static void main(String[] args) {
        final Resource resource1 = new Resource();
        Resource resource2 = new Resource();
        System.out.println("cc");

        new Thread(() -> {
            System.out.println(Thread.currentThread() + "waiting get resource1");
            synchronized (resource1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread() + "get resource2");

                }
            }
        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread() + "waiting get resource2");
            synchronized (resource2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource1");
                synchronized (resource1) {
                    System.out.println(Thread.currentThread() + "get resource1");

                }
            }
        }).start();
    }
}
