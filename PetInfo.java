package project;
import java.util.Scanner;
import java.lang.Math;
public class PetInfo {
    static Scanner scan = new Scanner(System.in);
    public double pi;

    public static void name() {
        String petName;
        System.out.print("Enter pet's name: ");
        petName = scan.nextLine();
        System.out.println("Your pet's name is " + petName);

        PetInfo info = new PetInfo();
        double radius, height;
        System.out.print("What is the radius (inches) of the bowl you feed your pet in? ");
        radius = scan.nextDouble();

        System.out.print("What is the height (inches) of the bowl you feed your pet in? ");
        height = scan.nextDouble();
        System.out.println("Your pet bowl has a volume of " + info.volume(radius, height) + " cubic units.");

    }
    public PetInfo() {
        this(Math.PI);
    }
    public PetInfo(double pi){
        this.pi = pi;
    }
    public double volume(double radius, double height) {
        return pi * radius * radius * height;
    }
}
