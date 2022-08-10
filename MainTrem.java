import java.util.Scanner;

public class MainTrem{

    public static void main(String[] args) {

        Trem trem = new Trem();

        Scanner scan = new Scanner(System.in);
        
        int opcao;
        String texto;

        do{

            System.out.println("1 - Adicionar vagão");
            System.out.println("2 - Adicionar vagão em posicao especifica");
            System.out.println("3 - Remover vagão");
            System.out.println("4 - Tamanho do vagão");
            System.out.println("5 - Ver Trem");
            System.out.println("0 - Sair");
            opcao = scan.nextInt();

            if(opcao == 1){ 
                System.out.print("\nAdicionar produto ao vagão e o kilo: ");
                texto = scan.nextLine();
                texto = scan.nextLine();
                trem.incluir(texto);
                System.out.println("Adicionado");
            }

            if(opcao == 2){
                System.out.print("\nAdicionar produto ao vagão e o kilo: ");
                texto = scan.nextLine();
                texto = scan.nextLine();
                System.out.print("Digite a posicao a ser adicionada: ");
                opcao = scan.nextInt();
                System.out.println(trem.incluirPosicao(texto, opcao)?"\nAdicionado com sucesso":"\nNao foi possivel adicionar o vagao");
            }

            if(opcao == 3){ 
                System.out.print("Digite a posicao a ser removida: ");
                opcao = scan.nextInt();
                System.out.println(trem.excluir(opcao)?"\nRemovido com sucesso":"\nNao foi possivel remover o vagao");
            }

            if(opcao == 4){
                System.out.println("\nQuantidade de vagões no Trem: "+trem.qtdaDeElementosLista());    
            }

            if(opcao == 5){
                System.out.println(trem.listar());
                System.out.println();
            }
            
        }while(opcao != 0);
    }
}