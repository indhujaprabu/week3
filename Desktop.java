package org.system;

public class Desktop {

	public static void main(String[] args) {
		Computer c = new Computer();
		c.compModel();
		Desktop s = new Desktop();
		s.desktopSize();

	}

	public void desktopSize() {

		System.out.println("desktop size is 50*45 pixel");

	}

}
