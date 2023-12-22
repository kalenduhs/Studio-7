package org.launchcode;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> listOfQuestions = new ArrayList<>();

    private int totalNumberOfQuestions = listOfQuestions.size();

//    public Quiz (ArrayList<Question> questions) {
//        this.listOfQuestions = questions;
//    }


    public void addQuestion(Question aQuestion) {
        listOfQuestions.add(aQuestion);
    }



    public ArrayList<Question> getListOfQuestions() {
        return listOfQuestions;
    }

    public void setListOfQuestions(ArrayList<Question> listOfQuestions) {
        this.listOfQuestions = listOfQuestions;
    }

    public int getTotalNumberOfQuestions() {
        return totalNumberOfQuestions;
    }

    public void setTotalNumberOfQuestions(int totalNumberOfQuestions) {
        this.totalNumberOfQuestions = totalNumberOfQuestions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "listOfQuestions=" + listOfQuestions +
                ", totalNumberOfQuestions=" + totalNumberOfQuestions +
                '}';
    }
}
