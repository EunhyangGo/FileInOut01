package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.files.vo.GradeVO;

public class GradeService {

	List<GradeVO> gradeList;
	List<String> strNumList;
	
	String strFileName;
	// 매개변수 strFile이 들어있는 생성자
	public GradeService(String strFileName){
		
		this.gradeList = new ArrayList();
		this.strNumList = new ArrayList();
	
		this.strFileName = strFileName;
	}
	
	public void makeScore() {
		for(GradeVO vo: gradeList) {
			int intKor = (int)(Math.random() * (100-50+1)) + 50;
			int intEng = (int)(Math.random() * (100-50+1)) + 50;
			int intMath = (int)(Math.random() * (100-50+1)) + 50;
			
			int intSum = intKor;
			intSum += intEng;
			intSum += intMath;
			float floatAvg = intSum /3;
			
			vo.setIntKor(intKor);
			vo.setIntEng(intEng);
			vo.setIntMath(intMath);
			vo.setIntSum(intSum);
			vo.setFloatAvg(floatAvg);
		}
		
		
	}
	// 성적 일람표, 점수는 아직 없음
	public void makeNum() {
		 int intGradeLen = gradeList.size();
	     for(int i = 0 ; i <intGradeLen; i++) {
	    	int intNum = i+1;
	    	//String strNum = String.valueOf(intNum);
	    	//strNumList.add(strNum);
	    	strNumList.add(""+intNum); //strList에 intNum(정수)을 문자열로 변환하여 저장
	     }
	     // List<String> strNumList에 담긴 학번은 현재는 정렬이 된 상태이나,
	     // 만약 정렬되지 않고, 중복 값이 있다고 하면 
	     Set<String> setString = new TreeSet(strNumList);
	     strNumList = new ArrayList(setString);
	     // 이 코드를 작성하면 중복되지 않는 정보를 나열할 수 있음.
		
	}
	public void addNum() {
		// addNum() 메서드를 생성하여 strNumList의 값을 strNum 변수에 1:1 세팅하시오.
		
		// 1번
		int intListLen = gradeList.size();
		for(int i = 0; i <intListLen; i++) {
			GradeVO vo = gradeList.get(i);
			String strNum = strNumList.get(i);
			vo.setStrNum(strNum);
		
		//2번
		gradeList.get(i).setStrNum(strNumList.get(i));
		
			
	
		}
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
			
			String[] st = strLine.split(":"); // null이아니면 이름을 배열에 담고 ":"을 기준으로 쪼개서 
			GradeVO gv = new GradeVO(); //gradeVO 클래스를 불러와서
			gv.setStrName(st[0]); // st배열안에 들어있는 0번째에 있는 값을 불러와서 gv에 담고
			gradeList.add(gv); // gradList에 gv를 추가하기
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
	public void view() {
		
			
			System.out.println("==================================");
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
			System.out.println("----------------------------------");
			for(GradeVO vo : gradeList) {
				System.out.print(vo.getStrNum() + "\t");
				System.out.print(vo.getStrName() + "\t");
				System.out.print(vo.getIntKor() + "\t");
				System.out.print(vo.getIntEng() + "\t");
				System.out.print(vo.getIntMath() + "\t");
				System.out.print(vo.getIntSum() + "\t");
				System.out.print(vo.getFloatAvg() + "\n" );
		}
		
		}
	}
	

