import java.util.Scanner;

public class Codeathon04_Bhaskar {
  public static boolean isOdd(int x) {
    return x % 2 != 0;
  }

  public static boolean isPrime(int x) {
    if (x <= 1) {
      return false;
    }
    for (int i = 2; i * i <= x; i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPalindrome(int x) {
    String str = Integer.toString(x).trim();
    String reversedStr = new StringBuilder(str).reverse().toString();
    return str.equals(reversedStr);
  }

  public static void main(String args[]) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("HOW MANY VALUES YOU WANT TO GIVE HERE:");
    int val = scanner.nextInt();

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < val; i++) {
      int op = scanner.nextInt();
      int no = scanner.nextInt();
      switch (op) {
        case 1: {
          if (isOdd(no))
            result.append("ODD\n");
          else
            result.append("EVEN\n");
          break;
        }
        case 2: {
          if (isPrime(no))
            result.append("PRIME\n");
          else
            result.append("COMPOSITE\n");
          break;
        }
        case 3: {
          if (isPalindrome(no))
            result.append("PALINDROME\n");
          else
            result.append("NONPALIN\n");
          break;
        }
      }
    }

    // Print the result string
    System.out.print(result.toString());
  }
}
