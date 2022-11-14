package com.multithreading;

public class THreadMethods extends Thread{
 //1:psvm(),(User thread,deamon thread
	//2:Garbage collector, public protected Finalize();it removes unwanted space
	//3:Thread Scheduler-->thread.currentthread.getname(),thread.sleep()
	
	
	//start()
	//run()
	//sleep()
	//thread.cureentthread.getname()
	//join()-->will work till the thread completely die off
	//stop()
	//interrupt()
	//notify()
	//notifyAll()
	//wait()
	public void run() {
	       for(int i=0;i<5;i++) {
	    	   System.out.println(Thread.currentThread().getName());
	    	   
	          	System.out.println(i);
	}
	       try {
	    	   Thread.sleep(200);
	       }
	       catch(Exception e){
	    	   System.out.println(e);
	    	   
	       }
	}
	
	public static void main(String[] args) {
		THreadMethods  th=new THreadMethods ();
		THreadMethods  th2=new THreadMethods ();
		THreadMethods  th3=new THreadMethods ();
		th.start();
		try {
			th.join();
		}
		catch(Exception e) {
			
		}
		
		
		th2.start();
		//th2.stop();
		//th2.interrupt();
		th3.start();
		System.out.println(th3.getId()); //these id are stable unntil it's interrupted
		
           

	}

}
