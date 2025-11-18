class animal{
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends animal{
    void eat(){
        System.out.println("biryaani");
    }
}

 class Main {
   public static void main(String[] args) {
    Dog s1=new Dog();
    s1.eat();
   }
}
