package fundamento;

public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade = 29;
		char sexo = 'M';//variável do tipo char só aceita um caracter
		double temperatura = 26.75;
		boolean arCondicionado = false;
		nome = "Gleidson de Souza Costa";
		System.out.println("Uso de variáveis na linguagem Java");
		System.out.println("Exempolos");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("O ar esta ligado? " + arCondicionado);
		System.out.println("___________________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Operadores aritiméticos e atribuições");
		System.out.println("Exemplos");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5       | i = " + (i += 5));
		System.out.println("i -= 5       | i = " + (i -= 5));
		System.out.println("i *= 5       | i = " + (i *= 5));
		System.out.println("i /= 5       | i = " + (i /= 5));
		i++;
		System.out.println("i++          | i++ = " + i);
		i--;
		System.out.println("i--          | i-- = " + i);
	}

}
