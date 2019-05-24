package model;

public class Gamer {
    private static final int ATTEMPTS_COUNT = 6;
    private int attempts;
    private String name;

    public Gamer(String name){
        attempts = ATTEMPTS_COUNT;
        this.name = name;
    }

    public Gamer(String name, int attempts){
        this.attempts = attempts;
        this.name = name;
    }

    public void decreaseAttempts(){
        attempts--;
    }

    ///Getters
    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }



}
