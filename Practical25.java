//  garbage collection in java
// this keyword in java
class A{
    int num;
    public A(int num){
        this.num = num;
    }
    public void display(){
        System.out.println("Number: " + this.num);
    }
}
public class Practical25 {
    public static void main(String[] args) {
        A obj = new A(10);
        obj.display();
        obj = null; // eligible for garbage collection
        System.gc(); // request for garbage collection
    }
}
