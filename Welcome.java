package project;
import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans;
        System.out.print("Welcome to Auto-Pet Feeder! Are you a pet owner?(y/n) ");
        ans = scan.nextLine();
        if (ans.equals("y") | ans.equals("yes"))
            Loop.loop();
        else
            End.end();
    }
}