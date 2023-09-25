package thread;

public class hpwPro {

	public static void main(String[] args) {	 
		SaveThread th = new SaveThread();
		th.start();		 		
		for( int i=1; i<1000;i++) {
			System.out.println("문서를 작성합니다");
		}		
	}
}


class SaveThread extends Thread{	
	@Override
	public void run() {				 
			System.out.println("저장합니다!!!!!!!!!!!!!!");		 
	}
}