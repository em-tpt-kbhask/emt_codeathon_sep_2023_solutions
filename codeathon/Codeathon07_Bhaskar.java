package codeathon;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Codeathon07_Bhaskar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a valid Windows directory path: ");
    String directoryPath = scanner.nextLine();

    File directory = new File(directoryPath);

    if (!directory.exists() || !directory.isDirectory()) {
      System.out.println("Directory Not Found on the Filesystem");
    } else {
      Map<String, List<String>> fileMap = new TreeMap<>();

      listFiles(directory, fileMap, "");

      for (Map.Entry<String, List<String>> entry : fileMap.entrySet()) {
        String dirName = entry.getKey();
        List<String> files = entry.getValue();

        System.out.print(dirName);
        if (!files.isEmpty()) {
          System.out.print("  " + String.join(", ", files));
        }
        System.out.println();
      }
    }
  }

  private static void listFiles(File directory, Map<String, List<String>> fileMap, String parentPath) {
    File[] files = directory.listFiles();

    if (files != null) {
      List<String> txtAndExeFiles = new ArrayList<>();

      for (File file : files) {
        if (file.isFile() && (file.getName().endsWith(".txt") || file.getName().endsWith(".exe"))) {
          txtAndExeFiles.add(file.getName());
        }
      }

      if (!txtAndExeFiles.isEmpty()) {
        String fullPath = parentPath + directory.getName();
        fileMap.put(fullPath, txtAndExeFiles);
      }

      for (File subDirectory : files) {
        if (subDirectory.isDirectory()) {
          listFiles(subDirectory, fileMap, parentPath + directory.getName() + "\\");
        }
      }
    }
  }
}
