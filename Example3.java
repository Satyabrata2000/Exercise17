package Exercise17;

//Hashcode Example
public class Example3 {

    public static void main(String[] args) {

        Example2 obj1 = new Example2(1, "ABC"); //Creating two instances of the previous class
        Example2 obj2 = new Example2(2, "DEF");
        //invoking hashCode()
        int a = obj1.hashCode();
        int b = obj2.hashCode();
        System.out.println("hashcode of obj1 = " + a);
        System.out.println("hashcode of obj2 = " + b);
        System.out.println("Comparing objects obj1 and obj2 = " + obj1.equals(obj2) );
    }
}
