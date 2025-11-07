
import java.util.*;
class same {
    public static void main(String[] args) {
        String str="java";
        String str1="vaaja";
        char ch[]=str.toCharArray();
                char ch1[]=str1.toCharArray();
                Arrays.sort(ch);
                  Arrays.sort(ch1);
                  String val1=new String(ch);
              String val2=new String(ch1);
              if (val1.equals(val2)){
                        System.out.println("true");
              }else{        System.out.println("false");
            }


              }
    }

