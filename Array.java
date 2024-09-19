import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // int b[] = { 1, 2, 3, 4, 5 };
        // for (int i = 0; i < b.length; i++) {
        // System.out.println(b[i]);
        // }
        // int target = 3;
        // for (int i = 0; i < b.length; i++) {
        // if (b[i] == target) {
        // System.out.println("Element found at index: " + i);
        // break;
        // }
        // }

        // int givenNo = 3;
        // int replaceNo = 5;
        // for (int i = 0; i < b.length; i++) {
        // if (b[i] == givenNo) {
        // b[i] = replaceNo;
        // }
        // }
        // System.out.println("--------------------");
        // for (int i = 0; i < b.length; i++) {
        // System.out.println(b[i]);
        // }

        // // Minimum and Maximum element in an array
        // int a[] = new int[6];
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of elements in the array: ");
        // int n = sc.nextInt();
        // System.out.println("Enter the elements of the array: ");
        // for (int i = 0; i < n; i++) {
        // a[i] = sc.nextInt();
        // }
        sc.close();
        // int max = Integer.MIN_VALUE;
        // for (int i : a) {
        // if (i > max) {
        // max = i;
        // }
        // }
        // System.out.println("The maximum element in the array is: " + max);

        // int min = Integer.MAX_VALUE;
        // for (int i : a) {
        // if (i < max) {
        // max = i;
        // }
        // }
        // System.out.println("The minimum element in the array is: " + max);

        // // Sum of elements in an array
        int a[] = { 5, 9, 7, 3, 4, 6, 8 };
        // int sum = 0;
        // for (int i : a) {
        // sum += i;
        // }
        // System.out.println("The sum of elements in the array is: " + sum);

        // // Sum of even numbers - Sum of odd numbers
        // int sumEven = 0;
        // int sumOdd = 0;
        // for (int i : a) {
        // if (i % 2 == 0) {
        // sumEven += i;
        // } else {
        // sumOdd += i;
        // }
        // }
        // System.out.println("Sum of even numbers: " + sumEven);
        // System.out.println("Sum of odd numbers: " + sumOdd);
        // System.out.println("Sum of even numbers - Sum of odd numbers is: " +
        // Math.abs(sumEven - sumOdd));

        // // Reverse an array
        int b[] = new int[a.length];
        int n = Math.abs((a.length) / 2);
        for (int i = 0; i < n; i++) {
            b[i] = a[a.length - i - 1];
        }
        System.out.println("Reversed array is: ");
        for (int i : b) {
            System.out.println(i);
        }
    }
}
