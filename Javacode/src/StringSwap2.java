
public class StringSwap2 {

	public static void main(String[] args) {
		
		        String str1 = "Papul";
		        String str2 = "Mandal";

		        System.out.println("Before swapping:");
		        System.out.println("String 1: " + str1);
		        System.out.println("String 2: " + str2);

		        // Swapping strings using a temporary variable
		        String temp = str1;
		        str1 = str2;
		        str2 = temp;

		        System.out.println("\nAfter swapping:");
		        System.out.println("String 1: " + str1);
		        System.out.println("String 2: " + str2);
		    }
		}

