package com.biz.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilewExec02 {

	public static void main(String[] args) {
		String strFile = "src/com/biz/files/우리말이름.txt";
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(strFile);
			buffer = new BufferedReader(fr);
			
			while(true) {
				// strLine을 string형으로 변환하고 buffer.readline을 통해 한줄씩 읽는다.
				String strLine = buffer.readLine(); 
				// 먼저 EOF를 검사하고
				// 만약 null 값이 나오면은 break
				if(strLine == null) break;
				// 통과되면 나머지 수행
				System.out.println(strLine);
				
			
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
