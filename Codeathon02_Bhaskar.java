import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Codeathon02_Bhaskar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("HOW MANY NUMBERS YOU WANT TO GIVE HERE:");
    int numberOfCustomers = sc.nextInt();
    List<String> customerNames = new ArrayList<>();
    for (int i = 0; i < numberOfCustomers; i++) {
      customerNames.add(sc.next());
    }
    List<String> activeCustomerNames = Customers.mostActive(customerNames);
    Collections.sort(activeCustomerNames);
    for (String customerName : activeCustomerNames) {
      System.out.println(customerName);
    }
  }

  static class Customers {
    public static List<String> mostActive(List<String> customers) {
      List<String> res = new ArrayList<>();
      for (String c : customers) {
        double count = Collections.frequency(customers, c);
        double per = (count / customers.size()) * 100;
        if (!res.contains(c) && per >= 5) {
          res.add(c);
        }
      }
      Collections.sort(res);
      return res;
    }
  }
}


