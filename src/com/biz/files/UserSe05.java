package com.biz.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserSe05 {
	List<String>strList;
	String strFileName;

	public UserSe05(String strFileName) {
		strList = new ArrayList();
		this.strFileName = strFileName ;
	}
	public void readFile() {
	
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strLine = buffer.readLine();
				if(strLine == null) break;
				
				String[] strNames = strLine.split(":");
				strList.add(strNames[0]); // 파일이름을 참초하여 파일을 읽어 이름만 잘라서 strList에 추가.
				
				
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
