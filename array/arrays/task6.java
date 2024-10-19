public class task6 {

    public static int printarr(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){
            if(arr[i] >max ){
                secondMax = max;
                max = arr[i];
                
            }else if ( arr[i] > secondMax && arr[i] != max){
                secondMax =arr[i];
            }
    
            
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] ={2,4,5,6,3,1};


        int maxvalue = printarr(arr);
        System.out.println(maxvalue);
        }
    
}
