public class HighestNumberFinder {

    public static int findHighestNumber(int[] numbers) {
        int highest = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        
        return highest;
    }

    public static void main(String[] args) {
        int[] array = {10, 30, 20, 50, 40};
        int highestNumber = findHighestNumber(array);
        System.out.println("The highest number in the array is: " + highestNumber);
    }
}
