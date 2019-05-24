package utils;

import java.util.Random;

public class MathUtil {
    public static int generateRundomNum(int maxRange){
        Random rand = new Random();
        return rand.nextInt(maxRange);
    }
}
