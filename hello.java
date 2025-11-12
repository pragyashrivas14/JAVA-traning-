class Car{
    int a;
    Car(int a){
        this.a=a;
        System.out.println(a);
    }
}
class hello{
    public static void main (String[] args){
        Car obj=new Car(5);
    }
}
