package java8;

/**
 * Author : Aniruddha Kudalkar
 *
 */
public class Main {

    /**
     * Method find duplicates in array with O(n) efficiency
     *
     * @param arr integer array
     */
    public void findDuplicates(int[] arr) {
        int i = 0, j = 0;

        while (i < arr.length) {
            if (i == j) {
                j++;
            }
            if (j >= arr.length) {
                j = 0;
                if(i == arr.length-1) break;
                i++;
            }
            if(arr[j] < 0) arr[j] = -arr[j];

            if (arr[i] == arr[j]) {
                if(j > i)
                    System.out.println("Duplicate " + arr[i]);
            }
            j++;
        }
    }

    public static void main(String[] args) {
        Main m = new Main();

        int[] arr1 = {1, 5, 6, -5, 1};
//        int[] arr1 = {1, 4, 3, 2, 3};
        m.findDuplicates(arr1);
    }
}
