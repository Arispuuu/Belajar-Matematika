package com.c.belajarmatematika.Kuis41;

public class Kuis41 {

    private String mQuestions[] = {

            "Soal 1",
            "Soal 2",
            "Soal 3",
            "Soal 4",
            "Soal 5",
            "Soal 6",
            "Soal 7",
            "Soal 8",
            "Soal 9",
            "Soal 10",

    };

    private String mChoice[] [] = {
            {"A","B","C"}, //soal 1
            {"A","B","C"}, //soal 2
            {"A","B","C"}, //soal 3
            {"A","B","C"}, //soal 4
            {"A","B","C"}, //soal 5
            {"A","B","C"}, //soal 6
            {"A","B","C"}, //soal 7
            {"A","B","C"}, //soal 8
            {"A","B","C"}, //soal 9
            {"A","B","C"}, //soal 10

    };

    private String mImages[] = {
            "ss10", // soal 10
            "ss14", // soal 14
            "ss2", // soal 2
            "ss12", // soal 12
            "ss4", // soal 4
            "ss9", // soal 9
            "ss6", // soal 6
            "ss15", // soal 15
            "ss7", // soal 7
            "ss5", // soal 5



    };

    private String mQuestionType[] = {
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",

    };

    private String mCorrectAnswers [] = {
            "A", // soal 10
            "C", // soal 14
            "C", // soal 2
            "A", // soal 12
            "A", // soal 4
            "B", // soal 9
            "B", // soal 6
            "C", // soal 15
            "C", // soal 7
            "B", // soal 5


    };

    public String getQuestions(int q) {
        String questions = mQuestions[q];
        return questions;
    }

    public String[] getChoice(int q) {
        String[] choice = mChoice[q];
        return choice;
    }

    public String getImages(int q) {
        String img = mImages[q];
        return img;
    }

    public String getType(int q) {
        String type = mQuestionType[q];
        return type;
    }

    public  int getLength(){
        return mQuestions.length;
    }

    public String getCorrectAnswers(int q) {

        String correct = mCorrectAnswers[q];

        return correct;
    }
}