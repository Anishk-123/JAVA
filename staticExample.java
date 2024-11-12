package k3;

public class staticExample {
	static int counter=0;
	public staticExample() {
		counter++;
		
		
	}
	public static void main(String[]args) {
		new staticExample();
		new staticExample();
		new staticExample();
		System.out.println("counter:"+counter);
	}
		
	}

