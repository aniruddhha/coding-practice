package basics;

/**
 * Author : Aniruddha Kudalkar
 * Array Operation with O(n) efficiency
 */
public class Main {

    /**
     * Method find duplicates in array with O(n) efficiency
     *
     * @param arr integer array
     */
    public void findDuplicates(int[] arr) {
        int i = 0, j = 0; // o(1)

        while (i < arr.length) { // o(n)
            if (i == j) {  /*o(1)*/  // making sure that you are not comparing value in same index
                j++; /*o(1)*/
            }
            if (j >= arr.length) { /*o(1)*/  // checking if j has reached the end of an given array
                j = 0; /*o(1)*/
                if (i == arr.length - 1) break; /*o(1)*/  // checking if i has reached the end of an given array
                i++; /*o(1)*/
            }
            if (arr[j] < 0) arr[j] = -arr[j]; /*o(1)*/  // converting negative to positive

            if (arr[i] == arr[j]) { /*o(1)*/
                if (j > i) /*o(1)*/
                    System.out.println("Duplicate " + arr[i]); /*o(1)*/
            }
            j++; /*o(1)*/

            // o() = o(1) + o(n) + .... + o(1) = o(n)

        }
    }

    public void mergeArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        while ((i < arr1.length) && (j < arr2.length)) {

        }
    }

    public void factorial(int num) {
        int fact = 1; // #O(1)
        for (int i = num; i > 0; i--) { // #O(n)
            fact = fact * i; // #O(1)
        }
        // = o(1) + o(n) * o(1) = o(n)
        System.out.println(fact);
    }

    public Boolean checkPalindrome(String str) {
        //BA A AB -> valid
        //BA AB -> valid
        //B A B -> valid
        //BB -> valid
        //B -> valid
        int i = 0, j = str.length() - 1; // o(1)
        while (i < j) { // o(n)
            if (str.charAt(i) != str.charAt(j)) return false; // o(1)
            i++; // o(1)
            j--; // o(1)
        }
        return true;

        // = o(1) + o(n) * o(1) = o(n)
    }

    public static void main(String[] args) {
        Main m = new Main();

        int[] arr1 = {1, 5, 6, -5, 1, 0, 9, 0, 9, 7};
        //int[] arr1 = {8, 4, 1, 8, 3, 1, -3};
        //m.findDuplicates(arr1);

//        int []arr1 = { 1, 8, 2, 9, 2};
        int[] arr2 = {9, 7, 1, 6, 4};

//        m.mergeArrays(arr1, arr2);

        //m.factorial(-10);

        System.out.println(m.checkPalindrome("AB"));
    }
}