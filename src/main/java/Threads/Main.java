package Threads;


public class Main {
    public static void main(String[] args) {

        //Murzik murzik = new Murzik();
        Barsik barsik = new Barsik();

        Thread thread = new Thread(barsik);
        //Thread thread1 = new Thread(murzik);
        thread.start();
        //thread1.start();



    }


}
