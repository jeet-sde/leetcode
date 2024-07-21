// check if the array is sorted

public class array3 {

public static boolean checkArray(int[]arr,int n){
 for(int i=1;i<=n;i++){
    if(arr[i]<arr[i-1])
    return false;
 }
 return true;

}
public static void main(String[] args) {
    int arr[] ={1,2,3,4,5}, n=4;

    System.out.println(checkArray(arr, n));
}
}
