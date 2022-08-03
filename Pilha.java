import java.util.Scanner;

public class Pilha {

    public static int topo = 0;
    public static final int TAM = 5;
    public static int pilha[] = new int[TAM];

    public static boolean verificaPilha(){
        if(topo == TAM){
            return true;    
        }
        return false;
    }
    public static boolean adicionarPilha(int valor){
        if(verificaPilha() == false){
            pilha[topo] = valor;
            topo++;
            return true;  
        }
        else{
            return false;
        }
    }
    public static void verPilha(){
        if(topo == 0){
            System.out.println("Pilha vazia.\n");
        }else{
            for(int a = topo-1; a > -1; a--){
                if(a < TAM){
                    System.out.println("Valor: "+pilha[a]);
                }else{ 
                    System.out.println("Valor: "+pilha[a]);
                }
            }
            System.out.println("\n");
        }
    }
    public static boolean removerDaPilha(){
        if(topo > 0){
            System.out.println("Valor "+pilha[topo-1]+" removido da pilha.\n");
            topo--;
            return true;
        }else{
            return false;
        }
    }
    public static int buscarValor(int valor){
        if(topo == 0){
            return -1;
        }else if(topo != 0){
            for(int a = 0; a < pilha.length; a++){
                if(pilha[a] == valor){
                    System.out.println("Valor "+valor+" encontrado na posição "+(a+1)+".\n");
                }
            }
        }
        return -2;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opcao = 0, valor, posicao = 1;
        boolean aux;

        do{

            System.out.println("(1) Adicionar a pilha");
            System.out.println("(2) Visualiza pilha");
            System.out.println("(3) Remover da pilha");
            System.out.println("(4) Buscar numero na pilha");
            System.out.println("(0) Sair");
            System.out.print("-> ");
            opcao = scan.nextInt();

            if(opcao == 1){
                System.out.print("Digite o valor: ");
                valor = scan.nextInt();
                aux = adicionarPilha(valor);
                if(aux == true){
                    System.out.println("Valor adicionado.\n");
                }else{
                    System.out.println("Pilha cheia.\n");
                }
            }
            if(opcao == 2){
                verPilha();
            }
            if(opcao == 3){
                aux = removerDaPilha();
                if(aux == true){
                    System.out.println("Valor removido.\n");
                }else{
                    System.out.println("Pilha vazia.\n");
                }
            }
            if(opcao == 4){
                System.out.print("Qual valor deseja buscar: ");
                valor = scan.nextInt();
                posicao = buscarValor(valor);
                if(posicao == -1){
                    System.out.println("Pilha vazia.\n");
                }else if(posicao == -2){
                    System.out.println("Valor não encontrado.\n");
                }
            }
        }while(opcao != 0);
    } 
}