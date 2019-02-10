package com.biz.ex02.vo;

/*
 * 1. 학번(문자열), 국어점수(정수형), 영어점수(정수형)
 * 수학점수(정수형), 총점(정수형), 평균(실수형)을 저장할 member변수를 선언
 * 2.member변수에 접근할 getter, setter method 생성
 * 3. toStirng()메서드 재정의
 */
public class GradeVO {
	private String strNum;
	private int intKor;
	private int intEng;
	private int intMath;
	
	private int intSum;
	private float floatAvg;
	
	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}



	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}



	public int getIntMath() {
		return intMath;
	}



	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}



	public int getIntSum() {
		return intSum;
	}



	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}



	public float getFloatAvg() {
		return floatAvg;
	}



	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}



	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intSum=" + intSum + ", floatAvg=" + floatAvg + "]";
	}
	
	

}