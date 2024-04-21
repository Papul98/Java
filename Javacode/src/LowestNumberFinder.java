public class LowestNumberFinder {

    public static int findLowestNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 3, 12, 7};
        int lowestNumber = findLowestNumber(numbers);
        System.out.println("The lowest number in the array is: " + lowestNumber);
    }
}
