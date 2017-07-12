package task_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {

    public String receiveUserInput() {

        String userAnswer = null;

        System.out.print("Enter your word:");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            userAnswer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userAnswer;
    }

    public StringBuilder createNewString(String answer) {

        char[] userAnswerArray = answer.toCharArray();
        StringBuilder newWord = new StringBuilder();

        for (int i = 0; i < answer.length(); ++i) {

            if (i % 2 == 0) {
                newWord.append(userAnswerArray[i]);
            }
        }
        return newWord;
    }

    public void showResult(StringBuilder word) {

        System.out.println(word);
    }

    public void executeFirstTask() {

        String userInput = receiveUserInput();
        StringBuilder newWord = createNewString(userInput);
        showResult(newWord);
    }
}