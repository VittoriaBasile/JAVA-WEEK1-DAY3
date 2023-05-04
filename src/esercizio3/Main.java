package esercizio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		cercaQ();

	}
		public static void cercaQ() {
		  Scanner scanner = new Scanner(System.in);
          String input = "";

	          while (!input.contains(":q")) {
	              System.out.println("Inserisci una stringa (per uscire digita ':q'): ");
	              input = scanner.nextLine();
	              if (!input.contains(":q")) {
	                  String[] chars = input.split("");
	                  for (String c : chars) {
	                      System.out.print(c + ",");
	                  }
	                  System.out.println();
	              }
          }
          scanner.close();
		}
	}


