package sorting.arrays;

public class add {
    // adding and updating the array
    public static void main(String[] args) {
        int array[] ={10,20,30,40,50};

        array[2] =35;
        System.out.println("updated array:");
        
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
