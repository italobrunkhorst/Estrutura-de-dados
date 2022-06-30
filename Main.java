import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        
        Random gerador = new Random();
        int v[] = new int[10];
        
        for(int i=0; i<v.length;i++){
            v[i]= new Random().nextInt(20);
            System.out.print(" "+v[i]);  
        }
        System.out.println();
        
        
    }
}
