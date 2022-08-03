import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        
        Random gerador = new Random();
        int v[] = new int[100];
        
        for(int i=0; i<v.length;i++){
            v[i]= new Random().nextInt(20);
            //System.out.print(" "+v[i]);  
        }
        System.out.println();

        for(int i = 0; i < v.length; i++){
                int i_menor = i;
            for(int j = i +1; j < v.length; j++){
                if(v[j] > v[i_menor]){ //crescente v[j] < v[i_menor] ou decrescente v[j] > v[i_menor]
                    i_menor = j;
                }
            }

            int aux = v[i];
            v[i] = v[i_menor];
            v[i_menor] = aux;
        }

        for (int i = 0; i < v.length; i++) {
            //System.out.print(" "+v[i]);
        }
    }
}