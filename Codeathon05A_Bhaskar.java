import java.util.Scanner;

class Rectangle {
  private int width;
  private int height;

  public void setWidth(int width) {
    this.width = width;
  }

  public int getWidth() {
    return width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  public void display() {
    System.out.println(width + " " + height);
  }
}

class RectangleArea extends Rectangle {
  public void readInput() {
    Scanner scanner = new Scanner(System.in);

    setWidth(scanner.nextInt());
    setHeight(scanner.nextInt());
    scanner.close();
  }


  public void display() {
    super.display();
    int area = getWidth() * getHeight();
    System.out.println(area);
  }
}


public class Codeathon05A_Bhaskar {
  public static void main(String[] args) {
    RectangleArea rectangle = new RectangleArea();
    rectangle.readInput();
    rectangle.display();
  }

}
