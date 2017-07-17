package zlatopolsky;

public class Task_9153 {

    private int quantity = 0;
    private String text = new String("Над лесом кружился снег, а поодаль был слышен крик зверей");
    char[] arrayWithCharsFromText = text.toCharArray();

    public void findSequenceOfCharacters() {

        for (int i = 0; i < text.length() - 1; ++i) {
            if (arrayWithCharsFromText[i] == arrayWithCharsFromText[i + 1]) {
                quantity+=2;
                if(quantity>2){
                    --quantity;
                }
            }
        }
    }

    public void showResult() {
        System.out.print("Quantity of equal characters in sequence: " + quantity);
    }
}

