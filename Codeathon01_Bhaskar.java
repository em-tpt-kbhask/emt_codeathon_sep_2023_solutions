import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeathon01_Bhaskar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> names = new ArrayList<>();
    System.out.println("HOW MANY NAMES DO YOU WANT TO GIVE HERE:");
    int numberOfNames = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < numberOfNames; i++) {
      String name = sc.nextLine();
      names.add(name);
    }


    for (String name : names) {
      String lowercaseName = name.toLowerCase();
      int length = lowercaseName.length();
      int isSorted = 0;

      for (int i = 0; i < length; i++) {
        int firstChar = lowercaseName.charAt(i);
        for (int j = i + 1; j < length; j++) {
          int secondChar = lowercaseName.charAt(j);
          if (firstChar > secondChar) {
            isSorted = 1;
          }
        }
      }

      if (isSorted == 1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}