public class task3 {
    //reverse an array

    public static void revarray(int arr[]){
        int start =0;
        int end = arr.length-1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printarr(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7};
        
        printarr(arr);
        revarray(arr);
        printarr(arr);
    }
}