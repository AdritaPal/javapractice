

package oops;

import java.util.*;

public class LIC {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		String[] s=new String[n];
		int i=0;
		while(i<s.length) {
			s[i]=sc.nextLine();
			i++;

		}

		
		for (int j = n-1;j>=0;j--) {
			System.out.println(s[j]);
		}
	}
}