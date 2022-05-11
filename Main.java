package project;
// import java.util.Scanner;

interface Pet {
    void food();
    void water();
    void happy();
}
interface Owner extends Pet{
    void food();
    void water();
    void happy();
}


class Main implements Pet{
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        Main dog = new Main();
        dog.food();
        dog.water();
        dog.happy();
        
        System.out.println ("----------------------------");

        Output out = new Output();
        out.food();
        out.water();
        out.happy();
    }
    @Override
    public void food() {
        System.out.println("Dog has been fed");
    }

    @Override
    public void water() {
        System.out.println("Dog drank water");
    }

    @Override
    public void happy() {
        System.out.println("Dog is happy");
    }
}

class Output implements Owner {
    @Override
    public void food() {
        System.out.println("Your dog has been fed");
    }

    @Override
    public void water() {
        System.out.println("Your dog drank water");
    }

    @Override
    public void happy() {
        System.out.println("Your dog is happy");
    }
}

/*
public class Main
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name, owner;
        boolean loop = true;
        System.out.print("Hi! What is your name? ");
        name = scan.nextLine();
        System.out.println(name);

        while (loop) {
            System.out.print("Do you own any pets?(yes or no) ");
            owner = scan.nextLine();
            if (owner.equals("no"))
                loop = false;
                System.out.println("This is not for you. Goodbye!");

 */