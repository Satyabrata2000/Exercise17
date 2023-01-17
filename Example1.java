package Exercise17;

//Compare two objects in java, equals() method and hashcode() method. Below is an Object Comparison example.

public class Example1 {

    public static void main(String[] args) {

        Double x = new Double(123.4567); //Creating constructor of the double class
        Long y = new Long(12345678);
        //invoking the equals() method
        System.out.println("Objects are not equal, hence it returns " + x.equals(y));
        System.out.println("Objects are equal, hence it returns " + x.equals(123.45));
    }
}
