
package ua.training;

/**
 * Class for Model component of MVC
 */
public class Model {

    private String firstWord;
    private String secondWord;

    // Program logic

    // Method constructs the sentence from words
    public String constructSentence(String firstWord, String secondWord) {
        return firstWord + " " + secondWord;
    }

    // Getter for first word
    public String getFirstWord(){
        return firstWord;
    }

    // Setter for first word
    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    // Getter for second word
    public String getSecondWord() {
        return secondWord;
    }

    // Setter for second word
    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

}
