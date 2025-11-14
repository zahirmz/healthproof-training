package com.filehandling;
import java.io.*;
//
//public class Demo {
//	public static void main(String[] args) {
//		File f1=new File("D:\\Programs");
//		File f2=new File("D:\\USTGlobal");
//		f1.renameTo(f2);
//		System.out.println("folder created successfult");
//	}
//}
//
//}


//public class Demo{
//	public static void main(String[] args) {
//		File f2=new File("D:\\USTGlobal\\A.text");//create DATA
//		try {
//			
//		}
//	}
//}

//Byte oriented

//public class Demo {
//	public static void main(String[] args) throws IOException {
//		FileOutputStream fos=new FileOutputStream("D:\\USTGlobal\\B.text");
//		String str="welcome to UST Global";
//		byte b[]=str.getBytes();
//		fos.write(b);
//		System.out.println("Message written successfully");
//	}
//}
//

//Byte oriented


public class Demo{
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\USTGlobal\\B.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}
}
























