package com.c.belajarmatematika.Kuis51;

public class Kuis51 {

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
            "sb8", // soal 8
            "sb6", // soal 6
            "sb2", // soal 2
            "sb10", // soal 10
            "sb3", // soal 3
            "sb9", // soal 9
            "sb1", // soal 1
            "sb5", // soal 5
            "sb7", // soal 7
            "sb4", // soal 4



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
            "B", // soal 8
            "B", // soal 6
            "C", // soal 2
            "C", // soal 10
            "C", // soal 3
            "A", // soal 9
            "C", // soal 1
            "B", // soal 5
            "C", // soal 7
            "B", // soal 4




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
