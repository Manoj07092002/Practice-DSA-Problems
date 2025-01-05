public class longestPalindromeSubstr {

    public static void main(String[] args) {
        

        String s = "aaanbaabn";
    

        char [] res =s.toCharArray();

        int maxlen =0;

        String original ="" ;

        //int [] res = {2,4,6,8};

        for (int i = 0; i <res.length ; i++) {

            for (int j = i; j < res.length; j++) {

               // String x = "";

                String x = s.substring(i, j + 1);
/*
 *                 for(int k =i ; k <= j ;k++){

                    x=x+res[k];//aba
                }
 */


                if (ispalindrome(x)){

                    int len = x.length();//3
                    
                    if(len > maxlen){

                        original=x;
                        maxlen=len;
                    }

                }  
            }
        }
        System.out.println(maxlen);
        System.out.println(original);
    }

    static boolean ispalindrome (String s){

       //s =anna

        int l = 0 , r = s.length()-1;

        while(l < r){

            if( s.charAt(l)==s.charAt(r)  ){

                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;

    }

    
    
}
