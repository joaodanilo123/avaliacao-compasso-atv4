import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emojis {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite uma frase com emojis :-) ou :-(");
		String entrada = s.nextLine();
		s.close();
		
		int felizes = contar(":-\\)", entrada);
		int tristes = contar(":-\\(", entrada);
		
		if(felizes > tristes) {
			System.out.println("divertido");
		}
		
		if(felizes < tristes) {
			System.out.println("chateado");
		}
		
		if(felizes == tristes) {
			System.out.println("neutro");
		}
		
	
	}
	
	public static int contar(String padrao, String frase) {
		Matcher matcher = Pattern.compile(padrao).matcher(frase);
		int contagem = 0;
		
		while (matcher.find()) {
			contagem++;
		}	
	
		return contagem;
		
	}

}
