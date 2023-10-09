import java.util.Scanner;
class Demo{
  static void swap(int a, int b){
    System.out.println("Before swapping a="+a+" and b="+b );
    a=(a+b)-(b=a);
    a = (int) (a * 0.1);
    b = (int) (b * 0.2);
    System.out.println("After swapping a="+a+" and b="+b);

  }
}


public class Codeathon05B_Bhaskar {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value:");
    int a =sc.nextInt();
    System.out.println("Enter b value:");
    int b =sc.nextInt();
    Demo.swap(a,b);
  }
}
