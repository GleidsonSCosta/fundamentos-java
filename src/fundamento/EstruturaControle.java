package fundamento;

public class EstruturaControle {

	public static void main(String[] args) {
		char sexo = 'M';
		int idade = 29;
		System.out.println("ESTRUTURA DE CONTROLES");
		System.out.println("");
		System.out.println("Exemplo 1 : Uso do 'if'");
		System.out.println("");
		sexo = 'M';
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatório");
		}
		System.out.println("");
		System.out.println("Exemplo 2 : Uso do 'if - else'");
		System.out.println("");
		if(idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Exemplo 3 : Uso do 'else if'");
		System.out.println("");
		idade = 71;
		if (idade < 16) {
			System.out.println("VOTO PROIBIDO");
		}
		else if (idade >= 18 && idade <= 70) {
			System.out.println("VOTO OBRIGATÓRIO");
		}
		else {
			System.out.println("VOTO FACULTATIVO");
		}
		
		System.out.println("");
		System.out.println("Exemplo 4 : Uso do 'switch - case'");
		System.out.println("");
		String cor = "Amarelo";
		switch (cor) {
		case "Azul":
			System.out.println("Cor Azul");
			break;
		case "Amarelo":
			System.out.println("Cor Amarelo");
			break;
		case "Rosa":
			System.out.println("Cor rosa");
			break;
		default:
			System.out.println("Cor inválida");
			break;
		}

	}

}
