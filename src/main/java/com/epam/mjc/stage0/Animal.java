package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
        String pawNumbers = "paw";
        if(numberOfPaws>1){
            pawNumbers = "paws";
        }
        return "This animal is mostly "+color+ ". It has "+ numberOfPaws+" "+
                pawNumbers+" and "+ (hasFur? "a": "no")+" fur.";
    }
}
