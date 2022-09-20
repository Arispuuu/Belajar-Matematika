package com.c.belajarmatematika.Kuis31;

public class Kuis31 {
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
            "sk9", // soal 9
            "sk1", // soal 1
            "sk7", // soal 7
            "sk3", // soal 3
            "sk6", // soal 6
            "sk2", // soal 2
            "sk5", // soal 5
            "sk10", // soal 10
            "sk4", // soal 4
            "sk8", // soal 8


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
            "A", // soal 9
            "B", // soal 1
            "A", // soal 7
            "C", // soal 2
            "B", // soal 6
            "B", // soal 3
            "A", // soal 5
            "C", // soal 10
            "C", // soal 4
            "C", // soal 8



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