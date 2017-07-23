package Threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Supermarket {

    private static int summOfMoney = 30;

    public static void main(String[] args) {

        int userAnswer = 0;
        System.out.print("How many sausages Barsik should buy this time: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            userAnswer = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int quantityOfPurchases = userAnswer;
        for (int i = 0; i < quantityOfPurchases; ++i) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    buySausages();
                }
            }).start();
        }
    }

    private synchronized static void buySausages() {
        if (summOfMoney > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            summOfMoney -= 2;
            System.err.println("After purhase of sausages quantity of money is: " + summOfMoney);
        } else {
            System.err.println("Barsik doesn't have money");
        }
    }
}
