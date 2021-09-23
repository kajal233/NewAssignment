package com.io;

import java.io.File;
import java.io.IOException;

// Write a Java program to get a list of all file/directory names from the given.

public class GetAllFileDirectoryNames {
	
	   public static void main(String args[]) throws IOException {
	      //Creating a File object for directory
	      File directoryPath = new File("D:\\ExampleDirectory");
	      //List of all files and directories
	      String contents[] = directoryPath.list();
	      System.out.println("List of files and directories in the specified directory:");
	      for(int i=0; i<contents.length; i++) {
	         System.out.println(contents[i]);
	      }
	   }
	}

