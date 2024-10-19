public class task5 {

    public static int printarr(int arr[]){
        int max =arr[0];
        for(int i= 0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,3,4,1};

        int maxvalue = printarr(arr);
        System.out.println("value is :" + maxvalue);
    }
    
}
