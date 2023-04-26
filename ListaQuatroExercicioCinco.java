import java.util.Scanner;

public class ListaQuatroExercicioCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("\nInforme a sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();
        

        String estaEmDia;
        int tentativas = 0;
        do {
            if (tentativas >= 3) {
                System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                break;
            }
            System.out.println("\n1 - Seu cartão de vacina está em dia?");
            estaEmDia = scanner.nextLine().toLowerCase().trim();
            tentativas++;
        
        } while(!estaEmDia.equals("sim") && !estaEmDia.equals("não"));
        
        String sintomas;
        tentativas = 0;
        do {
            if(tentativas >= 3) {
                System.out.println("\nNão foi possível realizar o diagnóstico.\nGentileza procurar ajuda médica caso apareça algum sintoma.");
                break;
            }

            System.out.println("\n2 - Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
            sintomas = scanner.nextLine().toLowerCase();
            tentativas++;

        } while(!sintomas.equals("sim") && !sintomas.equals("não"));

        String contato;
        tentativas = 0;
        do {
            if(tentativas >= 3) {
                System.out.println("\nNão foi possível realizar o diagnóstico.\nGentileza procurar ajuda médica caso apareça algum sintoma.");
                break;
            }
            System.out.println("\n3 - Teve contato com pessoas com sintomas gripais nos últimos dias?");
            contato = scanner.nextLine().toLowerCase();
            tentativas++;

        } while(!contato.equals("sim") && !contato.equals("não"));

        String viagem;
        tentativas = 0;
        do {
            if(tentativas >= 3) {
                System.out.println("\nNão foi possível realizar o diagnóstico.\nGentileza procurar ajuda médica caso apareça algum sintoma.");
                break;
        }
        System.out.println("\nEstá retornando de viagem realizada no exterior?");
        viagem = scanner.nextLine().toLowerCase();
        tentativas++;   

    } while(!viagem.equals("sim") && !viagem.equals("não"));

    
    scanner.close();
}
} 
