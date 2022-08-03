import java.util.Scanner;

public class MainLista{

    public static void main(String[] args) {

        Lista lista = new Lista();

        Scanner scan = new Scanner(System.in);
        
        int opcao;
        String texto;

        do{

            System.out.println("1 - Adicionar a lista");
            //System.out.println("2 - Adicionar a lista em posicao especifica");
            //System.out.println("3 - Remover da lista");
            //System.out.println("4 - Tamanho da lista");
            System.out.println("2 - Ver lista");
            System.out.println("0 - Sair");
            opcao = scan.nextInt();

            if(opcao == 1){ 
                System.out.print("\nDigite algo a lista: ");
                texto = scan.nextLine();
                texto = scan.nextLine();
                lista.incluir(texto);
                System.out.println("Adicionado");
            }

            /*if(opcao == 2){
                System.out.print("\nDigite algo a lista: ");
                texto = scan.nextLine();
                texto = scan.nextLine();
                System.out.print("Digite a posicao a ser adicionada: ");
                opcao = scan.nextInt();
                System.out.println(lista.incluirPosicao(texto, opcao)?"\nAdicionado com sucesso":"\nNao foi possivel adicionar o item");
            }*/

            /*if(opcao == 3){ 
                System.out.print("Digite a posicao a ser removida: ");
                opcao = scan.nextInt();
                System.out.println(lista.excluir(opcao)?"\nRemovido com sucesso":"\nNao foi possivel remover o item");
            }*/

            /*if(opcao == 4){
                System.out.println("\nQuantidade de itens na lista: "+lista.qtdaDeElementosLista());    
            }*/

            if(opcao == 2){
                System.out.println(lista.listar());
            }
            
        }while(opcao != 0);
    }
}