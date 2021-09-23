package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*Is a FilterInputStream, which provides the ability of buffering the input, to another input stream
 By default, the streams are not buffered. When a BufferedInputStream is created, an internal buffer array is created
 When a read is done, BufferedInputStream reads multiple bytes in to the buffer using the original input stream
Improves performance significantly, as number of reads on the original input stream are reduced*/
public class BufferedInputStreanDemo {
	public static void main(String arg[]) throws IOException
	{
		FileInputStream bin = new FileInputStream("D:/ExampleDirectory/abc.txt");
		BufferedInputStream b= new BufferedInputStream(bin);
		int i;
		while((i=b.read())!=-1) {
			System.out.println((char)i);
		
	}
bin.close();
b.close();
	}
}
