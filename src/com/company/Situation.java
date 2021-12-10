package com.company;

public class Situation {
    Situation[] direction;
    String subject,text;



    public int variants;
    public Situation (String subject, String text, int variants, int life2) {
        this.subject=subject;
        this.text=text;
        this.variants = variants;





        direction=new Situation[variants];
    }
}
