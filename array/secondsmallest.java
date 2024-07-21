// second smallest element

public class array{


    public static int secondsmallest(int a[]){
        int smallest =Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i] < smallest){
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(a[i]< smallest && a[i]!= ssmallest){
                smallest =a[i];

            }
            
        }


        return ssmallest;
        
    }
    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,4,5};
        System.out.println(secondsmallest(arr1));
    }
}