package threads12;



class MyThread extends Thread
{
	

public void run()
{
	System.out.println("hello");
	
}
}

class main
{
	

	public static void main(String[] args) {
	MyThread t=new MyThread();
	t.start();
	System.out.println("main thread");
}
}

