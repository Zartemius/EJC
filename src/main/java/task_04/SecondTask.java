package task_04;


public class SecondTask {

    public StringBuilder makeTheWordReversed(String word) {

        word = word.replaceAll(" ", "");
        StringBuilder wordReversed = new StringBuilder(word);
        wordReversed.reverse();
        return wordReversed;
    }

    public StringBuilder updateOldWord(String word) {

        StringBuilder wordWithNewType = new StringBuilder(word.replaceAll(" ", ""));
        return wordWithNewType;
    }

    public void checkIfWordIsPalindrome(StringBuilder reversedWord, StringBuilder originalUpdatedWord) {

        if (originalUpdatedWord.equals(reversedWord)) {
            System.out.println("The word is palindrome");
        }
        else {
            System.out.println("The word is not palindrome");
        }
    }

    public void executeSecondTask() {

        String argentina = "АРГЕНТИНА МАНИТ НЕГРА";
        String priest = "ПОТ КАК ПОТОП";
        String rose = "А РОЗА УПАЛА НА ЛАПУ АЗОРА";

        StringBuilder newArgentina = makeTheWordReversed(argentina);
        StringBuilder newPriest = makeTheWordReversed(priest);
        StringBuilder newRose = makeTheWordReversed(rose);

        StringBuilder updatedArgentina = updateOldWord(argentina);
        StringBuilder updatedPriest = updateOldWord(priest);
        StringBuilder updatedRose = updateOldWord(rose);

        checkIfWordIsPalindrome(newArgentina, updatedArgentina);
        checkIfWordIsPalindrome(newPriest, updatedPriest);
        checkIfWordIsPalindrome(newRose, updatedRose);
    }

}
