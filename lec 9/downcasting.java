
class animal{
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends animal{
    void eat(){
        System.out.println("biryaani");

    }
    void data(){
        System.out.println("rice");
    }
}

 class downcasting {
   public static void main(String[] args) {
    Dog s1=new Dog();
    s1.eat();
    s1.data();
   }
}

