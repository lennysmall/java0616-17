package gabagecollection;

public class SampleGc {
	public SampleGc(){
		System.out.println("짜잔~~~");
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("꼴까닥");
	}
	
	public static void main(String[] args){
		SampleGc sample = new SampleGc();
		
		sample = null;
		
		System.gc(); // 이게없으먼 트라이가 실행이 안되서 그전에 강제종료됨
//		System.runFinalization(); // 역시 강제실행 커맨드
//		try{
//			Thread.sleep(5000);
//		}catch(InterruptedException e){}
		//https://github.com/lennysmall/java_study.git
		
	}
}
