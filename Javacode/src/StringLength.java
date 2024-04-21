public class StringLength {
    public static int findLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "Hello, World!";
        int length = findLength(text);
        System.out.println("Length of the string: " + length);
    }
}
