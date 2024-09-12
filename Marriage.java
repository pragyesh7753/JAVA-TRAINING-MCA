import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender: ");
        String gender = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if ((gender.equals("female") && age >= 18) || (gender.equals("male") && age >= 21)) {
            System.out.println("Congrats! You can marry.");
        } else {
            System.out.println("Sorry! You are not matured enough to marry.");
        }
    }
}
