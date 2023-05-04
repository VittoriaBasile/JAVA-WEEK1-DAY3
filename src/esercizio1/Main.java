package esercizio1;

public class Main {

	public static void main(String[] args) {
		System.out.println(pariDispari("ciao"));
		System.out.println(pariDispari("hello"));
		System.out.println(annoBisestile(2024));
		System.out.println(annoBisestile(2023));


	}
	public static boolean pariDispari(String word) {
		return word.length()% 2 ==0 ? true : false;
	}
	
	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0) {
			return true;
		}else if(anno % 100 == 0 && anno % 400 ==0) {
			return true;
		}else {
			return false;
		}
		
	}

}
