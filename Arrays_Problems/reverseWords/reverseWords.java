

public class reverseWords {

    public static void main(String[] args) {
        
        String s = "i.like.this.program.very.much";

        

        System.out.println();

        String [] res = s.split("\\.");

        for(int i =res.length -1 ; i>=0; i--){

            if(i == 0){
                System.out.print(res[i]);
            }
            else
               System.out.print(res[i]+".");

        }  
    }
}
class main {
    public static void main(String[] args) {

        String s = "i.like.this.program.very.much"; // man.noj

        int len = s.length();
        StringBuilder s2 = new StringBuilder();
        int r =0 ;

        for(int i=s.length()-1 ; i >= 0 ; i--){

            if(s.charAt(i) == '.'){

                r = len - i ;

                len = i - 1;

                s2.append(s.substring(len, r));
                s2.append(".");

            }
        }

    }
}