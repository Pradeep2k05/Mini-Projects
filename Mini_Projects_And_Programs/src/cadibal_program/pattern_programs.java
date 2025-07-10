package cadibal_program;

import java.util.Scanner;

public class pattern_programs {

	public static void main(String[] args) {
  
		Scanner s=new Scanner(System.in);
		 
	//	System.out.print("Enter the value of a:");
	//	int a =s.nextInt();
		
	//	int a=5;
		
		/*for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}*/
	
		int a=5;
		for(int i=1; i>=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("$");
			}
			System.out.println();
			
		}
	}
	

}
