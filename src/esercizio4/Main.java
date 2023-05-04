package esercizio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		countDown();

	}
	public static void countDown() {
		  Scanner scanner = new Scanner(System.in);
          System.out.println("Inserisci una numero : ");
		  int input= scanner.nextInt();

			  for (int i= input; i >= 0; i--) {
				  
				  System.out.println(i);
				  
			  } 
		  
		  

	          
        
        scanner.close();
		}
	}

