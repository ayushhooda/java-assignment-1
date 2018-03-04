package edu.knoldus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

class FileOperations {

  public HashMap<String, Integer> countWords(String path) {
    HashMap<String, Integer> wordCount = new HashMap<>();
    try {
      File file = new File(path);
      FileReader reader = new FileReader(file);
      BufferedReader br = new BufferedReader(reader);
      String x;
      String line = "";
      while ((x = br.readLine()) != null)
        line += x;
      String[] words = line.split(" ");
      for (int i = 0; i < words.length; i++) {
        if (wordCount.containsKey(words[i])) {
          int n = wordCount.get(words[i]);
          wordCount.put(words[i], ++n);
        } else
          wordCount.put(words[i], 1);
      }
    } catch (FileNotFoundException ex) {
      System.err.println("File not found.");
    } catch (Exception ex) {
      System.err.print(ex);
    }
    return wordCount;
  }
}
