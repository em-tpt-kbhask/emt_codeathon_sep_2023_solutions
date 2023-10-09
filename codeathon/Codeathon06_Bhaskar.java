package codeathon;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Codeathon06_Bhaskar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<String> list1 = new ArrayList<>();
    System.out.println("List1:");
    while (true) {
      String input = sc.nextLine();
      if (input.isEmpty()) {
        break;
      }
      list1.add(input);
    }

    List<String> list2 = new ArrayList<>();
    System.out.println("List2:");
    while (true) {
      String input = sc.nextLine();
      if (input.isEmpty()) {
        break;
      }
      list2.add(input);
    }

    Map<String, List<String>> map = list1.stream()
      .collect(Collectors.toMap(Function.identity(), Collections::singletonList));

    // Print the resulting map in the desired format
    map.forEach((key, value) -> {
      System.out.print(key + ": ");
      List<String> matchingFruits = findMatchingFruits(key, list2);
      if (matchingFruits.isEmpty()) {
        System.out.println("[No Fruit]");
      } else {
        System.out.println(String.join(", ", matchingFruits));
      }
    });
  }

  private static List<String> findMatchingFruits(String code, List<String> fruitList) {
    char codeLetter = findCodeLetter(code);
    return fruitList.stream()
      .filter(fruit -> fruit.length() == codeLetter - 'A' + 1)
      .collect(Collectors.toList());
  }

  private static char findCodeLetter(String code) {
    for (char c : code.toCharArray()) {
      if (Character.isLetter(c)) {
        return Character.toUpperCase(c);
      }
    }
    return ' ';
  }
}
