import java.util.Scanner;

public class Debug {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        String age = input.nextLine();
        System.out.print("Enter your DOB year: ");
        String dob = input.nextLine();
        System.out.println("Summary: " + "Your name is: " + name + "\n" + "Your age is: " + age + "\n" + "Your birth year is: " + dob);
    }
}
