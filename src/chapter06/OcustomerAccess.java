package chapter06;

public class OcustomerAccess {
    public static void main(String[] args) {
        String name = OCustomer.INSTANCE.getName();
        System.out.println(name);
    }
}
