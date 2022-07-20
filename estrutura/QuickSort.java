import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        
        Random gerador = new Random();
        int v[] = new int[10];
        
        for(int i=0; i<v.length;i++){
            v[i]= new Random().nextInt(20);
            System.out.print(" "+v[i]);  
        }
        System.out.println();

        quickSort ( v , 0 , 9 );
        for (int i = 0; i < v.length; i++) {
            System.out.print(" "+v[i]);
        }
        System.out.println();
    }
    public static void quickSort(int v[], int begin, int end) {
        
        if(begin < end){
            int partitionIndex = partitionPivot(v, begin, end);
            quickSort(v, begin, partitionIndex - 1);
            quickSort(v, partitionIndex + 1, end);
        }
    }

    public static int partitionPivot(int v[], int begin, int end){
        int pivot = v[begin];
        int i = begin;

        for(int j = begin + 1; j <= end; j++){
            if(v[j] <= pivot){
                i++;
                int swapTemp = v[i];
                v[i] = v[j];
                v[j] = swapTemp;
            }
        }
        int swapTemp = v[i + 1];
        v[i + 1] = v[begin];
        v[begin] = swapTemp;
        return i;
    }
}