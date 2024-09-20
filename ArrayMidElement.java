/*You have give an array of integers. You need to print the middle element of the array.
f the array has even number of elements, print the largest among two middles.
If the array has odd number of elements, simply print the middle element.
*/

public class ArrayMidElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 4, 5, 6, 7 };
        int mid1;
        int mid2;
        if (arr.length % 2 == 0) {
            mid1 = (arr.length / 2) - 1;
            mid2 = arr.length / 2;
            if (arr[mid1] < arr[mid2]) {
                System.out.println("The middle element of this array is: " + arr[mid2]);
            } else {
                System.out.println("The middle element of this array is: " + arr[mid1]);
            }
        } else {
            mid2 = arr.length / 2;
            System.out.println("The middle element of the array is: " + arr[mid2]);
        }
    }
}
