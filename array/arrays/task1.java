public class task1 {
    // remove even intergers

    public static void printarr(int arr[]){

        for(int i =0;i<arr.length; i++){
            if(arr[i] % 2 == 0){

            
            System.out.print(arr[i]+ " ");
            }
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int arr[] ={3,2,4,7,10,6,5 };
        printarr(arr);
    }
   
}
