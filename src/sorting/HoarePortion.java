package sorting;

public class HoarePortion {
    public static void main(String[] args) {
        int arr[] = new int[]{5,3,8,4,2,7,1,10};

        int n = arr.length;
        portion(arr,0,n-1);

        for(int x: arr)
            System.out.print(x+" ");
    }

    static int portion(int[] arr, int l, int h)
    {
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j)return j; // there are cross each others
            int temp=arr[i];  // swap
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
