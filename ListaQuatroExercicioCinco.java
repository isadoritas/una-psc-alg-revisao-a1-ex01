import java.util.Scanner;

public class ListaQuatroExercicioCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int porcentagemAcumulada, idade, tentativas;
        String estaEmDia, viagem, sintomas, contato;
        viagem = "";

        System.out.println("Informe o seu nome:");
        String nome = scanner.nextLine();
        porcentagemAcumulada = 0;

        System.out.println("\nInforme a sua idade:");
        idade = scanner.nextInt();
       

        System.out.println("\nResponda SIM ou NAO para as perguntas abaixo:");
        tentativas = 0;
       
        do {
            if (tentativas >= 3) {
                System.out.println("\n\tNão foi possível realizar o diagnóstico.\nGentileza procurar ajuda médica caso apareça algum sintoma!");
                return;
            }
            System.out.println("\n1 - Seu cartão de vacina está em dia?");
            estaEmDia = scanner.next().toLowerCase();
            tentativas++;

            if(estaEmDia.equalsIgnoreCase("NAO")) {
                porcentagemAcumulada += 10;
            }
        
        } while(!estaEmDia.equalsIgnoreCase("SIM") && !estaEmDia.equalsIgnoreCase("NAO"));
        
        tentativas = 0;
        do {
            if(tentativas >= 3) {
                System.out.println("\nNão foi possível realizar o diagnóstico.\nGentileza procurar ajuda médica caso apareça algum sintoma.");
                return;
            }

            System.out.println("\n2 - Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
            sintomas = scanner.next().toLowerCase();
            tentativas++;

            if(sintomas.equalsIgnoreCase("SIM")) {
                porcentagemAcumulada += 30;
                break;

            }

        } while(!sintomas.equalsIgnoreCase("SIM") && !sintomas.equalsIgnoreCase("NAO"));

        
        tentativas = 0;
        do {
            if(tentativas >= 3) {
                System.out.println("\nNão foi possível realizar o diagnóstico.\nGentileza procurar ajuda médica caso apareça algum sintoma.");
                return;
            }
            System.out.println("\n3 - Teve contato com pessoas com sintomas gripais nos últimos dias?");
            contato = scanner.next().toLowerCase();
            tentativas++;

            if(contato.equalsIgnoreCase("SIM")) {
                porcentagemAcumulada += 30;
                break;
            }

        } while(!contato.equalsIgnoreCase("SIM") && !contato.equalsIgnoreCase("NAO"));

        
        tentativas = 0;
        do {
            if(tentativas >= 3) {
                System.out.println("\nNão foi possível realizar o diagnóstico.\nGentileza procurar ajuda médica caso apareça algum sintoma.");
                return;
        }
        System.out.println("\n4 - Está retornando de viagem realizada no exterior?");
        viagem = scanner.next().toLowerCase();
        tentativas++;   

        if(viagem.equalsIgnoreCase("SIM")) {
            porcentagemAcumulada += 30;
        }

    } while(!viagem.equalsIgnoreCase("SIM") && !viagem.equalsIgnoreCase("NAO"));
    
    System.out.println("\nNome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("O cartão de vacina está em dia: " + estaEmDia);
    System.out.println("Teve sintomas recentemente: " + sintomas);
    System.out.println("Teve contato com pessoas infectadas: " + contato);
    System.out.println("Está retornando de viagem: " + viagem);

    if(porcentagemAcumulada <= 30) {
        System.out.println("\n\t(A probabiblidade de você estar infectado é de " + porcentagemAcumulada + "% ): ");
        System.out.println("\nPaciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
        
        if(viagem.equalsIgnoreCase("SIM")) {
            System.out.println("\nVocê ficará sob observação por 05 dias.");
        }
    } else if(porcentagemAcumulada <= 70) {
        System.out.println("\n\t(A probabilidade de você estar infectado é de " + porcentagemAcumulada + "% ):");
        System.out.println("\nPaciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
    } else if(porcentagemAcumulada >= 90) {
        System.out.println("\n\t(A probabilidade de você estar infectado é de " + porcentagemAcumulada + "% ):");
        System.out.println("\nPaciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado");
        
         scanner.close();
    }    
}
}
