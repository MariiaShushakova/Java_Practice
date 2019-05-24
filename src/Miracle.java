import model.DataSourse;
import model.Gamer;
import model.MaskedWord;
import utils.UIUtils;

public class Miracle {
    private Gamer gamer = new Gamer();
    private DataSourse ds = new DataSourse("C:/Users/Mariia_Shushakova/IdeaProjects/Miracle/src/words.txt");
    private MaskedWord maskedWord = new MaskedWord();

    public void start(){
        String word = ds.getRandomWord();

        String letter = UIUtils.readInput("Type letter: ");
        if(letter.length() !=1){
            UIUtils.output("Should be one letter!");
        }

        if (word.indexOf(letter) == -1){
            UIUtils.output("There in not such letter in word");
            gamer.decreaseAttempts();
        } else {
            System.out.println("Letter is right :)");
        }
    }
}
