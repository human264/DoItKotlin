package chapter06.java;

public class KcustomerAccess {

    public static void main(String[] args) {

        Kjob kjob = Kcustomer.JOB;
        System.out.println(kjob.getTitle());

        Kcustomer.JOB.setTitle("Accountant");
        System.out.println(Kcustomer.JOB.getTitle());
    }
}
