import model.DataSourse;
import model.Gamer;
import model.MaskedWord;
import utils.UIUtils;

public class Miracle {
    private Gamer gamer = new Gamer("Mariia");
    private DataSourse ds = new DataSourse("C:/Users/Mariia_Shushakova/IdeaProjects/Miracle/src/words.txt");
    private MaskedWord maskedWord;

    public void start(){
        String word = ds.getRandomWord();

        maskedWord = new MaskedWord(word);

        while(gamer.getAttempts() > 0 && !word.equalsIgnoreCase(maskedWord.getMaskedWord())){
            UIUtils.output(maskedWord.getMaskedWord());

            String letter = UIUtils.readInput("Type letter: ");
            if(letter.length() !=1){
                UIUtils.output("Should be one letter!");
                continue;
            }

            if (word.indexOf(letter) == -1){
                UIUtils.output("There in not such letter in word");
                gamer.decreaseAttempts();
            } else {
                UIUtils.output("Letter is right :)");

                maskedWord.addLetter(letter);
            }
        }

        UIUtils.output("Game is over! " + gamer.getName() + " you " + (word.equalsIgnoreCase(maskedWord.getMaskedWord()) ? "win!" : "lose!"));

    }
}
