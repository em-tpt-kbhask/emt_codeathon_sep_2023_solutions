package codeathon;
import java.util.Scanner;

public class Codeathon03_Bhaskar {
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("ENTER A TREES:");
    int n=scan.nextInt();
    System.out.println("ENTER THE HEIGHTS:");
    int treeHeightList[] = new int[n];

    for(int i=0;i<n;i++)
      treeHeightList[i]=scan.nextInt();
    System.out.println(monkey(treeHeightList));
  }
  public static int monkey(int[] treeHeightList)
  {
    int maxTravelTime = 0;
    maxTravelTime = max(maxTravelTime, treeHeightList, treeHeightList.length);
    return maxTravelTime;
  }
  public static int max(int max, int []listOfHeights, int orgArrayLength)
  {
    int length = listOfHeights.length;
    if (length == 1)
    {
      return maximum(max, listOfHeights[0]);
    }
    int tempMax = 0;
    int startIndex = 0;
    int []tempArrayList =  new int[length-1];
    for(int index = 1; index < length; ++index)
    {
      tempMax = listOfHeights[startIndex]
        +  listOfHeights[index] + minimum(index, orgArrayLength-index);
      max = maximum(tempMax, max);
      tempArrayList[index-1] = listOfHeights[index];
    }
    return max(max, tempArrayList, orgArrayLength);
  }
  public static int minimum(int n1, int n2)
  {
    return n1 < n2 ? n1 : n2;
  }
  public static int maximum(int n1, int n2)
  {
    return n1 > n2 ? n1 : n2;
  }
}





























































































































