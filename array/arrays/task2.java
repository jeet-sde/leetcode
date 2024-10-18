public class task2 {
    
    // remove odd elements
    public static void printarr(int arr[]){
        for(int i =0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]+ " ");
            }
           
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,6,7};

        printarr(arr);
    }
}
