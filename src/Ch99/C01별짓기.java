package Ch99;

import java.util.Scanner;

public class C01별짓기 {

	public static void main(String[] args) {
		
		System.out.println("원하는 별 높이 입력>>");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int i=0;
		int j=0;
		int k=0;
		
		while(i<h)
		{
			j=0;
			while(j<=(h-2)-i) {
				System.out.print(" ");
				j++;
			}

			k=0;
			while(k<=2*i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
			
		}
	}

}
