class atoi{

    public static void main(String args []){


        // convert string into integer.

        String str = "-123";

        //int res = atoi1(str);

        System.out.println(res); 
    }
    static int atoi1(String s){
        
        int sign = 0 ;
        int res =0;

        for(int i =0 ;i <s.length(); i++){

            if(i == 0 && s.charAt(i) == 45){
                sign =1;
                continue;
            hiii
                hemanth
            }

            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){

                if(i == 0){
                    res = res + (s.charAt(i) - 48);

                }
                else{

                    res = (res*10) + (s.charAt(i) - 48);
                }
            }
            else{
                return -1;
            }
        }

        if(sign ==1){
            res = 0 -res;

        }
        return res;
    }


}
