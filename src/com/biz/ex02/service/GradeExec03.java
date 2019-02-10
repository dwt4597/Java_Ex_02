package com.biz.ex02.service;

import java.util.*;

import com.biz.ex02.vo.*;

public class GradeExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeService> gradeList = new ArrayList();
		for (int i = 0; i < 5; i++) {
			GradeService gs = new GradeService();
			gs.makeScore(i);
			gradeList.add(gs);
		}
		
		
	}

}
