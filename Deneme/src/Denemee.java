import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

//import java.io.Console;

public class Denemee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello Git");
		// System.out.println("That s the word.");
		// System.out.println("Bu da 3. sat�r�m.");

		// for (int i=1;i<6;i++){
		// System.out.println(i);
		// }

		// Console cons = System.console();
		// char[] pswd = cons.readPassword("�ifreniz : ");
		// System.out.println(pswd);

		// System.out.printf("%+.2f", 1000000.0/3.0);

		// ctrl forward slash yorum sat�r�...
		// Scanner in = new Scanner(System.in);
		// System.out.print("�sim : ");
		// String name = in.nextLine();
		// System.out.print("Ya��n�z� girin : ");
		// int age = in.nextInt();
		// String yazi = String.format("\n�sminiz : %s, ya��n�z %d", name, age);
		// System.out.println(yazi);
		// in.close();

		// tarih denemesi
//		System.out.printf("%1$s %2$tB %2$te, %2$tY \n", "Due date: ",
//				new Date());
//		System.out.printf("%tB", new Date());
		Scanner in = null;
		
		try {
			in = new Scanner(Paths.get("C:\\javafaylz\\myfile.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Dosya bulunamad� ya da okunamaz halde.");
		}
		
		in.close();
		
		PrintWriter out = null;
		try {
			out = new PrintWriter("C:\\javafaylz\\myoutput.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.close();
	}

}
