package com.junit;

public class Calculate {

	public int sum(int a, int b) {
		return a + b;
	}
	
	public double[] PTB2(int a, int b, int c) {
		double x[] = new double[2];
		
		int delta = b*b - 4*a*c;
		
		if (delta < 0) {
			System.out.println("Phuong trinh vo nghiem");
			return null;
		}
		else if (delta == 0) {
			x[0] = x[1] = (-b) / (2*a);
			System.out.println("Phuong trinh co nghiem kep: x = " + x[0]);
			return x;
		}
		else {
			x[0] = (-b - Math.sqrt(delta)) / (2*a);
			x[1] = (-b + Math.sqrt(delta)) / (2*a);
			System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x[0] + ", x2 = " + x[1]);
			return x;
		}
	}
}
