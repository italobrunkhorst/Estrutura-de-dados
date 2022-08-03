import java.util.Random;

public class QuickInicio {

    public static void main(String[] args) {

        int[] v = new int[10];
        Random gerador = new Random();

        for (int i = 0; i < v.length; i++) {
            v[i] = gerador.nextInt(10);
            System.out.print("(" +v[i] + ")");
        }
        System.out.println();

        quickSort(v, 0, v.length - 1);
        for (int i = 0; i < v.length; i++) {
            System.out.print( "(" +v[i] + ")");
        }
        System.out.println();

    }

    private static void quickSort(int[] v, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partitionPivot(v, begin, end);
            quickSort(v, begin, partitionIndex - 1);
            quickSort(v, partitionIndex + 1, end);
        }
    }

    private static int partitionPivot(int[] v, int begin, int end) {
        int pivot = v[begin];
        int i = begin + 1;
        while (i <= end) {
            if (v[i] <= pivot)
                i++;
            else if (pivot < v[end])
                end--;
            else {
                int swap = v[i];
                v[i] = v[end];
                v[end] = swap;
                i++;
                end--;
            }
        }
        v[begin] = v[end];
        v[end] = pivot;
        return end;
    }
}
