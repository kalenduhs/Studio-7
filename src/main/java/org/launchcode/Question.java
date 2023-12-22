package org.launchcode;

public abstract class Question {
    private String question;

    private int numAnswers;

    public Question(String question, int numAnswers) {
        this.question = question;
        this.numAnswers = numAnswers;
    }

    public abstract boolean checkAnswer(String userInput);

    //abstract validation method

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getNumAnswers() {
        return numAnswers;
    }

    public void setNumAnswers(int numAnswers) {
        this.numAnswers = numAnswers;
    }
}
