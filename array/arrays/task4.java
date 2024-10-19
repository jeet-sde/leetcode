public class task4 {

    public static int printarr(int arr[]){
        int min  = arr[0];
        for(int i =0; i<arr.length;i++){
            if(arr[i] < min) {
                min =arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4,1,5,6};

        int minvalue = printarr(arr);
        System.out.println("value:" +  minvalue);
    }
}
