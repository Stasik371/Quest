package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Доброе утро, студент, ты попал на защиту 11-й практической работы по информатике." + "\n" + "Меня зовут Норица Вера Михайловна, рядом со мной Смирнов Сергей Сергеевич. Назови своё имя и группу, студент.");
        String n = s.next(), gr = s.next();
        Character studentIT = new Character(n, gr);
        Story story = new Story();
        int k = 0;
        Situation situation = story.getStart_story();
        Situation[] situations = situation.direction;
        story.pick(0);




            System.out.println("============="
                    + story.current_situation.subject + "==============");
            k++;
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================END!===================");
                System.out.println("Уважаемый студент" + n + "! группы " + gr + "\n" +
                        "Вы были отчислены из РТУ МИРЭА" + "\n" + "Поступите в нормальный вуз!");
                return;
            }
            int v=s.nextInt();
            story.go(v);
        System.out.println("============="
                + story.current_situation.subject + "==============");
        System.out.println(story.current_situation.text);
        if (v==2){
            story.pick(1);
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            k++;
            System.out.println(story.current_situation.text);
            story.go(s.nextInt());
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            k++;
            System.out.println(story.current_situation.text);
        }

        if (story.isEnd()) {
            System.out
                    .println("====================END!===================");
            System.out.println("Уважаемый студент " + n + "! группы " + gr + "\n" +
                    "Вы были отчислены из РТУ МИРЭА" + "\n" + "Поступите в нормальный вуз!");
            return;
        }
        else if(story.current_situation.variants==1){
            System.out
                    .println("====================END!===================");
            System.out.println("Уважаемый студент " + n + "! группы " + gr + "\n" +
                    "Вы закончили РТУ МИРЭА" + "\n" + "Вас не взяли на работу:( \n" + "Придется заново поступать в нормальный вуз:(");
            return;

        }


        }

    }




