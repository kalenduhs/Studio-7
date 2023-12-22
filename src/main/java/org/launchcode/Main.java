package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
       int score = 0;

       TrueFalse question1 = new TrueFalse("Is the sky blue?", "True");
//       ArrayList<Question> questions = new ArrayList<Question>( );
//       questions.add(quesiton1);
       Quiz quiz1 = new Quiz();
       quiz1.addQuestion(question1);
       System.out.println(quiz1.getListOfQuestions());
   }
}