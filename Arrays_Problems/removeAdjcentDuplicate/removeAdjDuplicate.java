
import java.util.Arrays;

public class removeAdjDuplicate {

    public static void main(String[] args) {
        

        String s = "geeksforgeek";

        char [] res = s.toCharArray();


        for(int i = 0 ;i <res.length-1;i++){

            if(res[i] == res [i+1]){

                res[i]=' ';
                res[i+1]= ' ';

            }

        }

        String out = new String(res);

        System.out.println(out.replaceAll(" ", ""));
    }
    
}
