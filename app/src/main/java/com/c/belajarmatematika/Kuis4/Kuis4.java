package com.c.belajarmatematika.Kuis4;

public class Kuis4 {

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
            "Soal 11",
            "Soal 12",
            "Soal 13",
            "Soal 14",
            "Soal 15",

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
            {"A","B","C"}, //soal 11
            {"A","B","C"}, //soal 12
            {"A","B","C"}, //soal 13
            {"A","B","C"}, //soal 14
            {"A","B","C"}, //soal 15

    };

    private String mImages[] = {
            "ko1", // soal 1
            "ko2", // soal 2
            "ko3", // soal 3
            "ko4", // soal 4
            "ko5", // soal 5
            "ko6", // soal 6
            "ko7", // soal 7
            "ko8", // soal 8
            "ko9", // soal 9
            "ko10", // soal 10
            "ko1", // soal 11
            "ko2", // soal 12
            "ko3", // soal 13
            "ko4", // soal 14
            "ko5", // soal 15

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
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
    };

    private String mCorrectAnswers [] = {
            "C", // soal 1
            "A", // soal 2
            "C", // soal 3
            "A", // soal 4
            "A", // soal 5
            "C", // soal 6
            "C", // soal 7
            "C", // soal 8
            "A", // soal 9
            "B", // soal 10
            "C", // soal 11
            "A", // soal 12
            "C", // soal 13
            "A", // soal 14
            "A", // soal 15

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