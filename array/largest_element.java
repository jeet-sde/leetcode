// largest element in an array 

public class array1 {

    public static int largestElement(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int arr1[] = {2, 3, 5, 1, 4};
        System.out.println(largestElement(arr1));  // should print 5
    }
}
