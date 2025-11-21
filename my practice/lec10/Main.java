// encapsulation =its means sava data 
//getter method =display data,for protrcting the data 
//setter method =change data,modification in total amount  
class ATM{
    private int totalbalance=10000;
    public void gettotalB(){
        System.out.println(totalbalance);
    }
public void setbalance(int amount){
if(amount>0 && totalbalance>=amount){
    totalbalance= totalbalance-amount;
    System.out.println(totalbalance);
}
}
}
 public class Main{
    public static void main(String[] args) {
        ATM s1=new ATM();
        s1.gettotalB();
        s1.setbalance(2000);
    }
 
}