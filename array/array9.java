public class array9 {

    public static int missing(int arr[], int N){
        int xor =0, xor1 =0;
        
        for(int i=1;i<N-1;i++){
            xor1 = xor1^arr[i];
            xor1 =xor1^(i+1);

        }
        xor1 = xor1 ^ N; //XOR up to [1...N]


        return xor^xor1;
    }

    public static void main(String[] args) {
        int N=5;
        int arr1[] ={1,2,3,5};
     System.out.println(missing(arr1, N));
    }
    
}
