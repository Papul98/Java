public class CharacterAnalyzer {
    public static void analyzeString(String input) {
        int specialCharCount = 0;
        int numberCount = 0;
        int capitalCount = 0;
        int lowercaseCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                numberCount++;
            } else if (Character.isUpperCase(c)) {
                capitalCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Special Characters: " + specialCharCount);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Capital Letters: " + capitalCount);
        System.out.println("Lowercase Letters: " + lowercaseCount);
    }

    public static void main(String[] args) {
        String inputString = "Hello, World! 123";
        analyzeString(inputString);
    }
}
