package projeto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Bom dia Hilario e Catarina";
		String lowerFrase = frase.toLowerCase();
		String upperFrase = frase.toUpperCase();
		
		//Retira os espa�os nos cantos da string
		String semEspa�os= frase.trim();
		
		//Recorta a string
		String recorte = frase.substring(2, 5);
		
		//Replace os a por 1
		String rep= frase.replace('a', '1');
		
		//Descobrir onde est� a letra a
		int i= frase.indexOf('a');
		
		//Descobrir o ultimo r
		int j = frase.lastIndexOf('r');
		
		//Recortar a string e armazenar la em diversos vetores
		String s = "potato apple lemon";
		String [] vect = s.split(" ");
		String word1= vect[0];
		String word2= vect[1];
		String word3= vect[2];
		
		System.out.println("frase: " + frase);
		System.out.println("toLowerCase: " + lowerFrase);
		System.out.println("toUpperCase: " + upperFrase);
		System.out.println("Trim : " + semEspa�os);
		System.out.println("Recorte: "+ recorte);
		System.out.println("Replace " + rep);
		System.out.println("A letra 'a' est� na posi��o: " + i);
		System.out.println("A letra 'r' est� na posi��o: " + j);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		
	}

}
