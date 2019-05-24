package model;

public class MaskedWord {
    private static final String MASK_CHARACTER = "*";
    private String word;
    private String maskedWord = "";

    public MaskedWord(String word) {
        this.word = word;

        for (int i=0; i<word.length(); i++){
            maskedWord += MASK_CHARACTER;
        }
    }

    public void addLetter(String letter){
        StringBuilder stringBuilder = new StringBuilder(maskedWord);

        for (int i = 0; i<word.length(); i++) {
            if(word.charAt(i) == letter.charAt(0)) {
                stringBuilder.setCharAt(i, letter.charAt(0));
            }
        }
        maskedWord = stringBuilder.toString();
    }

    public String getMaskedWord(){
        return maskedWord;
    }
}
