package com.company;

public class Story {
    private Situation start_story;
    public Situation current_situation;
    private Situation next_story;

    public Situation getStart_story() {
        return start_story;
    }


    Story() {

        start_story = new Situation(
                "Давайте проверим ваш отчет... ",
                "Вижу, что ваша функция не минимизирована, подковы в картах Карно замкнуты. "
                        + "Вам нужно переделать отчет.\n"
                        + "(1)Хорошо, Вера Михайловна, я переделаю, разрешите сдать на следующей неделе?.\n"
                        + "(2)Вера Михайловна, вы не правы, я все сделал правильно\n"
                        + "(3)Сергей Сергеевич, может мы пойдем пить чай? Зачем все эти отчеты\n",
                3, 0);
        start_story.direction[0] = new Situation(
                "Вы слабак, не достойны защитить 11 практику. ",
                "Неудачно вышло, придётся защищать работу у Карпова( "
                        + "Вы проиграли.", 0, 3
        );
        start_story.direction[1] = new Situation(
                "Вы разозлили Веру Михайловну.",
                "Вы сомневаетесь в моей правоте?"
                        + "Хорошо, давайте к следующему вопросу.",
                3, 1);

        start_story.direction[2] = new Situation(
                "Смирнов согласен",
                "Хорошо, сладкий, пойдем в мой кабинет.... \n"
                        + "Вы превратились в чайный гриб, вы победили!", 1, 2);

        next_story = new Situation(
                "Что бы вам задать...", "Хорошо, объясните мне как сделать двигатель внутреннего сгорания ЧУП43 из счетчиков?\n"
                + "(1)Я же обычный Мирэашный парень, какие счетчики, может лучше просто так баллы поставите?\n"
                + "(2)Давайте я вам лучше песню сыграю? \n"
                + "(3)Я всю теорию знаю, но эту не знаю( \n", 3, 0);
        next_story.direction[0] = new Situation(
                "Вы попытались втянуться в доверие к Норице.",
                "Ты хотел подлизаться ко мне?"
                        + "Ты проиграл, тебя отчислили из МИРЭА",
                0, 1);
        next_story.direction[1] = new Situation(
                "Вы начинаете петь панк рок",
                "Вере Михайловне Нравится и она засчитывает 11 практику на 100/100! Вы победили!!", 1, 1);
        next_story.direction[2] = new Situation(
                "Вы не записаны в качалку в Бутово",
                "Вера Михайловна отправила вас на пересдачу", 0, 1);


    }

    public void pick(int fl) {
        if (fl == 0) {
            current_situation = start_story;
        } else if (fl == 1) {
            current_situation = next_story;
        }

    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");

    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
