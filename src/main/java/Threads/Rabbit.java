package Threads;

import java.io.IOException;

/**
 * Created by artem on 18.07.17.
 */
public class Rabbit {

    public volatile static boolean flag = true;

    public static void main(String[] args) {

        new Rabbit.rabbieIsEatingCarrot().start();
        new Rabbit.stopDinnerofRabbit().start();
    }

    public static class rabbieIsEatingCarrot extends Thread {

        @Override
        public void run() {
            System.err.println("Rabbit is eating carrot");
            while (flag) {
            }
            System.err.println("Dinner of Rabit is over");
        }
    }

    public static class stopDinnerofRabbit extends Thread {
        @Override
        public void run() {
            System.err.println("Enter whatever you want to stop eating of carrot by the rabbit");
            try {
                int k = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            flag = false;
        }
    }
}
