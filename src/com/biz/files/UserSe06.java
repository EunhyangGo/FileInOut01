package com.biz.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.vo.UserVO;

public class UserSe06 {

	List<UserVO> userList;
	String strFileName;
public UserSe06(String strFileName) {
	userList = new ArrayList();
	this.strFileName = strFileName;
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
			String [] strNames = strLine.split(":");
            UserVO us = new UserVO();
            us.setStrName(strNames[0]);
            userList.add(us);
		}
		buffer.close();
		fr.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
