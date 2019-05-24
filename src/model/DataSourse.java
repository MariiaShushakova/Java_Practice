package model;

import utils.MathUtil;
import utils.UIUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataSourse {
    List<String> words;

    public DataSourse(String filePath){
        try {
            words = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            UIUtils.output("Error when read file");
        }
    }

    public String getRandomWord(){
        return words.get(MathUtil.generateRundomNum(words.size()));
    }
}
