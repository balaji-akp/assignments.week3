package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("The Desktop size is 24 inch");
	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
}
