package com.company;

public class Character {
    public static int Life;
    public String name;
    public String group;

    public Character(String name, String group) {
        Life = 3;
        this.name = name;
        this.group = group;
    }
    public void deletelife(){
        Life--;
        if (Life<0){
            System.out.println("Вы проиграли и не стали чайным грибом(");
            System.exit(0);
        }
    }
}
