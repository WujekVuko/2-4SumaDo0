package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    	boolean c = false;
		int a  = -1;
		int b = 0;
		Scanner in = new Scanner(System.in);
		while(a != 0){
	    	System.out.print("Podaj liczbę: ");
	    	a = in.nextInt();
	    	b += a;

	}
	System.out.print("Suma tych liczb to " + b +".");
    }
}
