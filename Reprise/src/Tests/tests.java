package Tests;

import java.util.Scanner;

public class tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String out ="n";
		while (!out.equals("o") && !out.equals("O"))
		{
			Scanner keyboard = new Scanner(System.in);
		System.out.print("Veuillez saisir la somme : ");
		
		int x = keyboard.nextInt();
		
		System.out.print("e pour euro d pour dollar : ");
		keyboard = new Scanner(System.in);
		String s = keyboard.nextLine();
		
		
			if (s.equals("e") || s.equals("E"))
				System.out.println("la somme en dinar est : " + x*211);
			else 
			{
				if (s.equals("d") || s.equals("D"))
					System.out.println("la somme en dinar est : " + x*180);
				else 
					System.out.println("Symbole non reconu ");
			}
			keyboard = new Scanner(System.in);
			
			System.out.print("Voulez vous sortir? n(Non) ou o(Oui) : ");
			out = keyboard.nextLine();
			
		}
	}

}
