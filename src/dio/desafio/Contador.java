package dio.desafio;

import java.util.Scanner;
import dio.desafio.exception.ParametrosInvalidosException;
public class Contador {
    public static void main(String[] args) {
        while (true) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int primeiroNumero = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int segundoNumero = terminal.nextInt();

            try {
                contar(primeiroNumero, segundoNumero);
            } catch (ParametrosInvalidosException exception) {
                System.out.println("ERRO: " + exception.getMessage());
            } finally {
                System.out.println("\nDigite 0 para encerrar o programa ou outra tecla para continuar...");
                String decisao = terminal.next();
                if (decisao.equals("0")) {
                    break;
                }else{
                    System.out.println("Certo! Vamos continuar...");
                }
            }
        }
    }
    static void contar(int primeiroNumero, int segundoNumero ) throws ParametrosInvalidosException {

        if (primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = segundoNumero - primeiroNumero;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
