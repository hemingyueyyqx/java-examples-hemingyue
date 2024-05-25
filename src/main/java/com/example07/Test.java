package com.example07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
  public static void main(String[] args)  {
    printPath("D:/test/input.txt", "D:/test/output.txt");
  }
  private static void printPath(String inputpath, String outputPath ) {


      try( FileInputStream in =  new FileInputStream(inputpath);
           FileOutputStream out = new FileOutputStream(outputPath)) {
          int c;
          while((c = in.read()) !=-1) {
              System.out.println("读取字节的十进制整数：" + c);
              out.write(c);
          }
      }
      catch(IOException e) {
          e.printStackTrace();
      }
      }
}
