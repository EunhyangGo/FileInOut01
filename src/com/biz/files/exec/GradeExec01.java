package com.biz.files.exec;

import com.biz.files.service.GradeService;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main() 메서드에서 gradeService의 각 메서드를 호출하여 다음 코드를 실행하시오.
		// 성적리스트(gradeList)생성
		// 번호리스트(strNumList)생성
		// 성적리스트와 번호 리스트 합치기
		// 성적리스트 console에 출력
		String readFile = "src/com/biz/files/service/우리말이름.txt";
		//GradeService gs = new GradeService();
		// 기본 생성자를 호출하는 초기화
		// 기본 생성자가 없기 때문에 오류가 발생
	
		// 생성자에 파일 이름을 전달해 주어야 service 객체를 사용할 수 있다.
		GradeService gs = new GradeService(readFile);
		
		
		
		// 성적 리스트 생성
		gs.readFile();
		
		//학번 생성
		gs.makeNum();
		
		gs.makeScore();
		
		
		// 성적리스트에 학번을 세팅
		gs.addNum();
		
	
		
		
		
		
		gs.view();
		
		
	
		
		
		
		

	}

}
