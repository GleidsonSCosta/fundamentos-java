package fundamento;

public class Repeticao {

	public static void main(String[] args) {
		System.out.println("LAÇOS DE REPETIÇÃO");
		System.out.println("");
		System.out.println("Exemplo 1 : Uso do 'FOR'");
		System.out.println("");
		for(int i = 10; i > 0; i--) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Tabuada");
		for(int j = 1; j <= 10; j++) {
			int valor = 3 * j;
			System.out.println((valor / j) + " x " + j +  " = " + valor );
		}
		System.out.println("Outro exemplo de Tabuada");
		for(int tabuada = 1; tabuada <= 10; tabuada++) {
			System.out.println("");
			for(int num = 1; num <= 10; num++) {
				System.out.println(tabuada + " x " + num + " = " + tabuada * num);
			}
		}
		System.out.println("");
		System.out.println("Exemplo 1 : Uso do 'WHILE'");
		System.out.println("");
		int numero = 0;
		while(numero <= 100) {
			if(numero % 2 == 1) {
				System.out.println(numero);
			}
			numero++;
		}

	}

}
