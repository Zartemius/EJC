package zlatopolsky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_9154 {

    private String userWord;
    private int quantityOfDifferentCharacters = 0;

    public void getUsersWord() {

        String usersOneWord = null;

        System.out.print("Enter your word:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            usersOneWord = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        userWord = usersOneWord;
    }

    public void findQuantityOfDifferentCharacters() {

        char[] arrayOfCharsFromWord = userWord.toCharArray();
        quantityOfDifferentCharacters = userWord.length();

        for (int i = 0; i < userWord.length(); ++i) {
            if (arrayOfCharsFromWord[0] == arrayOfCharsFromWord[i]) {
                --quantityOfDifferentCharacters;
            }
        }
    }

    public void showQuantityOfDifferentCharacters(){
        System.out.println("Quantity of different characters is: " + quantityOfDifferentCharacters);
    }
}


