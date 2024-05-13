class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //First way
        Mythread thread1 = new Mythread();

        //second way
        Myrunnable runnable1 = new Myrunnable();
        Thread thread2 = new Thread(runnable1);

        //User thread vs daemon thread
        //thread1.setDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();
        try {
            thread1.join(); // Main thread will wait until the thread1 dies
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}