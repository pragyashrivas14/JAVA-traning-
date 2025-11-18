 abstract class animal{
     abstract void eat();

}
class dog extends animal{
    void eat(){
      System.out.println("dog eat food");  
    }
}

public class abstraction {
    public static void main (String[] args){
    animal s1=new dog();
    s1.eat();
    }
    
    
}
