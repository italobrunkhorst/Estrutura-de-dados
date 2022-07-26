import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        Random gerador = new Random();
        int v[] = new int[10];
        
        //for(int a=0; a<=10; a++){
            for(int i=0; i<v.length;i++){
                v[i]= new Random().nextInt(100);
                System.out.print(" "+v[i]);  
            }
            System.out.println();
            
            for(int i = v.length; i >= 1; i --){
                for(int j = 1; j < i; j++){
                    if(v[j - 1] > v[j]){ // crescente v[j - 1] > v[j] ou decrescente v[j - 1] < v[j]
                        int aux = v[j];
                        v[j] = v[j - 1];
                        v[j - 1] = aux;
                    }
                }
            }

            for (int i = 0; i < v.length; i++) {
                System.out.print(" "+v[i]);
            }
            System.out.println();
            System.out.println();

        //}
    }
    
}