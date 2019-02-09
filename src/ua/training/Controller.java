
package ua.training;

import java.util.Scanner;

/**
 * Class for Controller component of MVC
 */
public class Controller {

    private Model model;
    private View view;

    // Constructor
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Working method that starts initialized MVC
    public void processUser(){
        Scanner scanner = new Scanner(System.in);

        model.setFirstWord(inputWord(scanner, view.FIRST_WORD_INPUT, view.FIRST_WORD, view.WRONG_INPUT));
        model.setSecondWord(inputWord(scanner, view.SECOND_WORD_INPUT, view.SECOND_WORD, view.WRONG_INPUT));
        view.printMessage(view.RESULT_SENTENCE + model.constructSentence(model.getFirstWord(), model.getSecondWord()));

        scanner.close();
    }

    // Additional method that verifies the correctness of the entered data
    public String inputWord(Scanner scanner, String invitationInput, String expectedWord, String wrongInput) {
        String inputLine = "";
        view.printMessage(invitationInput);

        while(scanner.hasNextLine()) {
            inputLine = scanner.nextLine();
            if (inputLine.equals(expectedWord))
                break;
            else
                view.printMessage(wrongInput + invitationInput);
        }

        return inputLine;
    }

}
