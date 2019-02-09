
/**
 * This program demonstrates the practical use of MVC pattern
 * @author Pavel Denisenko
 * @date 07.02.2019
 */
package ua.training;

/**
 * The entry point of this program
 */
public class Main {

    public static void main(String[] args) {
        // MVC initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Run
        controller.processUser();
    }

}
