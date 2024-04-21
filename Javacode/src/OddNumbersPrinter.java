public class OddNumbersPrinter {
    public static void printOddNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Odd Numbers:");
        printOddNumbers(array);
    }
}
