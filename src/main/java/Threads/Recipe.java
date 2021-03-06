package Threads;

import java.io.IOException;

public class Recipe {

    public volatile static boolean flag = true;

    public static void main(String[] args) {

        new Recipe.ThreadFlagSetter().start();
        new Recipe.ThreadFlagReader().start();
    }

    public static class ThreadFlagSetter extends Thread {

        @Override
        public void run() {
            try {
                int k = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            flag = false;
            System.err.println("Flag now is false");
        }
    }

    public static class ThreadFlagReader extends Thread {

        @Override
        public void run() {
            System.err.println("waiting...");
            while (flag) {
            }
            System.err.println("Go go");
        }
    }
}
