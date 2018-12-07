package com.biz.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserSe02 {
	List<String>strList;
	String strFileName;
	

	public UserSe02(String strFileName) {
		strList = new ArrayList();
		this.strFileName = strFileName;
	} 
	public void readFile() {
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(this.strFileName);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strLine = buffer.readLine();
				if(strLine == null) break;
				strList.add(strLine); //다 끝난걸 strList에 담기
				System.out.println(strLine);
			}
			fr.close();
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
