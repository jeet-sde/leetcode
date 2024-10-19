public class task7 {
    //second smallest element

    public static int printarr(int arr[]){
        int secondmin =arr[0];
        int min = Integer.MAX_VALUE;

        for(int i =0; i<arr.length;i ++){
            if(arr[i] < min ){
                secondmin = min;
                min =arr[i];
            }
            else if(arr[i] < secondmin && arr[i] != min ){
                secondmin =arr[i];
            }

        }


        return secondmin;

    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
    
    int minvalue = printarr(arr);
    System.out.println(minvalue);
    
    }
}
