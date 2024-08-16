public class Remove_consecutive_2 {


    public static String Remove(String S){
        int n =S.length();
        String s ="";

        for(int i=0; i<n; i++){

            if(i<n-1 && S.charAt(i)== S.charAt(i+1)){
                continue;

            }
            else{

                s = s+S.charAt(i);
            }
        }

        return s;
    }

    public static void main(String[] args) {
        
        String S ="aabaa";
        System.out.print(Remove(S));
    }
    
}
