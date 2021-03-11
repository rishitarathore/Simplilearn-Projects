package Assessment_Phase_1;
import java.io.*;
import java.util.Scanner;
public class Directory {
	public static void main(String[] args)throws IOException {
		Operations o = new Operations();
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println("             Welcome to LockedMe.com");
		System.out.println("          Developed By: Rishita Rathore ");
		System.out.println("=================================================");
		System.out.println("Directory: Current Directory \n");
		int i;
		char c;
		do{
			System.out.println("-------------------------------------------------");
			System.out.println("Select preferred action using below menu: ");
			System.out.println("-------------------------------------------------");
			System.out.println("1 -> Display file names in ascending order");
			System.out.println("2 -> Other operations");
			System.out.println("3 -> Close the application");
			System.out.println("-------------------------------------------------");
			System.out.println("Enter your choice: ");
			i = sc.nextInt();
			switch (i) {
			case 1:
				File dir = new File(".");
				o.ListDirectory(dir);
				break;
			case 2:
				 do {
					System.out.println("-------------------------------------------------");
					System.out.println("  a -> Add a file ");
					System.out.println("  b -> Delete a file");
					System.out.println("  c -> Search a file");
					System.out.println("  d -> Go to main menu");
					System.out.println("-------------------------------------------------");
					System.out.println("Enter your choice: ");
					c = sc.next().charAt(0);
					switch(c) {
					case 'a':
						o.Add();
						break;
					case 'b':
						o.Delete();
						break;
					case 'c':
						o.Search();
						break;
					}
				 } while(c != 'd');
				 break;
			case 3:
				System.out.println("Application closed.");
				return;
			}
		}while(i != 3); 
		sc.close();
	}
}
