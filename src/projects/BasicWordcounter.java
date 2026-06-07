package projects;
import java.util.Scanner;

public class BasicWordcounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence to count : ");
		String str = sc.nextLine();
		
		int spaces=0;
		
		String[] words=str.split("\\s+");
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=' '&&(i==0|| str.charAt(i-1)==' ')) {
				
				spaces++;
			}
			
		}
		System.out.println("count of words ="+spaces);
		sc.close();
	}

}
