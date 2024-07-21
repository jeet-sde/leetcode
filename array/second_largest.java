// second largest element 

public class array2 {

    public static int secondlargest(int a[]) {

        int largest = a[0];
        int slargest = -1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
            }/*  else if (a[i] > slargest && a[i] != largest) {
                slargest = a[i];
            }*/
        }

        return slargest; // Simply return slargest
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        System.out.println(secondlargest(arr1)); // Output should be 5
    }
}
