package fcu.iecs.oop;

public class Break {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i ++) {
			if(i == 0 || i == 1)  System.out.println(i);
			else  break;
		}

	}
}
