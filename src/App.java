import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("**************************************");
            System.out.println("Welcome to the Refraction Calculator!");
            System.out.println("Speed of Light is already set!");
            System.out.println("**************************************");
            Scanner valInp = new Scanner(System.in);
            System.out.print("What is the value for v? ");
            double v = valInp.nextDouble(); // Get the value v from the user
            double eq = Equations.indexOfRefraction(v, 2);
            System.out.println("**************************************");
            System.out.println("The Refraction Index is: " + eq);
            System.out.println("**************************************");
            System.out.print("Continue? ");
            choice = inp.next(); // Get a value from the user whether or not to continue
            System.out.println();
        }
    }
}
