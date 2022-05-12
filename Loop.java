package project;
import java.util.Scanner;
public class Loop {
    public static void loop(){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while (choice != 4){
            System.out.println("Select an option from the menu below:");
            System.out.println("1. Enter Pet Info\n2. Feed/Water Pet");
            System.out.println("3. Give Pet Treat\n4. Quit");
            choice = scan.nextInt();
            Choice(choice);
        }
    }

    public static void Choice (int choice) {
        switch (choice){
            case 1:
                System.out.println("You selected Enter Pet Info.");
                PetInfo.name();
                break;
            case 2:
                System.out.println("You selected Feed/Water Pet.");
                FeedPet feed = new FeedPet();
                feed.food();
                feed.water();
                break;
            case 3:
                System.out.println("You selected Give Pet Treat.");
                Treat.treat();
                break;
            case 4:
                End.end();
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
