
public class StringReversalWithoutBuiltinMethods {

	    public static String reverseStringCharArray(String str) {
	        char[] charArray = str.toCharArray();
	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	            char temp = charArray[start];
	            charArray[start] = charArray[end];
	            charArray[end] = temp;
	            start++;
	            end--;
	        }

	        return new String(charArray);
	    }

	    public static void main(String[] args) {
	        String original = "Programming is fun!";
	        String reversed = reverseStringCharArray(original);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }
}
