package day15;

import java.util.Scanner;

public class CusomerMain extends Customer {

	public static void main(String[] args) {
		Customer s=new Customer();
		Scanner sc=new Scanner(System.in);
		
	
		System.out.println(s.calcprice(3000));
		s.customerInfo();
	
		sc.close();
		
		
		
		
		
		
	}

	

}
