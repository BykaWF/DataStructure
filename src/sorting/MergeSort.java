package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {10,15,20};
        int[] b = {5,6,6,15};
        efficientMerge(a,b);
    }

    static void efficientMerge(int[] a, int[] b){
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length){

            if(a[i] <= b[j]){ // 5 < 10
                System.out.print(a[i] + " ");
                i++;
            }else{
                System.out.print(b[j] + " ");
                j++;

            }
        }

        while (i < a.length){
                System.out.print(a[i] + " ");
                i++;
        }

        while (j < b.length){
            System.out.print(b[j] + " ");
            j++;
        }
    }
}
