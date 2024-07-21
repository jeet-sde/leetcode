public class searchinrotatedarray {

    public static int search(int k, int n, int[]arr){
        int low =0; int high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==k){

                return mid;
            }
            if(arr[low]<= arr[mid]){
                if(arr[low]==k && k<= arr[mid]){
                    high =mid-1;
                }
                else low=mid+1;
            } 
            if(arr[mid]<=k && k<=arr[high]){
                low =mid+1;

            }
            else{
                high =mid-1;
            }
        }
        return -1;

    }
    
    public static void main(String[] args) {
        int arr[] ={7,8,1,2,3,4,5,6};
        int n = arr.length, k = 1;
        int ans = search(k, n, arr);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
    }

