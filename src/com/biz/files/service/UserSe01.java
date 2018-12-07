package com.biz.files.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.files.vo.UserVO;

public class UserSe01 {
	List<UserVO> userList;
    List<UserVO> userLii;

public UserSe01() {
	userList = new ArrayList();
	userLii = new ArrayList();
	
}public void makeId() {	
 
 for(int i = 0; i < 10 ; i++) {
	 // 10번 반복해서 add를 함. for안에 생성해야만이 10개의 서로다른 아이디값이 생성
	 // 10개의 리스트에 담긴 vo는 항상 새로 생성을 해줘야 한다.
	 UserVO ur = new UserVO(); 
	 int num =(int)(Math.random() *(200-100+1)) + 100; //100부터 200까지
	 System.out.println(num); 
	 ur.setStrid("" + num); 
	 userList.add(ur);
 } 

 
 }public void view() {
	for(UserVO ur :userList) {
		System.out.println(ur);
	}
 

}
}