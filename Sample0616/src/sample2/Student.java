package sample2;

public class Student {
	//이름, 국  영 수 점수
	String name;
	int kor;
	int math;
	int eng;
	
	//method setter getter
	public void setName(String name){
		this.name = name;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setMath(int math){
		this.math = math;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	
	

	//메소드
	//이름, 국 영 수  총점 평균을 반환
	public String getName(){
		return name;
	}
	public int getKor(){
		return kor;
	}
	public int getMath(){
		return math;
	}
	public int getEng(){
		return eng;
	}
	public int getTotal(){
		return kor+math+eng;
	}
	public float getAverage(){
		return getTotal() / 3.0f;
	}


}
//우클릭 소스 게터 세터