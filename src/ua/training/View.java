
package ua.training;

/**
 * Class for View component of MVC
 */
public class View {

    // Text constants
    public static final String FIRST_WORD = "Hello";
    public static final String SECOND_WORD = "world!";
    public static final String FIRST_WORD_INPUT = "Please input the first word: ";
    public static final String SECOND_WORD_INPUT = "Please input the second word: ";
    public static final String WRONG_INPUT = "Incorrect input! ";
    public static final String RESULT_SENTENCE = "Result sentence is: ";

    // Visualization method
    public void printMessage(String message){
        System.out.println(message);
    }

}
