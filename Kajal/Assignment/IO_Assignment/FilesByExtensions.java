package com.io;

import java.io.File;

//Write a Java program to get specific files by extensions from a specified folder.

public class FilesByExtensions {
public static void main(String[] args) {
    // Folder from which files are fetched
    File file = new File("D://ExampleDirectory");
    // Implemented as lambda. filter all the files
    // having .text extension
    File[] fileList = file.listFiles((d,f)-> f.toLowerCase().endsWith(".txt"));
    // Listing all the included files
    for(File f : fileList) {
      System.out.println(f.getAbsolutePath());
    }
  }
}
