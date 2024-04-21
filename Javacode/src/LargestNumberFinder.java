//Iterative Solution
public class LargestNumberFinder {

    public static int findLargestNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 30, 20, 50, 40};
        int largest = findLargestNumber(numbers);
        System.out.println("The largest number is: " + largest);
    }
}
