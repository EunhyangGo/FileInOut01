package com.biz.files;

import com.biz.files.service.UserSe01;

public class UserExec01 {
 public static void main(String[] args) {
	UserSe01 user = new UserSe01();
	
	user.makeId();
	user.view();
}
}
