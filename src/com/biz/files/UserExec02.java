package com.biz.files;

public class UserExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strFile = "src/com/biz/files/우리말이름.txt";
		
		UserSe02 us = new UserSe02(strFile);
		us.readFile();
	}

}
