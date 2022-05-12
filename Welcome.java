package project;
// scanner class
import java.util.Scanner;
// date library
import java.util.*;
public class Welcome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans;
        // date object
        Date date = new Date();
        System.out.println("Access date: " + date);
        System.out.print("Welcome to Auto-Pet Feeder! Are you a pet owner?(y/n) ");
        ans = scan.nextLine();
        if (ans.equals("y") | ans.equals("yes"))
            Loop.loop();
        else
            End.end();
    }
}
