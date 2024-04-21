//Using ASCII Array
public class DuplicateFinder {
    public static void findDuplicates(String str) {
        int[] charCount = new int[256];
        
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }
        
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i);
            }
        }
    }

    public static void main(String[] args) {
        String input = "hello world";
        findDuplicates(input);
    }
}
