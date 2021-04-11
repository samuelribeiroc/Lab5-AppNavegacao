import MeioTransporte.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kms, transporte, opcao;
        boolean fimDoTrajeto = false;

        MeioTransporte meioTransporte;

        int duracaoTrajeto;

        System.out.print("Por favor, informe o tamanho do percurso em quilometros: ");
        kms = sc.nextInt();

        do {
            System.out.print("Agora, por favor, informe o meio de transporte\n" +
                    "(1) A pe (2) Carro (3) Onibus (4) Metro: ");
            transporte = sc.nextInt();
            switch (transporte) {
                case 1:
                    meioTransporte = new Pedestre();
                    break;
                case 2:
                    meioTransporte = new Carro();
                    break;
                case 3:
                    meioTransporte = new Onibus();
                    break;
                case 4:
                    meioTransporte = new Metro();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + transporte);
            }
            duracaoTrajeto = meioTransporte.calcularRota(kms);
            System.out.println("Calculando a rota de " + meioTransporte.toString() + "…\n" +
                    "Seu trajeto ira durar " + duracaoTrajeto + "minutos.");
            System.out.print("Escolha uma opcao:\n" +
                    "(1) Alterar meio de transporte (2) Encerrar trajeto: ");
            opcao = sc.nextInt();
            if (opcao == 2) {
                fimDoTrajeto = true;
            }
        } while (!fimDoTrajeto);
    }
}
