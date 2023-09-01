import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro par�metro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo par�metro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o m�todo contendo a l�gica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception e) {
			//imprimir a mensagem: O segundo par�metro deve ser maior que o primeiro
			e.printStackTrace();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException("O primeiro numero deve ser menor que o segundo!");
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os n�meros com base na vari�vel contagem
		for (int indice = 0; indice < contagem; indice++) {
			System.out.println("Imprimindo o n�mero " + (indice+1));
		}
	}
}