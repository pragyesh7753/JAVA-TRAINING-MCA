public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = { { 4, 8, 6 }, { 4, 9, 3 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * Write a program to search an element in a 2D array and print true if the
         * element is found otherwise print false.
         */
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 5, 6, 5 }, { 7, 8, 5, 9 } };

        int target = 3;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // System.out.print(arr[i][j] + " ");
                if (arr1[i][j] == target) {
                    System.out.println("True");
                    return; // here, the return keyword is used to terminate the program
                    // break; // break keyword breaks the loop
                }
            }
            System.out.println(" ");
        }
        System.out.println("False");
    }

}
