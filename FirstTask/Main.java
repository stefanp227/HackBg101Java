package hackBulgariaFirstTask;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int flag = 0;
		int i = 0;
		String line;
		String[] linesp;
		
		Scanner read = new Scanner(System.in);
		line = read.nextLine();
		read.close();
		
		linesp = line.split("");
		
		while(true) {
			if(flag == 1) {
				if(linesp[i].equals(">")) {
					x--;
				} else if(linesp[i].equals("<")) {
					x++;
				} else if(linesp[i].equals("^")) {
					y++;
				} else if(linesp[i].equals("v")) {
					y--;
				} else if(linesp[i].equals("~")) {
					flag = 0;
				} else {
					System.out.println(x);
					System.out.println(y);
					break;
				}
			} else if(flag == 0) {
				if(linesp[i].equals(">")) {
					x++;
				} else if(linesp[i].equals("<")) {
					x--;
				} else if(linesp[i].equals("^")) {
					y--;
				} else if(linesp[i].equals("v")) {
					y++;
				} else if(linesp[i].equals("~")) {
					flag = 1;
				} else {
					System.out.println(x);
					System.out.println(y);
					break;
				}
			}
			i++;
			if(i >= line.length()) {
				break;
			}
		}
		System.out.println(x);
		System.out.println(y);
	}
}
