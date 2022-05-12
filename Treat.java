package project;
import java.util.Scanner;
public class Treat {
    static Scanner scan = new Scanner(System.in);
    public static String[] arrTreats = {"Milk Bones", "Peanut Butter", "Pupperoni"};
    public static void treat(){
        int choice;
        System.out.println("Choose a treat to give your pet:\n1. " + arrTreats[0] + "\n2. " + arrTreats[1] + "\n3. " +
                arrTreats[2]);
        choice = scan.nextInt();

        System.out.println("You gave your pet " + arrTreats[choice-1] + ". They are happy.");

    }

}
