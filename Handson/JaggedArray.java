package Handson;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		float sum=0;
		float val = 0f;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows: ");
		int n=sc.nextInt();
		
		int arr[][]=new int[n][];
		int max=0;
		
		for (int i=0; i<n;i++) {
			
			System.out.println("Row 1 no. of values ");
			int m=sc.nextInt();
			if(max<m) {
				max=m;
			}
			arr[i]=new int[m];
			
			for(int j = 0; j<m;j++) {
				System.out.println("value for row"+i+"column"+j);
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int col=0;col<max;col++) {
			sum=0;
			val=0;
			for(int row=0;row<arr.length;row++) {
				if(col<arr[row].length) {
					sum=sum + arr[row][col];
					val++;
				}
				
			}
			System.out.print(sum/val+" ");
		}
//		for(int i = 0; i<n;i++ ) {
//			for(int j=0;j<arr[i].length;j++) {
//
//				sum=(sum+arr[i][j]);
//				val=val+1;
//
//								
//			}
////			System.out.println(val);
//
//			System.out.print(sum/val+" ");
//			sum=0;
//			val=0;
//		}
	
				
	}

}
