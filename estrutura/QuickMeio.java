import java.util.Random;

public class QuickMeio {

    public static void main(String[] args) {

        int[] v = new int[10];
        Random gerador = new Random();

        for (int i = 0; i < v.length; i++) {
            v[i] = gerador.nextInt(50);
            System.out.print(" [" + v[i] + "]");
        }
        System.out.println();

        Meio(v, 0, v.length - 1);
        for (int i = 0; i < v.length; i++) {
            System.out.print("(" + v[i] + ")");
        }
        System.out.println();
    }

    private static void Meio(int[] v, int begin, int end) {
        if (begin < end) {
            int partitionIndex = separaMeio(v, begin, end);
            Meio(v, begin, partitionIndex - 1);
            Meio(v, partitionIndex + 1, end);
        }
    }

    private static int separaMeio(int[] v, int begin, int end) {
        int pivot = v[begin + end / 2];
        int i = begin;
        while (i <= end) {
            if (v[i] <= pivot)
                i++;
            else if (pivot < v[end])
                end--;
            else {
                int swapTemp = v[i];
                v[i] = v[end];
                v[end] = swapTemp;
                i++;
                end--;
            }
        }
        v[begin] = v[end];
        v[end] = pivot;
        return end;
    }
}
