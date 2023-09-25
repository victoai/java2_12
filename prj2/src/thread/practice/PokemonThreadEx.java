package thread.practice;

public class PokemonThreadEx {

	public static void main(String[] args) {
		
		Thread th1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<64; i++) {					
					System.out.println("FIGHT");
				}
			}
		});
		
		Thread2 th2=new Thread2();
		Thread th3=new Thread(new Thread3());		
		
		th1.start();
		th2.start();
		th3.start();
	 
		try {
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		 
		System.out.println("Wild PIKACHU Appeared!");
	}

}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<64; i++) {
			System.out.println("ITEM");
		}
	}
}

class Thread3 implements Runnable{
	public void run() {
		for(int i=0; i<64; i++) {			
			System.out.println("RUN");
		}
	}
}