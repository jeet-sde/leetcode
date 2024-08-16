public class Remove_consecutive {
public static String Remove_consecutive_character(String S){

    int n=S.length();
    String res = "";

    for(int i=0; i<n;i++){
        if(i<n-1 && S.charAt(i)==S.charAt(i+1)){
            continue;
        }
        else
        {
            res = res+ S.charAt(i);
        }
    }
    return res;
}



    public static void main(String[] args) {
        
        String S ="aabbc";
        System.out.print(Remove_consecutive_character(S));
    }
    
}
