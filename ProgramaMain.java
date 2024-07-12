package aplicacao;

import java.util.Scanner;

public class ProgramaMain {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o imposto: ES ou RJ");
        String escolha = scanner.nextLine().trim().toUpperCase();

        cauculo imposto;
        if ("ES".equals(escolha)) {
            imposto = new ImpostoES();
        } else if ("RJ".equals(escolha)) {
            imposto = new ImpostoRJ();
        } else {
            System.out.println("Opção inválida. Usando imposto padrão RJ.");
            imposto = new ImpostoRJ();
        }

        RecebeValor recebeValor = new RecebeValor(imposto);

        System.out.println("Digite o valor para calcular a taxa:");
        double valor = scanner.nextDouble();

        final double taxa = recebeValor.taxa(valor);
        System.out.println("A taxa calculada é: " + taxa);

        scanner.close();
    }
    
}
