package differential;

import java.util.Scanner;

public class Differential_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of a > ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of h > ");
		double h = Double.parseDouble(scan.next());
		
		Differential_lib dlib = new Differential_lib(a, h);
		System.out.println("f(x) = x^2 の x = "+a+" における微分係数は "+dlib.getRx());
		System.out.println("f(x) = x^2 の x = "+a+" における数値係数は "+dlib.getDx());
		a = ((dlib.getRx()-dlib.getDx())/dlib.getRx())*100;
		System.out.println(" 相対誤差 "+Math.abs(a));


		

	}

}
