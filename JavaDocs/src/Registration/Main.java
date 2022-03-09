package Registration;

import java.util.Scanner;

class Main {


    public static void main(String[] args) throws InterruptedException {
        // creates an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        // takes input from the keyboard
        String Lastname = input.nextLine();
        System.out.print("Enter your first name:");
        String Firstname = input.nextLine();
        // prints the name
        System.out.println("Your name is " + Firstname + " " + Lastname);
        String Yes_or_No;
        do {
            Scanner input2 = new Scanner(System.in);

            System.out.println("Is this correct?");
            Yes_or_No = input.nextLine();
            if (Yes_or_No.equals("Yes")) {
                System.out.println("continuing...");
            }

            if (Yes_or_No.equalsIgnoreCase ("No")) {
                System.out.println("Please retype your name");
                Thread.sleep(1000);

                System.out.println("Firstname");
                String Firstname2 = input.nextLine();
                System.out.println("Lastname");
                String Lastname2 = input.nextLine();
                System.out.println("Your name is " + Firstname2 + " " + Lastname2);
            }
        } while (Yes_or_No.equals("No"));

    }
    private static void While(boolean no) {
    }
}


