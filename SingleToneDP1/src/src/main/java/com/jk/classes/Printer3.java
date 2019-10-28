package com.jk.classes;

public class Printer3 extends CommonsUtil {

	private static final long serialVersionUID = -5634125768691887278L;
	
	static Printer3 INSTANCE;

	private Printer3() {
		System.out.println("Printer.Printer()");
	}

	public final static Printer3 getInstance() {

			if (INSTANCE == null)
				synchronized (Printer3.class) {
					if (INSTANCE == null)
						INSTANCE = new Printer3();
				}
		return INSTANCE;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		//throw new CloneNotSupportedException("Use Already Available Object");
		 return INSTANCE;
		// return (Printer3)super.clone();
	}
}
