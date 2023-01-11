import java.util.Arrays;

public class Sort_colors {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0, 2, 0, 1, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapped;
        //run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            // hence, the array will start get to sort from the last, so loop should run less than n-i times
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i then no need to run the loop further
            if (!swapped){
                break;
            }

        }
    }
}
