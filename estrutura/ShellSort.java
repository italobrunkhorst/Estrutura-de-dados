import java.util.Random;

public class ShellSort {
    
    public static void main(String[] args) {

        int v[] = new int[10];
        int i, j, value, size = v.length;
        int gap = 1;
        
        Random gerador = new Random();

        for(i=0; i<v.length;i++){
            v[i]= new Random().nextInt(20);
            System.out.print(" "+v[i]);  
        }
        System.out.println();

        while(gap < size){
            gap = 3 * gap + 1;
        }
        while(gap > 1){
            gap /= 3;
            for(i = gap; i < size; i++){
                value = v[i];
                j = i - gap;
                while(j >= 0 && value > v[j]){ //crescente value < v[j] ou decrescente value > v[j]
                    v[j + gap] = v[j];
                    j -= gap;
                }
                v[j + gap] = value;
            }
        }
        for (i = 0; i < v.length; i++) {
            System.out.print(" "+v[i]);
        }

    }
}
