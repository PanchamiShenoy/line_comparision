package com.line;

import java.util.Scanner;

public class LineCompare {

	int line1[] = new int[4];
	int line2[] = new int[4];
	Double dis1;
	Double dis2;

	public void getCoordinates() {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nenter the coordinates of line 1");
		line1[0] = sc.nextInt();
		line1[1] = sc.nextInt();
		line1[2] = sc.nextInt();
		line1[3] = sc.nextInt();
		System.out.print("enter the coordinates of line 2");
		line2[0] = sc.nextInt();
		line2[1] = sc.nextInt();
		line2[2] = sc.nextInt();
		line2[3] = sc.nextInt();
		sc.close();
	}

	public void calculateDistance() {

		dis1 = new Double(Math.sqrt(Math.pow(line1[3] - line1[1], 2) + Math.pow(line1[2] - line1[0], 2)));
		dis2 = new Double(Math.sqrt(Math.pow(line2[3] - line2[1], 2) + Math.pow(line2[2] - line2[0], 2)));
		System.out.println("length of line 1 = " + dis1 + "\nlength of line 2 = " + dis2);
	}

	public void compareLines() {

		if (dis1.equals(dis2))
			System.out.println("Lines are equal");
		else {
			int compare = dis1.compareTo(dis2);
			if (compare > 0) {
				System.out.println("line 1 is greater than line 2");
			} else if (compare < 0) {
				System.out.println("line 1 is lesser than line 2");
			}
		}
	}
}
