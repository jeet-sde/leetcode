public class task8 {
    // move all zero to end

    public static void printarr(int arr[]){
        int j =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!= 0){
            arr[j++] = arr[i];
            }
           
            
        }
        while (j<arr.length){
            arr[j++] =0;
        }
    }
    public static void main(String[] args) {
        int arr[] ={2,0,3,0,1,0,4};

        printarr(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
