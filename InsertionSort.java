import java.util.Random;

public class InsertionSort {
    
    public static void main(String[] args) {
        
        Random gerador = new Random();
        int v[] = new int[10];
        long tempo;
        
        long tempoInicial = System.currentTimeMillis();
        for(int i=0; i<v.length;i++){
            v[i]= new Random().nextInt(20);
            //System.out.print(" "+v[i]);  
        }
        //System.out.println();

        for (int i = 1; i < v.length; i++) { 
		
            int j = i;
        
            while (j > 0 && v[j] < v[j-1]) { // crescente j > 0 && v[j] < v[j-1] ou decrescente j > 0 && v[j] > v[j-1]
                int aux = v[j];
                v[j] = v[j - 1];
                v[j - 1] = aux;
                j -= 1;
            }
        }
        System.out.println("10");
        for (int i = 0; i < v.length; i++) {
            //System.out.print(" "+v[i]);
        }
        long tempoFinal = System.currentTimeMillis();
        tempo = tempoFinal - tempoInicial;
        System.out.println(" "+tempo);
        //System.out.printf(" ms%n", (tempoFinal - tempoInicial) );
    }
}
