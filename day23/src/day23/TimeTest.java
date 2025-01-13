package day23;



import java.util.*;

class Timer extends Thread{
	
	@Override
	public void run() {
		Calendar now = Calendar.getInstance();
	
				
				int hour = now.get(Calendar.HOUR);
				int min = now.get(Calendar.MINUTE);
				int second=now.get(Calendar.SECOND);
				
				System.out.println("현재 시간 : "+hour +"시 "+ min +"분 "+ second+"초");
				
	}
}

public class TimeTest {

	public static void main(String[] args) {
	
		
		try {
			while(true) {
				Timer t=new Timer();
				t.start();
				Thread.sleep(1000);
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		


		
		

		
		
		
	}

}
