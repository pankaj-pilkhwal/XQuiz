package com.crio.xquiz;
import java.util.*;

public class Question{
    //TODO: Define the variable to store the question text
    private String questionText;
    //TODO: Define the variable to store the answer text
    private String answer;
    //TODO: Define the variable to store the list of text choices
    private List<String> choices;

    // TODO: Create the Question class constructor 
    // use the  signature :  public Question(String questionText, List<String> choices, String answer)

        // Include the following validations

        // Validate: If QuestionText is  null or empty
                // Print "Question text cannot be null or empty!"
        // Else If List of Choices is null or EmptyList,
                //  print “Choices cannot be null or empty!”
        // Else If answer is  null or Empty
                // print “Answer cannot be null or empty!”
        // Else If answer is not one of the choices in the List of choices by iterating over the list
                // print “Answer is not present among the choices!”
        // Else
                // initialise all the defined variables using `this` keyword
    public Question(String questionText, List<String> choices, String answer) {
        if(questionText.isEmpty() || questionText == null) {
                System.out.println("Question text cannot be null or empty!");
        }else if (choices.isEmpty()) {
                System.out.println("Choices cannot be null or empty!");
        }else if (answer.isEmpty() || answer == null) {
                System.out.println("Answer cannot be null or empty!");
        }else if (!isAnswerInChoices(choices, answer)) {
                System.out.println("Answer is not present among the choices!");
        }else {
                this.questionText = questionText;
                this.choices = choices;
                this.answer = answer;
        }
    }

    boolean isAnswerInChoices(List<String> choices, String answer) {
        for (String choice : choices) {
                if(choice.equals(answer)) {
                        return true;
                }
        }
        return false;
    }

            
                
    // Note: The print statements should match exactly with the one specified above, since we have test cases designed on this
    // If the print statements do not match then the tests might fail, so be cautious

    //TODO: Create the getter method : public String getAnswer(), which returns the answer
    public String getAnswer() {
        return this.answer;
    }

    //TODO: Create the getter method : public String getQuestionText(), which returns the questionText
    public String getQuestionText() {
        return this.questionText;
    }

    //TODO: Create the getter method : public List<String> getChoices(), which returns the choices
    public List<String> getChoices() {
        return this.choices;
    }

    //TODO: Create the method checkAnswer() with signature: public boolean checkAnswer(String answer)
        // Validate: If answer provided in the input matches the existing answer for the given question, then return True
        // Else:  return False.
        public boolean checkAnswer(String answer) {
                if(answer.equals(this.answer)) return true;
                else return false;
        }

public void display(){
    System.out.println(getQuestionText());
    for(int i = 0; i < choices.size(); i++){
        int choiceNumber = i + 1;
        System.out.println(choiceNumber + ":" + choices.get(i));
    }
}

}

