package org.launchcode;

public class TrueFalse extends Question {

private String isCorrect;

public TrueFalse(String question, String isCorrect) {
    super(question, 2);
    this.isCorrect = isCorrect;

}
    @Override
    public boolean checkAnswer(String userInput) {
        return userInput.equals(isCorrect);
    }
}
