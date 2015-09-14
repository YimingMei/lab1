//Lab1 by Yiming Mei

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class lab1 {

private static Scanner input2;

public static void main (String[] args){
	double r;
	double n;
	double y;
	double p;
	double f;
	boolean t;
	f=0;
	double PV;	
	r=(0.02/12);
	@SuppressWarnings("resource")
	Scanner input1 = new Scanner(System.in);
	r=input1.nextDouble();
	System.out.print("enter a annual return");
	n=20*12;
	input2 = new Scanner(System.in);
	n=input2.nextDouble();
	System.out.print("enter a year retired");
	y=10000-2642;
	@SuppressWarnings("resource")
	Scanner input3 = new Scanner(System.in);
	y=input3.nextDouble();
	System.out.print("enter a tetired income");
	f=0;
	t=false;
			
	PV=FinanceLib.pv(r, n, y, f, t);
	
	System.out.println(PV);
	
	double PMT;
	
	r=(0.09/12);
	@SuppressWarnings("resource")
	Scanner input4 = new Scanner(System.in);
	r=input4.nextDouble();
	System.out.print("enter a annual return");
	n=23*12;
	@SuppressWarnings("resource")
	Scanner input5 = new Scanner(System.in);
	n=input5.nextDouble();
	System.out.print("enter years to work");
	p=0;
	f=PV;
	t=false;
	
	PMT = FinanceLib.pmt(r,n,p,f,t);
	System.out.print(PMT);
	
  }

}
