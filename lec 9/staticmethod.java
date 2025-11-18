
class parent{
    static void staticmethod(){System.out.println("parent")}
    void instancemethod(){System.out.println("child")}
    String name="parent";
    }
}
class child {
        static void staticmethod(){System.out.println("parent")}
    void instancemethod(){System.out.println("child")}
    String name="hello";

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

