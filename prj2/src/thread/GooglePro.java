package thread;

public class GooglePro {
	public static void main(String[] args) {
		
		
		
		
		
		
	}

}



class  FileDownload  extends Thread{
	  @Override
	public void run() {
		 
		  
		  for( int i=1 ;  i<100 ;i++) {
			  System.out.println(" 파일다운로드 중 ");
		  }
		  
		  
		  System.out.println(" 다운로드!!!");
	}
}
