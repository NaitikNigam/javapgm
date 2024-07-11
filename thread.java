
class thread extends Thread {
	public void run()
	{
		System.out.print("Welcome to GeeksforGeeks.");
	}
	public static void main(String[] args)
	{
		thread g = new thread(); // creating thread
		g.start(); // starting thread
	}
}
