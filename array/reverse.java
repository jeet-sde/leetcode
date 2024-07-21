public class reverse {
    
    static int reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        System.out.println("before reverse");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
        System.out.println();

        System.out.println("after reverse");
        for (int i=0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
