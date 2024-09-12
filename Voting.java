import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Sorry! You can not vote");
        } else {
            System.out.println("Congrats! You can vote");
        }
    }
}
