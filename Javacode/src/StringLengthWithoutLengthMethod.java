public class StringLengthWithoutLengthMethod {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        int length = 0;
        for (char c : charArray) {
            length++;
        }
        System.out.println("Length of the string: " + length);
    }
}
