import java.util.Scanner;
import dio.fluxo.exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parâmetro:");
            int primeiroNumero = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int segundoNumero = terminal.nextInt();

            contar(primeiroNumero, segundoNumero);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: " + exception.getMessage());

        }finally {
            terminal.close();
        }
    }
    static void contar(int primeiroNumero, int segundoNumero )
            throws ParametrosInvalidosException {

        if (primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoNumero - primeiroNumero;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
